package de.jmens;

import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.api.IntegrationTest;
import de.jmens.clinj.phone.ClinjPhone;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.slf4j.Logger;

public class TransferTest extends IntegrationTest {

	private static final Logger LOGGER = getLogger(TransferTest.class);

	@Test
	public void test() throws Exception {

		LOGGER.info("Starting test");

		try (
				ClinjPhone phone0 = getPhone(0);
				ClinjPhone phone1 = getPhone(1);
				ClinjPhone phone2 = getPhone(2)
		) {

			final CompletableFuture<Void> allPhoneRingFuture = CompletableFuture.allOf(
					setupPhone(phone0),
					setupPhone(phone1),
					setupPhone(phone2)
			);

			LOGGER.info("Phone1 initiates call to {} (phone2)", phone1.getIncomingNumbers().get(0).toString());
			final String callId = getSuite(0).initiateCall("e0", phone1.getIncomingNumbers().get(0).toString());

			sleep(10000);

			LOGGER.info("Phone1 transferring to {} (phone3)", phone2.getIncomingNumbers().get(0).toString());
			getSuite(0).transfer(callId, phone2.getIncomingNumbers().get(0).toString());

			sleep(2500);

			assertThat(allPhoneRingFuture.get(2500, TimeUnit.SECONDS), nullValue());
		}
	}

	private CompletableFuture<Void> setupPhone(ClinjPhone phone) throws Exception {
		final CompletableFuture<Void> ringingFuture = new CompletableFuture<>();

		phone.addInboundListener(call -> {
			LOGGER.info("Incoming call on {} - picking up", phone.getName());
			sleep(250);
			call.pickup();

			ringingFuture.complete(null);
		});

		phone.register().get(30, TimeUnit.SECONDS);

		LOGGER.info("{} registered", phone.getName());

		return ringingFuture;
	}
}
