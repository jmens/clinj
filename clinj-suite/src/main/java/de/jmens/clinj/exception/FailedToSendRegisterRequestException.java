package de.jmens.clinj.exception;

import de.jmens.clinj.exception.UnexpectedClinjException;
import de.jmens.sipstack.sip.syntaxencoding.SipUriSyntaxException;

public class FailedToSendRegisterRequestException extends UnexpectedClinjException {

	public FailedToSendRegisterRequestException(SipUriSyntaxException e) {
		super(e);
	}
}
