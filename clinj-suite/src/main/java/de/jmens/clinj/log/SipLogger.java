package de.jmens.clinj.log;

import static org.apache.commons.lang3.StringUtils.isEmpty;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;


public class SipLogger implements de.jmens.sipstack.Logger {

	private static final Logger SIP_LOGGER = getLogger("de.jmens.trace.SipLogger");
	private static final Logger LOGGER = getLogger("de.jmens.trace.PhoneLogger");

	private String name;

	public SipLogger(String name) {
		this.name = name;
	}

	@Override
	public void debug(String message) {
		LOGGER.debug(prefix(message));
	}

	@Override
	public void info(String message) {
		LOGGER.debug(prefix(message));
	}

	@Override
	public void error(String message) {
		LOGGER.error(prefix(message));
	}

	@Override
	public void error(String message, Exception exception) {
		LOGGER.error(prefix(message), exception);
	}

	@Override
	public void traceNetwork(String message, String direction) {
		SIP_LOGGER.debug("<{}> {}", direction, prefix(message));
	}

	private String prefix(String message) {
		return isEmpty(name)
				? message
				: String.format("[%s] %s", name, message);
	}

}
