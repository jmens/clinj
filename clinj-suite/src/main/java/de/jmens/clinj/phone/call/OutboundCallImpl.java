package de.jmens.clinj.phone.call;

import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.exception.FailedToHangupException;
import de.jmens.clinj.exception.FailedToSendInviteException;
import de.jmens.clinj.model.SipContact;
import de.jmens.clinj.phone.CallContainer;
import de.jmens.clinj.phone.SipContactImpl;
import de.jmens.clinj.util.SipUtils;
import de.jmens.sipstack.sip.core.useragent.UserAgent;
import de.jmens.sipstack.sip.syntaxencoding.SipUriSyntaxException;
import de.jmens.sipstack.sip.transport.SipRequest;
import de.jmens.sipstack.sip.transport.SipResponse;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import org.slf4j.Logger;

public class OutboundCallImpl extends CallImpl implements OutboundCall {

	private static final Logger LOGGER = getLogger(OutboundCallImpl.class);

	private String callee;
	private SipRequest sipRequest;

	private CompletableFuture<Boolean> remoteRingingFuture = new CompletableFuture<>();
	private CompletableFuture<Boolean> remotePickupFuture = new CompletableFuture<>();

	private Function<Void, Boolean> mayCall;

	public OutboundCallImpl(UserAgent userAgent, String callee, Function<Void, Boolean> mayCall, CallContainer releaser) {
		super(userAgent, releaser);
		this.callee = callee;
		this.mayCall = mayCall;
	}

	public CompletableFuture<String> start() {
		return CompletableFuture.supplyAsync(() -> startSynchronous());
	}

	public String startSynchronous() {
		try {
			setActive();
			String remoteParty = SipUtils.buildSipUri(callee);
			LOGGER.debug("Starting call to {}. Sending invite to {}", callee, remoteParty);
			sipRequest = userAgent.invite(remoteParty, null);
			return getCallId();
		} catch (SipUriSyntaxException e) {
			setInactive();
			throw new FailedToSendInviteException(e);
		}
	}

	public CompletableFuture<Void> hangup() {
		return CompletableFuture.supplyAsync(() -> {
			hangupSynchronous();
			return null;
		});
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

	public CompletableFuture<Boolean> remoteRingingFuture() {
		return remoteRingingFuture;
	}

	public CompletableFuture<Boolean> remotePickedUpFuture() {
		return remotePickupFuture;
	}

	public void fireRemoteRinging(String callId) {
		CompletableFuture<Boolean> oldFuture = remoteRingingFuture;
		remoteRingingFuture = new CompletableFuture<>();
		oldFuture.complete(true);
	}

	public void fireRemotePickUp() {
		CompletableFuture<Boolean> oldFuture = remotePickupFuture;
		remotePickupFuture = new CompletableFuture<>();
		oldFuture.complete(true);
	}

	public void error(SipResponse sipResponse) {

	}
}
