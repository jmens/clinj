package de.jmens.clinq.client;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.model.Phoneline;
import de.jmens.clinj.suite.ClinjSuite;
import de.jmens.clinj.api.TestUtils;
import java.util.List;
import org.junit.Test;
import org.slf4j.Logger;

public class ClinqRestClientTestIT {

	private static final Logger LOGGER = getLogger(ClinqRestClientTestIT.class);

	@Test
	public void testGetPhonelines() {
		final ClinjSuite suite = TestUtils.getDefaultSuite();

		final List<Phoneline> phonelines = suite.getPhonelines();

		assertThat(phonelines, notNullValue());

		LOGGER.info("Incoming numbers: {}", phonelines.get(0).getLandlineNumbers());
		LOGGER.info("{}", phonelines.get(0));
		LOGGER.info("{}", phonelines.get(1));
	}
}
