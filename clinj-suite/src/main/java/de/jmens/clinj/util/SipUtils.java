package de.jmens.clinj.util;

import static java.text.MessageFormat.format;

import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import de.jmens.sipstack.sip.RFC3261;
import de.jmens.sipstack.sip.syntaxencoding.SipHeaderFieldName;
import de.jmens.sipstack.sip.syntaxencoding.SipHeaderFieldValue;
import de.jmens.sipstack.sip.transport.SipMessage;
import de.jmens.sipstack.sip.transport.SipRequest;
import de.jmens.sipstack.sip.transport.SipResponse;

public class SipUtils {
	public static SipHeaderFieldValue headerValue(SipRequest request, String header) {
		return request.getSipHeaders().get(new SipHeaderFieldName(header));
	}

	public static SipHeaderFieldValue callId(SipRequest request) {
		return request.getSipHeaders().get(new SipHeaderFieldName(RFC3261.HDR_CALLID));
	}

	public static SipHeaderFieldValue callId(SipResponse response) {
		return response.getSipHeaders().get(new SipHeaderFieldName(RFC3261.HDR_CALLID));
	}

	public static String getContact(SipMessage message) {
		return message.getSipHeaders().get(new SipHeaderFieldName(RFC3261.HDR_CONTACT)).getValue();
	}

	public static String getFrom(SipMessage message) {
		return message.getSipHeaders().get(new SipHeaderFieldName(RFC3261.HDR_FROM)).getValue();
	}

	public static String getTo(SipMessage message) {
		return message.getSipHeaders().get(new SipHeaderFieldName(RFC3261.HDR_TO)).getValue();
	}

	public static String formatContact(String raw) {
		final Matcher matcher = Pattern.compile("\\<{0,1}(.*?)\\@.*\\>{0,1}").matcher(raw);
		if (matcher.matches()) {
			return matcher.group(1);
		}
		return raw;
	}

	public static String buildSipUri(String callee) {
		return format("sip:{0}@sipgate.de", callee);
	}
}
