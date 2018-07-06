package de.jmens.clinj.api;

import de.jmens.clinj.model.Credentials;
import de.jmens.clinj.phone.ClinjPhone;
import de.jmens.clinj.suite.ClinjSuite;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public final class TestUtils {

	private static ClinjSuite suite;

	private static Map<Integer, ClinjSuite> suites = new HashMap<>();

	private static final ResourceBundle resources = ResourceBundle.getBundle("test");

	public static Credentials accountCredentials(String account) {
		return new Credentials(resources.getString(account + ".username"), resources.getString(account + ".password"));
	}

	public static Credentials sipCredentials(String phone) {
		return new Credentials(resources.getString(phone + ".sip.username"), resources.getString(phone + ".sip.password"));
	}

	public static ClinjSuite getDefaultSuite() {
		return getSuite(0);
	}

	public static ClinjSuite getSuite(int counter) {
		if (!suites.containsKey(counter)) {
			suites.put(counter, ClinjSuite.getSuite(accountCredentials("account" + counter)));
		}

		return suites.get(counter);
	}

	public static ClinjPhone getFirstPhone() {
		return getDefaultSuite().getPhone(getDefaultSuite().getPhonelines().get(0));
	}
}
