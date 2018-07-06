package de.jmens.clinj.phone.builder;

import de.jmens.clinj.model.Phoneline;
import de.jmens.clinj.phone.ClinjPhone;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Builder class that provides control over every configurable part of the {@link ClinjPhone} initialization.
 */
public class ClinjPhoneBuilder implements ClinjPhoneBuilderFinalStage {

	/**
	 * Starts {@link ClinjPhone} instantiation and provides interfaces to configure every aspect of the phone.
	 * Fionish the instantiation with {@link #build()}.
	 * @param username Username to register the phone
	 * @param password Password to register the phone
	 * @return A new PhoneBuilder instance.
	 */
	public static ClinjPhoneBuilder newBuilder(String username, byte[] password) {
		return new ClinjPhoneBuilder(username, password);
	}

	/**
	 * Starts {@link ClinjPhone} instantiation and provides interfaces to configure every aspect of the phone.
	 * Fionish the instantiation with {@link #build()}.
	 * @param username Username to register the phone
	 * @param password Password to register the phone
	 * @return A new PhoneBuilder instance.
	 */
	public static ClinjPhoneBuilder newBuilder(String username, String password) {
		return new ClinjPhoneBuilder(username, password.getBytes());
	}

	/**
	 * Starts {@link ClinjPhone} instantiation and provides interfaces to configure every aspect of the phone.
	 * Fionish the instantiation with {@link #build()}.
	 * @param phoneline {@link Phoneline} to register to.
	 * @return A new PhoneBuilder instance.
	 */
	public static ClinjPhoneBuilder newBuilder(Phoneline phoneline) {
		return new ClinjPhoneBuilder(phoneline.getUsername(), phoneline.getPassword().getBytes());
	}

	private String username;
	private byte[] password;
	private List<OutputDevice> outputDevices = new ArrayList<>();

	public ClinjPhoneBuilder(String username, byte[] password) {
		this.username = username;
		this.password = password;
	}


	@Override
	public ClinjPhoneBuilderFinalStage withOutputs(Collection<OutputDevice> outputDevices) {
		this.outputDevices.addAll(outputDevices);
		return this;
	}

	@Override
	public ClinjPhoneBuilderFinalStage withOutputs(Outputs outputs) {
		outputDevices.addAll(outputs.getOutputDevices());
		return this;
	}

	@Override
	public ClinjPhoneBuilderFinalStage withOutputDevice(OutputDevice outputDevice) {
		outputDevices.add(outputDevice);
		return this;
	}

	@Override
	public ClinjPhoneBuilderFinalStage withDefaultOuptut() {
		outputDevices.add(OutputDevice.DEFAULT_DEVICE);
		return this;
	}

	@Override
	public ClinjPhone build() {
		return null;
//		return ((ClinjPhoneImpl)ClinjPhoneImpl.newPhone(username, password))
//				.addOutputDevices(outputDevices);
	}
}
