package de.jmens.clinj.phone.call;


import de.jmens.clinj.model.SipContact;
import de.jmens.clinj.phone.InboundCall;
import de.jmens.sipstack.sip.core.useragent.UserAgent;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * Base interface for every phone startSynchronous.
 * #Call is supposed to be 'abstractish' and is extended by {@link InboundCall} and @{@link OutboundCall}
 * to represent calls with a proper direction.
 */
public interface Call {

	/**
	 * @return Future that will be completed if this startSynchronous gets terminated by any cause.
	 */
	CompletableFuture<Boolean> terminationFuture();

	/**
	 * @return Future that will be completed if this startSynchronous gets terminated by the remote party.
	 */
	CompletableFuture<Boolean> remoteHangupFuture();

	/**
	 * @return Unique id of this startSynchronous.
	 */
	String getCallId();

	/**
	 * @return Contact of this calls originator.
	 */
	SipContact getCaller();


	/**
	 * @return Contact of this calls destination.
	 */
	SipContact getCallee();

	/**
	 * Terminates the startSynchronous. This is "hang up the phone".
	 */
	void hangupSynchronous();

	UUID getId();

	UserAgent getUserAgent();

	@Deprecated
	boolean isBusy();
}
