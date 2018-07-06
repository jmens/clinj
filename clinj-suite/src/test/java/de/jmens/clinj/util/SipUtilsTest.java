package de.jmens.clinj.util;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SipUtilsTest {

	@Test
	public void stripContact() throws Exception {
		assertThat(SipUtils.formatContact("49123456789@sipgate.de"), is("49123456789"));
		assertThat(SipUtils.formatContact("<49123456789@sipgate.de>"), is("49123456789"));
		assertThat(SipUtils.formatContact("<wurst@sipgate.de>"), is("wurst"));
		assertThat(SipUtils.formatContact("foobar"), is("foobar"));
	}

}
