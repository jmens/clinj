package de.jmens.clinj.phone;

import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.model.Phoneline;
import de.jmens.sipstack.sip.core.useragent.SipListener;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.TargetDataLine;
import org.slf4j.Logger;

public class PhoneFactory {

	private static final Logger LOGGER = getLogger(PhoneFactory.class);
	private static String register;
	private static byte[] secret;
	private SipListener sipListener;
	private String name;
	private List<OutputStream> speakerDumpStreams = new ArrayList<>();
	private List<OutputStream> microphoneDumpStreams = new ArrayList<>();
	private TargetDataLine microphoneDevice;
	private SourceDataLine speakerDevice;
	private boolean microhponeOverridden;
	private boolean speakerOverridden;

	public PhoneFactory(String register, byte[] secret) {
		this.register = register;
		this.secret = secret;
	}

	public static PhoneFactory newPhone(Phoneline phoneline) {
		return new PhoneFactory(phoneline.getUsername(), phoneline.getPassword().getBytes());
	}

	public static PhoneFactory newPhone(String register, byte[] secret) {
		return new PhoneFactory(register, secret);
	}

	public PhoneFactory setSipListener(SipListener sipListener) {
		this.sipListener = sipListener;
		return this;
	}

	public PhoneFactory setName(String name) {
		this.name = name;
		return this;
	}

	public PhoneFactory addMicrophoneDumpStream(OutputStream outputStream) {
		this.microphoneDumpStreams.add(outputStream);
		return this;
	}

	public PhoneFactory addSpeakerDumpStream(OutputStream outputStream) {
		this.speakerDumpStreams.add(outputStream);
		return this;
	}

	public void setMicrophoneDevice(TargetDataLine microphoneDevice) {
		microhponeOverridden = true;
		this.microphoneDevice = microphoneDevice;
	}

	public void setSpeakerDevice(SourceDataLine speakerDevice) {
		speakerOverridden = true;
		this.speakerDevice = speakerDevice;
	}
}
