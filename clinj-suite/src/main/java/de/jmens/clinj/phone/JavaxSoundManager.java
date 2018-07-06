/*
    This file is part of Peers, a java SIP softphone.

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

    Copyright 2010, 2011, 2012 Yohann Martineau
*/
package de.jmens.clinj.phone;

import static javax.sound.sampled.AudioSystem.NOT_SPECIFIED;
import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.exception.UnexpectedClinjException;
import de.jmens.clinj.phone.builder.OutputDevice;
import de.jmens.sipstack.media.AbstractSoundManager;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFileFormat.Type;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.TargetDataLine;
import org.slf4j.Logger;

public class JavaxSoundManager extends AbstractSoundManager {

	private AudioFormat audioFormat;

	/**
	 * The speaker
	 */
	private DataLine.Info sourceInfo = new DataLine.Info(SourceDataLine.class, audioFormat);
	private SourceDataLine speakerDevice;
	private Object sourceDataLineMutex = new Object();
	private List<OutputStream> speakerDumpStreams = new ArrayList<>();

	/**
	 * The Microphone
	 */
	private TargetDataLine microphoneDevice;
	private List<OutputStream> microphoneDumpStreams = new ArrayList<>();


	private DataLine.Info targetInfo;

	private List<OutputDevice> outputDevices = new ArrayList<>();


	private static final Logger LOGGER = getLogger(JavaxSoundManager.class);
	private AudioInputStream mircropohoneAudioInputStream;

	public JavaxSoundManager() {
		// linear PCM 8kHz, 16 bits signed, mono-channel, little endian
		audioFormat = new AudioFormat(8000, 16, 1, true, false);
		targetInfo = new DataLine.Info(TargetDataLine.class, audioFormat);
	}

	public void addSpeakerDumpStream(OutputStream stream) {
		speakerDumpStreams.add(stream);
	}

	public void addSpeakerDumpStreams(Collection<OutputStream> streams) {
		speakerDumpStreams.addAll(streams);
	}

	public void addmicrophoneDumpStream(OutputStream stream) {
		microphoneDumpStreams.add(stream);
	}

	public void addMicrophoneDumpStreams(Collection<OutputStream> streams) {
		microphoneDumpStreams.addAll(streams);
	}

	public void setMicrophoneDevice(TargetDataLine microphoneDevice) {
		this.microphoneDevice = microphoneDevice;
	}

	public TargetDataLine getMicrophoneDevice() {
		if (microphoneDevice == null) {
			try {
				LOGGER.debug("Initializing default microphone device");
				microphoneDevice = (TargetDataLine) AudioSystem.getLine(targetInfo);
			} catch (LineUnavailableException e) {
				throw new UnexpectedClinjException("Failed to get default target data line", e);
			}
		}
		return microphoneDevice;
	}

	public void setSpeakerDevice(SourceDataLine speakerDataLine) {
		this.speakerDevice = speakerDataLine;
	}

	public SourceDataLine getSpeakerDevice() {
		if (speakerDevice == null) {
			try {
				speakerDevice = (SourceDataLine) AudioSystem.getLine(sourceInfo);
			} catch (LineUnavailableException e) {
				throw new UnexpectedClinjException("Failed to get default source data line", e);
			}
		}
		return speakerDevice;
	}

	@Override
	public void init() {
		LOGGER.debug("Initializing  microphone device");

		initializeMicrohponeDevice(getMicrophoneDevice());

		LOGGER.debug("Initializing speaker device");

		initializeSpeakerDevice(getSpeakerDevice());

	}

	private void initializeMicrohponeDevice(TargetDataLine microphoneDevice) {
		AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
			try {
				microphoneDevice.open(audioFormat);
			} catch (Exception e) {
				LOGGER.error("Failed to open targetDataLine: {}", e.getMessage(), e);
				return null;
			}

			microphoneDevice.start();

			LOGGER.trace("Target data line initialized and started");
			return null;
		});
	}

	private void initializeSpeakerDevice(SourceDataLine speakerDevice) {
		AccessController.doPrivileged(
				(PrivilegedAction<Void>) () -> {
					synchronized (sourceDataLineMutex) {
						try {
							speakerDevice.open(audioFormat);
						} catch (LineUnavailableException e) {
							LOGGER.error("source line unavailable: {}", e.getMessage(), e);
							return null;
						}

						speakerDevice.start();

						LOGGER.trace("Source data line initialized and started");
					}
					return null;
				});
	}

	@Override
	public synchronized void close() {
		LOGGER.debug("Shutting down sound manager");

		speakerDumpStreams.forEach(stream -> close(stream));

		// AccessController.doPrivileged added for plugin compatibility
		AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
			close(getMicrophoneDevice());
			synchronized (sourceDataLineMutex) {
				if (getSpeakerDevice() != null) {
					getSpeakerDevice().drain();
					getSpeakerDevice().stop();
					getSpeakerDevice().close();
				}
			}
			return null;
		});
	}

	private void close(TargetDataLine line) {
		try {
			line.close();
		} catch (Exception e) {
			LOGGER.warn("Failed to close line", e);
		}
	}

	private void close(OutputStream stream) {
		try {
			stream.close();
		} catch (Exception e) {
			LOGGER.warn("Failed to close stream", e);
		}
	}

	/**
	 * Microphone data, this is: what the user speaks and should be sent to the remote party
	 */
	@Override
	public synchronized byte[] readData() {

		if (getMicrophoneDevice() == null) {
			return null;
		}

		int ready = getMicrophoneDevice().available();
		while (ready == 0) {
			try {
				Thread.sleep(2);
				ready = getMicrophoneDevice().available();
			} catch (InterruptedException e) {
				LOGGER.error("Target data line for microphone data did not get ready: {}", e.getMessage(), e);
				return null;
			}
		}

		byte[] buffer = new byte[ready];
		final int read = getMicrophoneDevice().read(buffer, 0, buffer.length);

		return buffer;
	}

	/**
	 * Speaker data. This is data the user wants to hear, sent by the remote party.
	 */
	@Override
	public int writeData(byte[] buffer, int offset, int length) {

		int numberOfBytesWritten;

		final SourceDataLine speakerDevice = getSpeakerDevice();

		if (speakerDevice == null) {
			return 0;
		}

		synchronized (speakerDevice) {
			numberOfBytesWritten = speakerDevice.write(buffer, offset, length);
		}

		return numberOfBytesWritten;
	}
}
