package de.jmens.clinj.rest.client;

import static org.slf4j.LoggerFactory.getLogger;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.jmens.clinj.model.Contact;
import de.jmens.clinj.model.Credentials;
import de.jmens.clinj.model.Faxline;
import de.jmens.clinj.model.Phoneline;
import de.jmens.clinj.phone.call.CallImpl;
import de.jmens.clinq.client.ClinqRestClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;

public class ClinjApiClient {

	private static final Logger LOGGER = getLogger(ClinjApiClient.class);

	private static String apiHost = "local".equals(System.getProperty("clinq.local.api"))
			? "http://localhost:8080"
			: "https://clinj-api.jmens.de";

	private final ClinqRestClient clinqApiClient;

	public ClinjApiClient(String user, String password) {
		clinqApiClient = new ClinqRestClient(user, password);
	}

	public ClinjApiClient(Credentials credentials) {
		clinqApiClient = new ClinqRestClient(credentials.getUser(), credentials.getPassword());
	}

	public List<Phoneline> getPhonelines() {
		return clinqApiClient.getPhonelines();
	}

	public List<Faxline> getFaxlines() {
		return clinqApiClient.getFaxlines();
	}


	public boolean sendSms(String message, String recipient) {
		return clinqApiClient.sendSms(message, recipient);
	}

	public Optional<String> sendFax(Faxline faxline, String recipient, Path file) {
		try (InputStream input = Files.newInputStream(file)) {
			final String base64Content = Base64.getEncoder().encodeToString(read(input));
			return sendFax(faxline, recipient, base64Content, file.getFileName().toString());
		} catch (IOException e) {
			LOGGER.warn("Failed to read File {}", file);
			return Optional.empty();
		}
	}

	public Optional<String> sendFax(Faxline faxline, String recipient, InputStream base64Content, String filename) {
		try (InputStream input = base64Content) {
			final String content = new String(read(base64Content));
			return sendFax(faxline, recipient, content, filename);
		} catch (IOException e) {
			LOGGER.warn("Failed to read content stream: {}", e.getMessage());
			return Optional.empty();
		}
	}

	public Optional<String> sendFax(Faxline faxline, String recipient, String base64Content, String filename) {
		return clinqApiClient.sendFax(faxline, recipient, base64Content, filename);
	}


	public String initiateCall(String caller, String callee) {
		return clinqApiClient.initiateCall(caller, callee);
	}

	private byte[] read(InputStream input) {
		try (
				final ByteArrayOutputStream output = new ByteArrayOutputStream();
		) {
			byte[] buffer = new byte[4096];
			int length;

			while ((length = input.read(buffer)) > 0) {
				output.write(buffer, 0, length);
			}

			return output.toByteArray();
		} catch (IOException e) {
			LOGGER.warn("Cannot read from stream: {}", e.getMessage());
			return new byte[0];
		}
	}

	public void getHistory(Phoneline phoneline) {
	}

	public List<Contact> getContacts() {
		return null;
	}

	public void transfer(String callId, String callee) {
		clinqApiClient.transfer(callId, callee);
	}
}
