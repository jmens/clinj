package de.jmens.clinj.phone;

import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.exception.UnexpectedClinjException;
import de.jmens.clinj.log.SipLogger;
import de.jmens.clinj.model.Credentials;
import de.jmens.clinj.phone.call.CustomConfig;
import de.jmens.sipstack.Config;
import de.jmens.sipstack.FileLogger;
import de.jmens.sipstack.sip.core.useragent.SipListener;
import de.jmens.sipstack.sip.core.useragent.UserAgentImpl;
import java.io.IOException;
import java.net.SocketException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.Optional;
import org.slf4j.Logger;

public class UserAgentFactory {

	private static final Logger LOGGER = getLogger(UserAgentFactory.class);

	public static Optional<UserAgentImpl> initUserAgent(Credentials credentials, SipListener listener, String name) {
		try {
			final SipLogger logger = new SipLogger(name);

			final Config config = CustomConfig.buildConfig(credentials);

			final JavaxSoundManager soundManager = new JavaxSoundManager();

			return Optional.ofNullable(new UserAgentImpl(listener, config, logger, soundManager, name));
		} catch (SocketException e) {
			LOGGER.error("Failed to build user agent: {}", e.getMessage());
			return Optional.empty();
		}
	}

	public static Optional<UserAgentImpl> initUserAgent(String register, String secret, SipListener listener, String name) {
		return initUserAgent(new Credentials(register, secret), listener, name);
	}

	private static FileLogger buildLogger(String basedir) {
		try {
			Files.createDirectories(Paths.get(basedir, "logs"));
			return new FileLogger(basedir);
		} catch (IOException e) {
			throw new UnexpectedClinjException(MessageFormat.format("Cannot create log base dir {0}", basedir), e);
		}
	}
}
