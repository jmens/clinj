package de.jmens.clinj.log;

import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.slf4j.Marker;

public class MediaLogger implements Logger {

	private static final Logger LOGGER = getLogger(MediaLogger.class);

	@Override
	public  String getName() {
		return LOGGER.getName();
	}

	@Override
	public  boolean isTraceEnabled() {
		return LOGGER.isTraceEnabled();
	}

	@Override
	public  void trace(String s) {
		LOGGER.trace(s);
	}

	@Override
	public  void trace(String s, Object o) {
		LOGGER.trace(s, o);
	}

	@Override
	public  void trace(String s, Object o, Object o1) {
		LOGGER.trace(s, o, o1);
	}

	@Override
	public  void trace(String s, Object... objects) {
		LOGGER.trace(s, objects);
	}

	@Override
	public  void trace(String s, Throwable throwable) {
		LOGGER.trace(s, throwable);
	}

	@Override
	public  boolean isTraceEnabled(Marker marker) {
		return LOGGER.isTraceEnabled(marker);
	}

	@Override
	public  void trace(Marker marker, String s) {
		LOGGER.trace(marker, s);
	}

	@Override
	public  void trace(Marker marker, String s, Object o) {
		LOGGER.trace(marker, s, o);
	}

	@Override
	public  void trace(Marker marker, String s, Object o, Object o1) {
		LOGGER.trace(marker, s, o, o1);
	}

	@Override
	public  void trace(Marker marker, String s, Object... objects) {
		LOGGER.trace(marker, s, objects);
	}

	@Override
	public  void trace(Marker marker, String s, Throwable throwable) {
		LOGGER.trace(marker, s, throwable);
	}

	@Override
	public  boolean isDebugEnabled() {
		return LOGGER.isDebugEnabled();
	}

	@Override
	public  void debug(String s) {
		LOGGER.debug(s);
	}

	@Override
	public  void debug(String s, Object o) {
		LOGGER.debug(s, o);
	}

	@Override
	public  void debug(String s, Object o, Object o1) {
		LOGGER.debug(s, o, o1);
	}

	@Override
	public  void debug(String s, Object... objects) {
		LOGGER.debug(s, objects);
	}

	@Override
	public  void debug(String s, Throwable throwable) {
		LOGGER.debug(s, throwable);
	}

	@Override
	public  boolean isDebugEnabled(Marker marker) {
		return LOGGER.isDebugEnabled(marker);
	}

	@Override
	public  void debug(Marker marker, String s) {
		LOGGER.debug(marker, s);
	}

	@Override
	public  void debug(Marker marker, String s, Object o) {
		LOGGER.debug(marker, s, o);
	}

	@Override
	public  void debug(Marker marker, String s, Object o, Object o1) {
		LOGGER.debug(marker, s, o, o1);
	}

	@Override
	public  void debug(Marker marker, String s, Object... objects) {
		LOGGER.debug(marker, s, objects);
	}

	@Override
	public  void debug(Marker marker, String s, Throwable throwable) {
		LOGGER.debug(marker, s, throwable);
	}

	@Override
	public  boolean isInfoEnabled() {
		return LOGGER.isInfoEnabled();
	}

	@Override
	public  void info(String s) {
		LOGGER.info(s);
	}

	@Override
	public  void info(String s, Object o) {
		LOGGER.info(s, o);
	}

	@Override
	public  void info(String s, Object o, Object o1) {
		LOGGER.info(s, o, o1);
	}

	@Override
	public  void info(String s, Object... objects) {
		LOGGER.info(s, objects);
	}

	@Override
	public  void info(String s, Throwable throwable) {
		LOGGER.info(s, throwable);
	}

	@Override
	public  boolean isInfoEnabled(Marker marker) {
		return LOGGER.isInfoEnabled(marker);
	}

	@Override
	public  void info(Marker marker, String s) {
		LOGGER.info(marker, s);
	}

	@Override
	public  void info(Marker marker, String s, Object o) {
		LOGGER.info(marker, s, o);
	}

	@Override
	public  void info(Marker marker, String s, Object o, Object o1) {
		LOGGER.info(marker, s, o, o1);
	}

	@Override
	public  void info(Marker marker, String s, Object... objects) {
		LOGGER.info(marker, s, objects);
	}

	@Override
	public  void info(Marker marker, String s, Throwable throwable) {
		LOGGER.info(marker, s, throwable);
	}

	@Override
	public  boolean isWarnEnabled() {
		return LOGGER.isWarnEnabled();
	}

	@Override
	public  void warn(String s) {
		LOGGER.warn(s);
	}

	@Override
	public  void warn(String s, Object o) {
		LOGGER.warn(s, o);
	}

	@Override
	public  void warn(String s, Object... objects) {
		LOGGER.warn(s, objects);
	}

	@Override
	public  void warn(String s, Object o, Object o1) {
		LOGGER.warn(s, o, o1);
	}

	@Override
	public  void warn(String s, Throwable throwable) {
		LOGGER.warn(s, throwable);
	}

	@Override
	public  boolean isWarnEnabled(Marker marker) {
		return LOGGER.isWarnEnabled(marker);
	}

	@Override
	public  void warn(Marker marker, String s) {
		LOGGER.warn(marker, s);
	}

	@Override
	public  void warn(Marker marker, String s, Object o) {
		LOGGER.warn(marker, s, o);
	}

	@Override
	public  void warn(Marker marker, String s, Object o, Object o1) {
		LOGGER.warn(marker, s, o, o1);
	}

	@Override
	public  void warn(Marker marker, String s, Object... objects) {
		LOGGER.warn(marker, s, objects);
	}

	@Override
	public  void warn(Marker marker, String s, Throwable throwable) {
		LOGGER.warn(marker, s, throwable);
	}

	@Override
	public  boolean isErrorEnabled() {
		return LOGGER.isErrorEnabled();
	}

	@Override
	public  void error(String s) {
		LOGGER.error(s);
	}

	@Override
	public  void error(String s, Object o) {
		LOGGER.error(s, o);
	}

	@Override
	public  void error(String s, Object o, Object o1) {
		LOGGER.error(s, o, o1);
	}

	@Override
	public  void error(String s, Object... objects) {
		LOGGER.error(s, objects);
	}

	@Override
	public  void error(String s, Throwable throwable) {
		LOGGER.error(s, throwable);
	}

	@Override
	public  boolean isErrorEnabled(Marker marker) {
		return LOGGER.isErrorEnabled(marker);
	}

	@Override
	public  void error(Marker marker, String s) {
		LOGGER.error(marker, s);
	}

	@Override
	public  void error(Marker marker, String s, Object o) {
		LOGGER.error(marker, s, o);
	}

	@Override
	public  void error(Marker marker, String s, Object o, Object o1) {
		LOGGER.error(marker, s, o, o1);
	}

	@Override
	public  void error(Marker marker, String s, Object... objects) {
		LOGGER.error(marker, s, objects);
	}

	@Override
	public  void error(Marker marker, String s, Throwable throwable) {
		LOGGER.error(marker, s, throwable);
	}
}
