package de.jmens.clinj.suite;

import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.model.Contact;
import de.jmens.clinj.model.Credentials;
import de.jmens.clinj.model.Faxline;
import de.jmens.clinj.model.Phoneline;
import de.jmens.clinj.model.phonenumber.Phonenumber;
import de.jmens.clinj.model.phonenumber.QuickdialNumber;
import de.jmens.clinj.phone.ClinjPhone;
import de.jmens.clinj.rest.client.ClinjApiClient;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class ClinjSuite {

	private static final Logger LOGGER = getLogger(ClinjSuite.class);


	public static ClinjSuite getSuite(String username, byte[] password) {
		return new ClinjSuite(username, password);
	}

	public static ClinjSuite getSuite(Credentials credentials) {
		return new ClinjSuite(credentials);
	}

	private ClinjApiClient api;

	public ClinjSuite(String username, String password) {
		this.api = new ClinjApiClient(new Credentials(username, password));
	}

	public ClinjSuite(String username, byte[] password) {
		this.api = new ClinjApiClient(new Credentials(username, password));
	}

	public ClinjSuite(Credentials credentials) {
		this.api = new ClinjApiClient(credentials);
	}

	public List<Phoneline> getPhonelines() {
		return api.getPhonelines();
	}

	// TODO: Rename to getPhonelins after removing existing one
	// TODO: return sorted map
	public Map<String, Phoneline> getPhonelineMap() {
		return api.getPhonelines()
				.stream()
				.collect(Collectors.toMap(line -> line.getId(), line -> line));
	}

	public List<Faxline> getFaxlines() {
		return api.getFaxlines();
	}

	public boolean sendSms(String message, String recipient) {
		return api.sendSms(message, recipient);
	}

	public Optional<String> sendFax(Faxline faxline, String recipient, Path pdf) {
		return api.sendFax(faxline, recipient, pdf);
	}

	public ClinjPhone getPhone(Phoneline phoneline) {
		return getPhone(phoneline, 1);
	}

	public ClinjPhone getPhone(Phoneline phoneline, int instances) {

		List<Phonenumber> incomingNumbers = new ArrayList<>();
		incomingNumbers.addAll(phoneline.getLandlineNumbers());
		incomingNumbers.addAll(phoneline.getMobileNumbers());

		return getPhone(new Credentials(phoneline.getUsername(), phoneline.getPassword()), instances, phoneline.getFullId(), incomingNumbers, phoneline.getQuickdialNumbers());
	}

	private ClinjPhone getPhone(Credentials credentials, int instances, String name, List<Phonenumber> incomingNumbers, List<QuickdialNumber> quickdialNumbers) {
		return ClinjPhone.getPhone(credentials, instances, name, incomingNumbers, quickdialNumbers);
	}

	public List<Contact> getContacts() {
		return api.getContacts();
	}

	public Optional<ClinjPhone> getPhone(String phonelineId) {
		final Map<String, Phoneline> phonelines = getPhonelineMap();
		if (phonelines.containsKey(phonelineId)) {
			return Optional.of(getPhone(phonelines.get(phonelineId)));
		}
		return Optional.empty();
	}

	public void transfer(String callId, String callee) {
		api.transfer(callId, callee);
	}

	public String initiateCall(String caller, String callee) {
		return api.initiateCall(caller, callee);
	}
}
