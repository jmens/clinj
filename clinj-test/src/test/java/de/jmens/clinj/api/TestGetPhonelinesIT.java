package de.jmens.clinj.api;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.isOneOf;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.startsWith;

import de.jmens.clinj.model.Phoneline;
import de.jmens.clinj.suite.ClinjSuite;
import java.util.List;
import org.junit.Test;

public class TestGetPhonelinesIT {

	private ClinjSuite suite = de.jmens.clinj.api.TestUtils.getDefaultSuite();

	@Test
	public void testMaximumParallelCalls() {
		final List<Phoneline> phonelines = suite.getPhonelines();

		assertThat(phonelines, hasSize(greaterThan(1)));

		phonelines.forEach(phoneline -> {
			assertThat(phoneline.getCallerId(), isOneOf("+4920387844335", "+4920387844337"));
			assertThat(phoneline.getUsername(), not(isEmptyString()));
			assertThat(phoneline.getPassword(), not(isEmptyString()));
			assertThat(phoneline.getName(), not(isEmptyString()));
			assertThat(phoneline.getId(), startsWith("e"));
			assertThat(phoneline.getProfileIds(), hasSize(greaterThan(1)));
		});
	}
}
