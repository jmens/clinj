package de.jmens.clinj.phone.builder;

import static java.text.MessageFormat.format;
import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.exception.UnexpectedClinjException;
import java.util.Optional;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.TargetDataLine;
import org.slf4j.Logger;

public abstract class OutputDevice {

	private static final Logger LOGGER = getLogger(OutputDevice.class);

	public static final OutputDevice DEFAULT_DEVICE;

	static {
		DEFAULT_DEVICE = getDefaultTargetDataLine()
				.map(line -> new JavaxSoundAudioDevice(line))
				.orElseThrow(() -> new UnexpectedClinjException(
						format("Unable to get javax audio line. Please consult logs produced by {0}",
								OutputDevice.class.getName())));
	}

	private static Optional<TargetDataLine> getDefaultTargetDataLine()  {
		try {
			// linear PCM 8kHz, 16 bits signed, mono-channel, little endian
			final AudioFormat audioFormat = new AudioFormat(8000, 16, 1, true, false);
			final Info info = new Info(TargetDataLine.class, audioFormat);
			final TargetDataLine line = (TargetDataLine) AudioSystem.getLine(info);
			line.open(audioFormat);

			return Optional.of(line);

		} catch (Exception e) {
			LOGGER.error("Unable to get AudioDataLine: ", e.getMessage(),  e);

			return Optional.empty();
		}
	}
}
