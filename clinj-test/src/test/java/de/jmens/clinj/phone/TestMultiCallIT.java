package de.jmens.clinj.phone;

import static java.util.concurrent.TimeUnit.MINUTES;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.phone.call.OutboundCallImpl;
import de.jmens.clinj.api.IntegrationTest;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.slf4j.Logger;

public class TestMultiCallIT extends IntegrationTest {

	private static final Logger LOGGER = getLogger(TestMultiCallIT.class);

	@Test
	public void testMultipleCallsOverTime() throws Exception {
		try (
				final ClinjPhone phoneE0 = getPhone(0);
				final ClinjPhone phoneE1 = getPhone(1);
		) {
			phoneE0.register().get(5, TimeUnit.SECONDS);

			LOGGER.info("PhoneE0 registered for {}", phoneE0.getIncomingNumbers());

			phoneE0.addInboundListener(call -> {
				sleep(250);
				call.pickup();
				sleep(2000);
				call.hangupSynchronous();
			});

			final String callee = phoneE0.getIncomingNumbers().get(0).toString();

			Boolean success = startCall(phoneE1, callee)
					.thenCompose(result -> startCall(phoneE1, callee))
					.thenCompose(result -> startCall(phoneE1, callee))
					.thenCompose(result -> startCall(phoneE1, callee))
					.thenCompose(result -> startCall(phoneE1, callee))
					.thenCompose(result -> startCall(phoneE1, callee))
					.handle((result, e) -> {
						assertThat("Exception while executing calls", e, nullValue());
						return result;
					})
					.get(1, MINUTES);

			assertThat(success, is(true));

			LOGGER.info("Ready. Cleaning up.");
		}
	}

	private CompletableFuture<Boolean> startCall(ClinjPhone phoneE1, String callee) throws RuntimeException {
		try {
			sleep(250);

			final OutboundCallImpl call = phoneE1.newCall(callee);

			CompletableFuture.allOf(
					call.remoteRingingFuture(),
					call.remotePickedUpFuture(),
					call.remoteHangupFuture(),
					call.terminationFuture()
			).thenAccept(result -> assertThat("Expected events not fired", result, is(true)));

			call.startSynchronous();

			return call.terminationFuture();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
