package de.jmens.clinj.phone.call;

import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.model.SipContact;
import de.jmens.clinj.phone.CallContainer;
import de.jmens.clinj.phone.InboundCall;
import de.jmens.clinj.phone.SipContactImpl;
import de.jmens.clinj.util.SipUtils;
import de.jmens.sipstack.sip.Utils;
import de.jmens.sipstack.sip.core.useragent.UserAgent;
import de.jmens.sipstack.sip.transactionuser.Dialog;
import de.jmens.sipstack.sip.transactionuser.DialogManager;
import de.jmens.sipstack.sip.transport.SipRequest;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;

public class InboundCallImpl extends CallImpl implements InboundCall {

	private static final Logger LOGGER = getLogger(InboundCallImpl.class);

	private SipRequest sipRequest;
	private CompletableFuture<Boolean> remoteRingingFuture = new CompletableFuture<>();
	private CompletableFuture<Boolean> remotePickupFuture = new CompletableFuture<>();
	private CompletableFuture<Boolean> terminationFuture = new CompletableFuture<>();

	public InboundCallImpl(UserAgent userAgent, SipRequest sipRequest, CallContainer releaser) {
		super(userAgent, releaser);
		this.sipRequest = sipRequest;
	}

	public void pickup() {
		setActive();
		final String callId = Utils.getMessageCallId(sipRequest);
		final DialogManager dialogManager = userAgent.getDialogManager();
		final Dialog dialog = dialogManager.getDialog(callId);

		userAgent.acceptCall(sipRequest, dialog);
	}

	public String getCallId() {
		return SipUtils.callId(sipRequest).toString();
	}

	@Override
	public SipContact getCaller() {
		return new SipContactImpl(SipUtils.getContact(sipRequest));
	}

	@Override
	public SipContact getCallee() {
		return new SipContactImpl(SipUtils.getTo(sipRequest));
	}

	@Override
	public CompletableFuture<Boolean> terminationFuture() {
		return terminationFuture;
	}

	public void hangupSynchronous() {
		try {
			LOGGER.debug("Hangup - Call-Id: {}", getCallId());
			userAgent.terminate(sipRequest);
			setActive();
			shutdown();
			fireTerminationFuture();
		} catch (Exception e) {
			LOGGER.error("Failed to hangup: {}", e.getMessage(), e);
		}
	}
}
