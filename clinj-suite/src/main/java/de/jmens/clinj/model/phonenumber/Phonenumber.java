package de.jmens.clinj.model.phonenumber;

import static org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

public class Phonenumber {

	protected String number;

	public static Phonenumber parse(String number) {
		return new Phonenumber(number);
	}

	protected Phonenumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return number;
	}

	@Override
	public boolean equals(final Object o) {
		return reflectionEquals(this, o);
	}

	@Override
	public int hashCode() {
		return reflectionHashCode(this);
	}
}
