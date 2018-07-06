package de.jmens.sipstack.sip.core.useragent;

import de.jmens.sipstack.sip.syntaxencoding.SipUriSyntaxException;
import de.jmens.sipstack.sip.transactionuser.Dialog;
import de.jmens.sipstack.sip.transactionuser.DialogManager;
import de.jmens.sipstack.sip.transport.SipRequest;
import de.jmens.sipstack.sip.transport.SipResponse;
import java.util.concurrent.CompletableFuture;

public interface UserAgent {

	SipRequest invite(String remoteParty, String callId) throws SipUriSyntaxException;

	void terminate(SipRequest sipRequest);

	boolean isBusy();

	DialogManager getDialogManager();

	void acceptCall(SipRequest sipRequest, Dialog dialog);

	void addSipListener(SipListener sipListener);

	void removeSipListener(SipListener sipListener);

	CompletableFuture<SipResponse> register();

	void unregister();

	boolean isRegistered();

	String getName();
}
