package de.jmens.sipstack.sip.core.useragent;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import de.jmens.clinj.api.DummySoundManager;
import de.jmens.clinj.api.TestUtils;
import de.jmens.clinj.phone.SipListenerAdapter;
import de.jmens.clinj.phone.call.CustomConfig;
import de.jmens.sipstack.Config;
import de.jmens.sipstack.FileLogger;
import de.jmens.sipstack.media.AbstractSoundManager;
import de.jmens.sipstack.sip.transport.SipRequest;
import java.net.SocketException;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class UserAgentTestIT {


	private UserAgentImpl userAgent;

	@Before
	public void setUp() throws Exception {
		userAgent = buildUseragent();
	}

	@Test
	public void testInvite() throws Exception {
		SipRequest sipRequest = null;
		try {
			String requestUri = "sip:bob@" + userAgent.getConfig().getLocalInetAddress().getHostAddress() + ":6060";
			sipRequest = userAgent.invite(requestUri, userAgent.getConfig().getLocalInetAddress().getHostName());
			assertThat(sipRequest, notNullValue());
			assertThat(sipRequest.getMethod(), is("INVITE"));
		} finally {
			if (sipRequest != null) {
				userAgent.terminate(sipRequest);
			}
		}
	}

	@Test
	@Ignore
	public void testIsActive() throws Exception {
		SipRequest sipRequest = null;
		try {
			String requestUri = "sip:bob@" + userAgent.getConfig().getLocalInetAddress().getHostAddress() + ":6060";
			sipRequest = userAgent.invite(requestUri, userAgent.getConfig().getLocalInetAddress().getHostName());
			assertThat(userAgent.isBusy(), is(true));
		} finally {
			if (sipRequest != null) {
				userAgent.terminate(sipRequest);
				assertThat(userAgent.isBusy(), is(false));
			}
		}
	}

	private UserAgentImpl buildUseragent() throws SocketException {
		final SipListenerAdapter listener = new SipListenerAdapter();
		return buildUseragent(null);
	}

	private UserAgentImpl buildUseragent(SipListener listener) throws SocketException {
		final AbstractSoundManager soundManager = new DummySoundManager();
		final Config config = CustomConfig.buildConfig(TestUtils.sipCredentials("phone0"));
		return new UserAgentImpl(listener, config, new FileLogger(), soundManager, "clinj");
	}
}
