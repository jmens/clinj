package de.jmens.clinj.phone;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;

import de.jmens.clinj.model.Credentials;
import de.jmens.clinj.phone.call.CustomConfig;
import java.util.stream.IntStream;
import org.junit.Before;
import org.junit.Test;

public class UserAgentManagerTest {

	@Before
	public void setUp() {
		CustomConfig.setTestmode();
	}

	@Test
	public void testGetInstance() {
		final UserAgentManager manager = new UserAgentManager(5, new Credentials("", ""), "", null);

		IntStream.range(0, 5)
				.boxed()
				.map(i -> manager.getInstance())
				.forEach(userAgent -> assertThat(userAgent, hasProperty("present", is(true))));

		assertThat(manager.getInstance(), hasProperty("present", is(false)));
	}

	@Test
	public void testReleaseInstance() {
		final UserAgentManager manager = new UserAgentManager(5, new Credentials("", ""), "", null);
		manager.getInstance().ifPresent(userAgent -> manager.releaseInstance(userAgent));
		manager.getInstance().ifPresent(userAgent -> manager.releaseInstance(userAgent));
		manager.getInstance().ifPresent(userAgent -> manager.releaseInstance(userAgent));
		manager.getInstance().ifPresent(userAgent -> manager.releaseInstance(userAgent));
		manager.getInstance().ifPresent(userAgent -> manager.releaseInstance(userAgent));
		manager.getInstance().ifPresent(userAgent -> manager.releaseInstance(userAgent));

		IntStream.range(0, 5)
				.boxed()
				.map(i -> manager.getInstance())
				.forEach(userAgent -> assertThat(userAgent, hasProperty("present", is(true))));
		assertThat(manager.getInstance(), hasProperty("present", is(false)));
	}
}
