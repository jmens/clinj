package de.jmens.sipstack.sip.core.useragent;

import de.jmens.clinj.phone.UserAgentManager;
import de.jmens.sipstack.sip.syntaxencoding.SipUriSyntaxException;
import de.jmens.sipstack.sip.transactionuser.Dialog;
import de.jmens.sipstack.sip.transactionuser.DialogManager;
import de.jmens.sipstack.sip.transport.SipRequest;
import de.jmens.sipstack.sip.transport.SipResponse;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class UserAgentProxy implements UserAgent {

	private UserAgentManager userAgentManager;
	private UserAgent userAgent;

	public UserAgentProxy(UserAgentManager userAgentManager) {
		this.userAgentManager = userAgentManager;
	}

	private UserAgent getUserAgent() {
		if (userAgent == null) {
			userAgent = userAgentManager.getInstance().get();
		}
		return userAgent;
	}

	@Override
	public SipRequest invite(String remoteParty, String callId) throws SipUriSyntaxException {
		return getUserAgent().invite(remoteParty, callId);
	}

	@Override
	public void terminate(SipRequest sipRequest) {
		getUserAgent().terminate(sipRequest);
	}

	@Override
	public boolean isBusy() {
		return getUserAgent().isBusy();
	}

	@Override
	public DialogManager getDialogManager() {
		return getUserAgent().getDialogManager();
	}

	@Override
	public void acceptCall(SipRequest sipRequest, Dialog dialog) {
		getUserAgent().acceptCall(sipRequest, dialog);
	}

	@Override
	public void addSipListener(SipListener sipListener) {
		getUserAgent().addSipListener(sipListener);
	}

	@Override
	public void removeSipListener(SipListener sipListener) {
		getUserAgent().removeSipListener(sipListener);
	}

	@Override
	public CompletableFuture<SipResponse> register() {
		return getUserAgent().register();
	}

	@Override
	public void unregister() {
		getUserAgent().unregister();
	}

	@Override
	public boolean isRegistered() {
		return getUserAgent().isRegistered();
	}

	@Override
	public String getName() {
		return getUserAgent().getName();
	}

	public Optional<UserAgent> getInternal() {
		return Optional.ofNullable(this.userAgent);
	}
}
