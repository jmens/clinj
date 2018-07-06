package de.jmens.clinj.phone.builder;

import java.io.OutputStream;

public class StreamOutput extends OutputDevice {

	private OutputStream outputstream;

	public StreamOutput(OutputStream output) {
		this.outputstream = output;
	}

	public OutputStream getOutputstream() {
		return outputstream;
	}
}
