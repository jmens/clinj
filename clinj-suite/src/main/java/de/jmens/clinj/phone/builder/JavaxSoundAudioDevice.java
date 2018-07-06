package de.jmens.clinj.phone.builder;

import javax.sound.sampled.TargetDataLine;

public class JavaxSoundAudioDevice extends OutputDevice {

	private TargetDataLine targetDataLine;

	public JavaxSoundAudioDevice(TargetDataLine line) {
		targetDataLine = line;
	}

	public TargetDataLine getTargetDataLine() {
		return targetDataLine;
	}
}
