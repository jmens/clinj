package de.jmens.clinj.api;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.exception.UnexpectedClinjException;
import de.jmens.clinj.model.Phoneline;
import de.jmens.clinj.phone.ClinjPhone;
import de.jmens.clinj.suite.ClinjSuite;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.slf4j.Logger;

public class IntegrationTest {

	private static final Logger LOGGER = getLogger(IntegrationTest.class);

	private List<PhoneEnvironment> phoneEnvironments = new ArrayList<>();

	public ClinjSuite getSuite(int index) {
		return phoneEnvironments.get(index).getSuite();
	}

	public ClinjPhone getPhone(int index) {
		return phoneEnvironments.get(index).getPhone();
	}


	@Before
	public void setUpIntegrationTest() throws Exception {

		LOGGER.info("Checking internet connection");

		assertThat(new URL("http://www.sipgate.de").getContent(), notNullValue());

		LOGGER.info("Initializing integration test");
		IntStream.range(0, 3).forEach(i -> {
			try {
				LOGGER.info("Initializing suite {}", i);
				phoneEnvironments.add(PhoneEnvironment.get(TestUtils.getSuite(i)));
			} catch (Exception e) {
				throw new AssertionError(e.getMessage());
			}
		});

		LOGGER.info("Integration test assets set up");
	}

	@After
	public void tearDownIntegrationTest() {
		phoneEnvironments.forEach(env -> env.getPhone().shutdown());
	}

	protected void sleep(long milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			LOGGER.warn("Exception while sleeping", e);
		}
	}

	private static class PhoneEnvironment {

		private ClinjSuite suite;
		private List<Phoneline> phonelines;
		private ClinjPhone phone;


		private PhoneEnvironment(ClinjSuite suite, List<Phoneline> phonelines, ClinjPhone phone) {
			this.suite = suite;
			this.phonelines = phonelines;
			this.phone = phone;
		}

		public static PhoneEnvironment get(ClinjSuite suite) {
			try {
				final List<Phoneline> phonelines = suite.getPhonelines();
				final ClinjPhone phone = suite.getPhone(phonelines.get(0));
				return new PhoneEnvironment(suite, phonelines, phone);
			} catch (Exception e) {
				final String message = "Invalid configuration or bad internet connection. Need at least 3 configured webusers with having at least one phoneline each";
				throw new UnexpectedClinjException(message);
			}
		}

		public ClinjSuite getSuite() {
			return suite;
		}

		public List<Phoneline> getPhonelines() {
			return phonelines;
		}

		public ClinjPhone getPhone() {
			return phone;
		}
	}
}
