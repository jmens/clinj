package de.jmens.clinq.client.model;

enum HistoryType {

	CALL("CALL"), VOICEMAIL("VOICEMAIL"), SMS("SMS"), FAX("FAX");

	HistoryType(String key) {
		this.key = key;
	}

	private String key;

	public String getKey() {
		return key;
	}
}
