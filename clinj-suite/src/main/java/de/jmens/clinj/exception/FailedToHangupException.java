package de.jmens.clinj.exception;

import de.jmens.clinj.exception.UnexpectedClinjException;

public class FailedToHangupException extends UnexpectedClinjException {

	public FailedToHangupException(Exception e) {
		super("Failed to send hangup", e);
	}
}
