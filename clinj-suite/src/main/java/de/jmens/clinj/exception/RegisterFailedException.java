package de.jmens.clinj.exception;

import de.jmens.sipstack.sip.transport.SipResponse;

public class RegisterFailedException extends UnexpectedClinjException {

	private SipResponse sipResponse;

	public RegisterFailedException(SipResponse sipResponse) {
		this.sipResponse = sipResponse;
	}

	public RegisterFailedException(SipResponse sipResponse, Throwable e) {
		super(e);
		this.sipResponse = sipResponse;
	}

	public SipResponse getSipResponse() {
		return sipResponse;
	}
}
