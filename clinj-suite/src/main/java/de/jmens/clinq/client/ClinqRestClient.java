package de.jmens.clinq.client;

import static de.jmens.clinq.client.converter.FaxlineMapper.toFaxline;
import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.model.Contact;
import de.jmens.clinj.model.Credentials;
import de.jmens.clinj.model.Faxline;
import de.jmens.clinj.model.Phoneline;
import de.jmens.clinj.model.phonenumber.LandlineNumber;
import de.jmens.clinj.model.phonenumber.MobileNumber;
import de.jmens.clinj.model.phonenumber.Phonenumber;
import de.jmens.clinj.model.Profile;
import de.jmens.clinj.model.phonenumber.QuickdialNumber;
import de.jmens.clinq.client.converter.ContactMapper;
import io.swagger.api.AuthorizationApi;
import io.swagger.api.ContactsApi;
import io.swagger.api.DevicesApi;
import io.swagger.api.FaxlinesApi;
import io.swagger.api.HistoryApi;
import io.swagger.api.NumbersApi;
import io.swagger.api.RtcmApi;
import io.swagger.api.SessionsApi;
import io.swagger.api.SmsApi;
import io.swagger.model.CredentialsResponse;
import io.swagger.model.DeviceResponse;
import io.swagger.model.DeviceResponse.TypeEnum;
import io.swagger.model.DevicesResponse;
import io.swagger.model.Extension;
import io.swagger.model.FaxlinesResponse;
import io.swagger.model.HistoryEntryResponse;
import io.swagger.model.HistoryResponse;
import io.swagger.model.InitiateNewCallSessionResponse;
import io.swagger.model.NewCallRequest;
import io.swagger.model.NumbersResponse;
import io.swagger.model.SendFaxRequest;
import io.swagger.model.SendFaxSessionResponse;
import io.swagger.model.SendWebSmsRequest;
import io.swagger.model.SmsExtensionResponse;
import io.swagger.model.TransferRequest;
import io.swagger.model.UserinfoResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;

public class ClinqRestClient {

	private static final Logger LOGGER = getLogger(ClinqRestClient.class);

	private final Credentials credentials;
	private final ClinqApiProvider apiProvider;

	/**
	 * Lazy initialized by {@link #getUserId()}
	 */
	private String userId;
	private String masterSipid;

	public ClinqRestClient(Credentials credentials) {
		this.credentials = credentials;
		this.apiProvider = new ClinqApiProvider(credentials);
	}

	private final Map<Class<?>, Object> apis = new ConcurrentHashMap<>();

	public ClinqRestClient(String user, String password) {
		this(new Credentials(user, password));
	}

	public ClinqRestClient(String user, byte[] password) {
		this(new Credentials(user, password));
	}

	public List<Phoneline> getPhonelines() {
		final String userId = getUserId();

		final NumbersResponse numbers = getApi(NumbersApi.class).getUserNumbers(userId);
		final List<Phonenumber> incomingNumbers = numbers
				.getItems()
				.stream()
				.map(item -> {
					switch (item.getType()) {
						case MOBILE:
							return new MobileNumber(item.getNumber());
						case LANDLINE:
							return new LandlineNumber(item.getNumber());
						case QUICKDIAL:
							return new QuickdialNumber(item.getNumber());
						default:
							LOGGER.error("Unknown number type: {}", item.getType());
							return null;
					}
				})
				.collect(Collectors.toList());

		final DevicesResponse response = getApi(DevicesApi.class).getDevices(userId);

		return response.getItems().stream()
				.filter(item -> item.getType() == TypeEnum.REGISTER)
				.map((DeviceResponse item) -> {
					final CredentialsResponse credentialsResponse = item.getCredentials();
					final Credentials credentials = new Credentials(credentialsResponse.getUsername(),
							credentialsResponse.getPassword());

					final List<Profile> profiles = item.getActivePhonelines()
							.stream()
							.map(line -> new Profile(line.getId(), line.getAlias()))
							.collect(Collectors.toList());

					final String callerId = getApi(DevicesApi.class).getCallerId(item.getId()).getValue();

					return new Phoneline(
							item.getId(),
							credentials,
							item.getAlias(),
							callerId,
							profiles,
							incomingNumbers,
							getMasterSipid());
				})
				.collect(Collectors.toList());
	}


	public List<Faxline> getFaxlines() {
		final FaxlinesResponse faxlines = getApi(	FaxlinesApi.class).getUserFaxlines(getUserId());

		return faxlines.getItems()
				.stream()
				.map(faxline -> toFaxline(faxline))
				.collect(Collectors.toList());
	}

	private void initializeUserInfo() {
		final UserinfoResponse userinfo = getApi(AuthorizationApi.class).userinfo("");
		this.userId = userinfo.getSub();
		this.masterSipid = userinfo.getMasterSipId();
	}

	public String getUserId() {
		if (this.userId == null) {
			initializeUserInfo();
		}
		return this.userId;
	}

	public String getMasterSipid() {
		if (this.masterSipid == null) {
			initializeUserInfo();
		}
		return this.masterSipid;
	}

	public List<Contact> getContacts() {
		return getApi(ContactsApi.class)
				.getAllContacts()
				.getItems()
				.stream()
				.map(contact -> ContactMapper.toContact(contact))
				.collect(Collectors.toList());
	}


	public boolean sendSms(String message, String recipient) {

		final List<SmsExtensionResponse> items = getApi(SmsApi.class)
				.getSmsExtensions(getUserId())
				.getItems();

		if (items.isEmpty()) {
			LOGGER.warn("User {} has no available short message service");
			return false;
		}

		try {
			SendWebSmsRequest request = new SendWebSmsRequest();
			request.setSmsId(items.get(0).getId());
			request.setRecipient(recipient);
			request.setMessage(message);
			getApi(SessionsApi.class).sendWebSms(request);

			return true;

		} catch (ClientErrorException e) {
			Response response = e.getResponse();
			LOGGER.info("Failed to send a sms. Server responded {} ({})",
					response.getStatus(),
					readResponseBody(response));

			return false;
		}
	}

	public Optional<String> sendFax(Faxline faxline, String recipient, String pdfContent, String filename) {
		try {
			SendFaxRequest request = new SendFaxRequest();
			request.setFaxlineId(faxline.getId());
			request.setRecipient(recipient);
			request.setFilename(filename);
			request.setBase64Content(pdfContent);

			final SendFaxSessionResponse response = getApi(SessionsApi.class).sendFax(request);

			return Optional.ofNullable(response.getSessionId());
		} catch (ClientErrorException e) {

			Response response = e.getResponse();
			LOGGER.info("Failed to send a sms. Server responded {} ({})",
					response.getStatus(),
					readResponseBody(response));

			return Optional.empty();
		}
	}

	public String initiateCall(String caller, String callee) {
		try {
			NewCallRequest request = new NewCallRequest();
			request.setCaller(caller);
			request.setCallee(callee);

			final InitiateNewCallSessionResponse response = getApi(SessionsApi.class)
					.newCall(request);

			return response.getSessionId();
		} catch (ClientErrorException e) {

			Response response = e.getResponse();
			LOGGER.info("Failed to initiate call. Server responded {} ({})",
					response.getStatus(),
					readResponseBody(response));

			return "";
		}
	}


	public boolean transfer(String callId, String callee) {
		try {
			TransferRequest request = new TransferRequest();
			request.setAttended(false);
			request.setPhoneNumber(callee);

			getApi(RtcmApi.class).transferCall(callId, request);

			return true;
		} catch (ClientErrorException e) {
			Response response = e.getResponse();
			LOGGER.info("Failed to transfer call {}. Server responded {} ({})",
					callId,
					response.getStatus(),
					readResponseBody(response));

			return false;
		}
	}

	private String readResponseBody(Response response) {
		try (
				final InputStream input = (InputStream) response.getEntity();
				final ByteArrayOutputStream output = new ByteArrayOutputStream();
		) {
			int length = 0;
			byte[] buffer = new byte[4096];
			while ((length = input.read(buffer)) > 0) {
				output.write(buffer, 0, length);
			}
			return output.toString();
		} catch (IOException e) {
			LOGGER.warn("Failed to parse response body: {}", e.getMessage());
			return "N/A";
		}
	}


	public void getHistory(Phoneline phoneline) {

		LOGGER.info("Fetching history for {}", phoneline);

		final List<String> connectionIds = phoneline.getProfileIds();
		final List<String> types = new ArrayList<>();
		final List<String> directions = new ArrayList<>();
		final Integer offset = 0;
		final Integer limit = 50;

		final HistoryResponse history = getApi(HistoryApi.class)
				.getHistory(connectionIds, types, directions, offset, limit);

		final HistoryEntryResponse item = history.getItems().get(0);

		final Extension connectionId = item.getConnectionId();

		LOGGER.info("History: {}", history);
		LOGGER.info("Extension: {}", connectionId);
	}

	private <T> T getApi(Class<T> type) {
		if (!apis.containsKey(type)) {
			synchronized (apis) {
				if (!apis.containsKey(type)) {
					apis.put(type, apiProvider.getApi(type));
				}
			}
		}
		return (T) apis.get(type);
	}
}
