package de.jmens.clinj.api;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.model.phonenumber.Phonenumber;
import de.jmens.clinj.phone.ClinjPhone;
import de.jmens.clinj.phone.call.OutboundCallImpl;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.slf4j.Logger;

public class ClinjSuitePhoneTestIT extends IntegrationTest {

	private static final Logger LOGGER = getLogger(ClinjSuitePhoneTestIT.class);

	@Test
	public void testRegister() throws Exception {
		final CompletableFuture<Integer> register = getPhone(0).register();

		register.get(1, TimeUnit.MINUTES);
	}

	@Test
	public void testRemoteCalling() throws Exception {

		try (
				ClinjPhone phone1 = getPhone(0);
				ClinjPhone phone2 = getPhone(1);
		) {
			LOGGER.info("Registering phone 1");

			assertThat("phone1 registered",
					phone1.register().get(30, TimeUnit.SECONDS),
					notNullValue());

			final Phonenumber callee = phone1.getIncomingNumbers().get(0);

			LOGGER.info("Calling {} with phone 2", callee);

			final String callId = phone2.newCall(callee).start().get(10, SECONDS);

			LOGGER.info("phone2 waiting for remote ringing");

			assertThat("phone2 receives remote ringing",
					phone2.getOutboundCall(callId).get().remoteRingingFuture().get(30, SECONDS),
					is(true));
		}
	}

	@Test
	public void testRemotePickup() throws Exception {
		try (
				ClinjPhone phone1 = getPhone(0);
				ClinjPhone phone2 = getPhone(1);
		) {

			LOGGER.info("Registering phone1");

			assertThat("phone1 registered",
					phone1.register().get(30, TimeUnit.SECONDS),
					notNullValue());

			phone1.addInboundListener(call -> call.pickup());

			final Phonenumber callee = phone1.getIncomingNumbers().get(0);

			LOGGER.info("Calling {} with pone2", callee);

			final String callId = phone2.newCall(callee).start().get(10, SECONDS);

			LOGGER.info("phone2 waiting for remote pickup");

			assertThat("phone2 receives pickup",
					phone2.getOutboundCall(callId).get().remotePickedUpFuture().get(30, SECONDS),
					is(true));
		}
	}

	@Test
	public void testCallerIds() throws Exception {

		try (
				final ClinjPhone phone0 = getPhone(0);
				final ClinjPhone phone1 = getPhone(1);
		) {
			phone1.register();

			phone1.addInboundListener(call -> {
				call.pickup();
				assertThat(call.getCaller().getFormattedContact(), is("sip:020387844335"));
				assertThat(call.getCallee().getFormattedContact(), is("sip:2477148e2"));
				sleep(2000);
				call.hangupSynchronous();
			});

			final OutboundCallImpl outboundCall = phone0.newCall(phone1.getIncomingNumbers().get(0));
			final CompletableFuture<Boolean> remoteHangupFuture = outboundCall.terminationFuture();

			outboundCall.start();

			LOGGER.info("Started call to {}", phone1.getIncomingNumbers().get(0));

			remoteHangupFuture.get(120, TimeUnit.SECONDS);
		}
	}
}

