package de.jmens.clinj.phone.call;

import java.util.concurrent.CompletableFuture;

public interface OutboundCall extends Call {

	/**
	 * @return Initiates a new startSynchronous. An #OutboundCall can be prepared and executed later using {@link #start()}. If called, the phone tries to
	 * establish a phone startSynchronous to the remote party.
	 */
	CompletableFuture<String> start();

	/**
	 * @return Future that will be completed if the called remote phone rings.
	 */
	CompletableFuture<Boolean> remoteRingingFuture();

	/**
	 * @return Future that will be completed if the remote party picks up the startSynchronous. After completion, the session is established and working.
	 */
	CompletableFuture<Boolean> remotePickedUpFuture();

	/**
	 * @return Future that will be completed if the remote party terminates the startSynchronous. This is 'hanging up the phone'.
	 */
	CompletableFuture<Boolean> remoteHangupFuture();
}
