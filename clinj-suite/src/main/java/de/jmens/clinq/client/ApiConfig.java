package de.jmens.clinq.client;

public class ApiConfig {
	private static final String API_BASE_URL = "https://api.sipgate.com/v2";

	public static String getApiBaseUrl() {
		if (System.getenv().containsKey("clinj.apiurl")) {
			return System.getenv("clinj.apiurl");
		} else {
			return API_BASE_URL;
		}
	}
}
