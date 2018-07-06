package de.jmens.clinj.phone;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.phone.call.OutboundCallImpl;
import de.jmens.clinj.api.IntegrationTest;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.slf4j.Logger;

public class TestGeneralPhoneFunctionsIT extends IntegrationTest {

	private static final Logger LOGGER = getLogger(TestGeneralPhoneFunctionsIT.class);

	private static Random random = new Random();

	@Test
	public void testRemoteHangupEvent() throws Exception {
		getPhone(0).register();

		getPhone(0).addInboundListener(call -> {
			LOGGER.info("Incoming call...");
			sleep(250);
			call.pickup();
			sleep(2000);
			call.hangupSynchronous();
			LOGGER.info("Hung up");
		});

		final OutboundCallImpl call = getPhone(1).newCall(getPhone(0).getIncomingNumbers().get(0));

		final CompletableFuture<Void> eventsFiredFuture = CompletableFuture.allOf(
				call.remoteRingingFuture(),
				call.remotePickedUpFuture(),
				call.remoteHangupFuture(),
				call.terminationFuture()
		);

		LOGGER.info("Starting call...");
		call.startSynchronous();

		assertThat("Expected events not fired", eventsFiredFuture.get(15, TimeUnit.SECONDS), nullValue());
	}
}
