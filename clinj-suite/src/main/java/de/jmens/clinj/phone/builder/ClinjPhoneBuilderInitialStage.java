package de.jmens.clinj.phone.builder;

import java.util.Collection;
import java.util.List;

public interface ClinjPhoneBuilderInitialStage {

	ClinjPhoneBuilderFinalStage withOutputs(Collection<OutputDevice> outputDevices);

	ClinjPhoneBuilderFinalStage withOutputs(Outputs outputs);

	ClinjPhoneBuilderFinalStage withOutputDevice(OutputDevice outputDevice);

	ClinjPhoneBuilderFinalStage withDefaultOuptut();
}
