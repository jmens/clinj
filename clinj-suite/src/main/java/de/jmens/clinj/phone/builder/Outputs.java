package de.jmens.clinj.phone.builder;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.sound.sampled.TargetDataLine;

public class Outputs {

	public static Outputs newCollection() {
		return new Outputs();
	}

	public static OutputDevice streamDevice(OutputStream output) {
		return new StreamOutput(output);
	}

	public static OutputDevice audioDevice(TargetDataLine targetDataLine) {
		return new JavaxSoundAudioDevice(targetDataLine);
	}

	private List<OutputDevice> outputDevices = new ArrayList<>();

	private Outputs() {
		super();
	}

	public Outputs add(TargetDataLine output) {
		outputDevices.add(audioDevice(output));
		return this;
	}

	public Outputs add(OutputStream output) {
		outputDevices.add(streamDevice(output));
		return this;
	}

	Collection<OutputDevice> getOutputDevices() {
		return this.outputDevices;
	}

}
