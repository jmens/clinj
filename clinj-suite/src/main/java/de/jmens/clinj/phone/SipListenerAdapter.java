package de.jmens.clinj.phone;

import de.jmens.sipstack.sip.core.useragent.SipListener;
import de.jmens.sipstack.sip.transport.SipRequest;
import de.jmens.sipstack.sip.transport.SipResponse;

public class SipListenerAdapter implements SipListener {

	@Override
	public void registering(SipRequest sipRequest) {

	}

	@Override
	public void registerSuccessful(SipResponse sipResponse) {

	}

	@Override
	public void registerFailed(SipResponse sipResponse) {

	}

	@Override
	public void incomingCall(SipRequest sipRequest, SipResponse provResponse) {

	}

	@Override
	public void remoteHangup(SipRequest sipRequest) {

	}

	@Override
	public void ringing(SipResponse sipResponse) {

	}

	@Override
	public void calleePickup(SipResponse sipResponse) {

	}

	@Override
	public void error(SipResponse sipResponse) {

	}
}
