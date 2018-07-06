package de.jmens.clinj.model;

import static java.text.MessageFormat.format;
import static java.util.Collections.emptyList;
import static org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

import de.jmens.clinj.model.phonenumber.LandlineNumber;
import de.jmens.clinj.model.phonenumber.MobileNumber;
import de.jmens.clinj.model.phonenumber.Phonenumber;
import de.jmens.clinj.model.phonenumber.QuickdialNumber;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Phoneline {

	private String id;
	private String name;
	private String callerId;
	private String masterSipid;
	private Credentials credentials;
	private List<Profile> profiles;
	private List<LandlineNumber> landlineNumbers = new ArrayList<>();
	private List<MobileNumber> mobileNumbers = new ArrayList<>();
	private List<QuickdialNumber> quickdialNumbers = new ArrayList<>();

	public Phoneline(String id, Credentials credentials, String name, String callerId, List<Profile> profiles,
			List<Phonenumber> inocmingNumbers, String masterSipid) {
		this.credentials = credentials;
		this.id = id;
		this.name = name == null ? "" : name;
		this.callerId = callerId;
		this.profiles = profiles == null ? emptyList() : profiles;
		this.masterSipid = masterSipid;

		inocmingNumbers.forEach(number -> {
			if (number instanceof LandlineNumber) {
				landlineNumbers.add((LandlineNumber) number);
			} else if (number instanceof MobileNumber) {
				mobileNumbers.add((MobileNumber) number);
			} else if (number instanceof QuickdialNumber) {
				quickdialNumbers.add((QuickdialNumber) number);
			}
		});
	}

	public String getUsername() {
		return credentials.getUser();
	}

	public String getId() {
		return id;
	}

	public String getFullId() {
		return masterSipid + id;
	}

	public String getPassword() {
		return new String(credentials.getPassword());
	}

	public String getName() {
		return name;
	}

	public List<String> getProfileIds() {
		return profiles
				.stream()
				.map(connection -> connection.getId())
				.collect(Collectors.toList());
	}


	public String getCallerId() {
		return callerId;
	}

	public List<LandlineNumber> getLandlineNumbers() {
		return landlineNumbers;
	}

	public List<MobileNumber> getMobileNumbers() {
		return mobileNumbers;
	}

	public List<QuickdialNumber> getQuickdialNumbers() {
		return quickdialNumbers;
	}

	public List<String> getIncomingNumbers() {
		List<String> result = new ArrayList<>();
		getLandlineNumbers().forEach(number -> result.add(number.toE164()));
		getMobileNumbers().forEach(number -> result.add(number.toE164()));
		getQuickdialNumbers().forEach(number -> result.add(number.toString()));
		return result;
	}

	@Override
	public String toString() {
		return reflectionToString(this, SHORT_PREFIX_STYLE);
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
