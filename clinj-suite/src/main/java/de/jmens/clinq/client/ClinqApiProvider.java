package de.jmens.clinq.client;

import static java.util.Collections.singletonList;
import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.model.Credentials;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.slf4j.Logger;

public class ClinqApiProvider {

	private static final Logger LOGGER = getLogger(ClinqApiProvider.class);

	private Credentials credentials;

	public ClinqApiProvider(Credentials credentials) {
		this.credentials = credentials;
	}

	public <T> T getApi(Class<T> type) {
			LOGGER.debug("Initializing new api for {}", type);
		try {
			return JAXRSClientFactory.create(
					ApiConfig.getApiBaseUrl(),
					type,
					singletonList(new SipgateJacksonProvider()),
					credentials.getUser(),
					new String(credentials.getPassword()),
					null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
