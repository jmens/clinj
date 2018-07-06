package de.jmens.clinj.phone.call;

import static org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.phone.CallContainer;
import de.jmens.clinj.util.SipUtils;
import de.jmens.sipstack.sip.core.useragent.UserAgent;
import de.jmens.sipstack.sip.core.useragent.UserAgentImpl;
import de.jmens.sipstack.sip.transport.SipRequest;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class CallImpl implements Call {

	private static final Logger LOGGER = getLogger(CallImpl.class);
	private CallContainer releaser;

	protected UserAgent userAgent;

	private UUID id = UUID.randomUUID();
	private CompletableFuture<Boolean> terminationFuture = new CompletableFuture<>();
	private CompletableFuture<Boolean> remoteHangupFuture = new CompletableFuture<>();

	private boolean active;

	public CallImpl(UserAgentImpl userAgent) {
		this.userAgent = userAgent;
		this.releaser = new CallContainer() {
			@Override
			public void decommission(Call call) {}
		};
	}

	public CallImpl(UserAgent userAgent, CallContainer releaser) {
		this.userAgent = userAgent;
		this.releaser = releaser;
	}

	public abstract String getCallId();

	public abstract void hangupSynchronous();


	public CompletableFuture<Boolean> terminationFuture() {
		return terminationFuture;
	}

	public void fireRemoteHangup() {
		CompletableFuture<Boolean> oldFuture = remoteHangupFuture;
		remoteHangupFuture = new CompletableFuture<>();
		oldFuture.complete(true);
	}

	public void fireTerminationFuture() {
		try {
			CompletableFuture<Boolean> oldFuture = terminationFuture;
			terminationFuture = new CompletableFuture<>();
			oldFuture.complete(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public CompletableFuture<Boolean> remoteHangupFuture() {
		return remoteHangupFuture;
	}

	public void remoteHangup(SipRequest sipRequest) {
		LOGGER.debug("Remote party sent hangup - Call ID {}", SipUtils.callId(sipRequest));

		userAgent.terminate(sipRequest);

		releaser.decommission(this);

		setInactive();
		fireRemoteHangup();
		fireTerminationFuture();
	}

	public UUID getId() {
		return id;
	}

	/**
	 * @deprecated remove if UserAgent.isBusy turns out to work sufficiently
	 */
	@Deprecated
	protected void setActive() {
		active = true;
	}

	/**
	 * @deprecated remove if UserAgent.isBusy turns out to work sufficiently
	 */
	@Deprecated
	protected void setInactive() {
		active = false;
	}

	@Override
	public boolean isBusy() {
		return userAgent.isBusy();
	}

	public void shutdown() {
		releaser.decommission(this);
	}

	public UserAgent getUserAgent() {
		return userAgent;
	}

	@Override
	public String toString() {
		return reflectionToString(this, SHORT_PREFIX_STYLE);
	}

	@Override
	public boolean equals(final Object o) {
		return reflectionEquals(this, o);
	}

	@Override
	public int hashCode() {
		return reflectionHashCode(this);
	}
}
