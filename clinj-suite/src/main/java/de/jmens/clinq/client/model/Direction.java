package de.jmens.clinq.client.model;

enum Direction {
	INCOMING("INCOMING"),
	OUTGOING("OUTGOING"),
	MISSED_INCOMING("MISSED_INCOMING"),
	MISSED_OUTGOING("MISSED_OUTGOING");

	Direction(String key) {
		this.key = key;
	}

	private String key;

	public String getKey() {
		return key;
	}
}

