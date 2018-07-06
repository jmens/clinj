package de.jmens.clinj.phone;

import de.jmens.clinj.phone.call.Call;

/**
 * Represents an inbound startSynchronous.
 */
public interface InboundCall extends Call {

	/**
	 * Picks up an incoming startSynchronous.
	 */
	void pickup();
}
