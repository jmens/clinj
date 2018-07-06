package de.jmens.clinj.exception;

import de.jmens.sipstack.sip.syntaxencoding.SipUriSyntaxException;

public class FailedToSendInviteException extends UnexpectedClinjException {

	public FailedToSendInviteException(SipUriSyntaxException e) {
		super("Failed to send invite", e);
	}
}
