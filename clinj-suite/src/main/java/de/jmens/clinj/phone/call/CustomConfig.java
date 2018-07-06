package de.jmens.clinj.phone.call;

import static java.text.MessageFormat.format;
import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.exception.UnexpectedClinjException;
import de.jmens.clinj.model.Credentials;
import de.jmens.sipstack.Config;
import de.jmens.sipstack.media.MediaMode;
import de.jmens.sipstack.sip.syntaxencoding.SipURI;
import de.jmens.sipstack.sip.syntaxencoding.SipUriSyntaxException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;

public class CustomConfig implements Config {

	private static boolean testmode;

	public static Config buildConfig(String register, String secret) {
		return new CustomConfig(register, secret, testmode);
	}

	public static Config buildConfig(Credentials credentials) {
		return new CustomConfig(credentials.getUser(), credentials.getPassword(), testmode);
	}

	public static void setTestmode() {
		testmode = true;
	}

	private InetAddress publicIpAddress;

	private final int sipPort = 0;

	private final SipURI outboundProxy;
	private final String registerExtension;
	private final String password;
	private final String domain = "sipgate.de";

	private  InetAddress localIpAddress;

	private static final Logger LOGGER = getLogger(CustomConfig.class);

	private CustomConfig(String registerExtension, String password, boolean testmode) {

		this.registerExtension = registerExtension;
		this.password = password;

		final String proxy;
		if (System.getenv().containsKey("clinj.proxy")) {
			proxy = System.getenv("clinj.proxy");
		} else {
			proxy = "sipgate.de";
		}

		try {
			outboundProxy = new SipURI("sip:" + proxy);
		} catch (SipUriSyntaxException e) {
			throw new UnexpectedClinjException(format("Failed to initialize outbound proxy with {0}", proxy), e);
		}
	}

	@Override
	public InetAddress getLocalInetAddress() {
		if (localIpAddress == null) {
			localIpAddress = testmode
					? getLocalHost()
					: determineLocalInetAddress();
		}
		return localIpAddress;
	}

	private InetAddress getLocalHost() {
		try {
			return InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			throw new UnexpectedClinjException("Failed to determind localhost address", e);
		}
	}

	private InetAddress determineLocalInetAddress() {
		try (DatagramSocket socket = new DatagramSocket()) {

			LOGGER.trace("Determining local nic for {}:{}", outboundProxy.getHost(), 5060);

			socket.connect(InetAddress.getByName(outboundProxy.getHost()), 5060);
			final InetAddress localAddress = socket.getLocalAddress();

			LOGGER.debug("Local address seems to be {}", localAddress);

			return localAddress;

		} catch (UnknownHostException | SocketException e) {
			throw new UnexpectedClinjException("Failed to initialize local ip address", e);
		}
	}

	@Override
	public InetAddress getPublicInetAddress() {
		return publicIpAddress;
	}

	@Override
	public String getUserPart() {
		return registerExtension.toString();
	}

	@Override
	public String getDomain() {
		return this.domain;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public MediaMode getMediaMode() {
		return MediaMode.captureAndPlayback;
	}

	public String getAuthorizationUsername() {
		return getUserPart();
	}

	@Override
	public void setPublicInetAddress(InetAddress inetAddress) {
		publicIpAddress = inetAddress;
	}

	@Override
	public SipURI getOutboundProxy() {
		return outboundProxy;
	}

	@Override
	public int getSipPort() {
		return sipPort;
	}

	@Override
	public boolean isMediaDebug() {
		return false;
	}

	@Override
	public String getMediaFile() {
		return null;
	}

	@Override
	public int getRtpPort() {
		return 0;
	}

	@Override
	public void setLocalInetAddress(InetAddress inetAddress) {
	}

	@Override
	public void setUserPart(String userPart) {
	}

	@Override
	public void setDomain(String domain) {
	}

	@Override
	public void setPassword(String password) {
	}

	@Override
	public void setOutboundProxy(SipURI outboundProxy) {
	}

	@Override
	public void setSipPort(int sipPort) {
	}

	@Override
	public void setMediaMode(MediaMode mediaMode) {
	}

	@Override
	public void setMediaDebug(boolean mediaDebug) {
	}

	@Override
	public void setMediaFile(String mediaFile) {
	}

	@Override
	public void setRtpPort(int rtpPort) {
	}

	@Override
	public void save() {
	}

	public void setAuthorizationUsername(String authorizationUsername) {
	}
}
