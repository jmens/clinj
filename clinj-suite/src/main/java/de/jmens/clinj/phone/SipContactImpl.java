package de.jmens.clinj.phone;

import static de.jmens.clinj.util.SipUtils.formatContact;

import de.jmens.clinj.model.SipContact;

public class SipContactImpl implements SipContact {

	private String contact;

	public SipContactImpl(String contact) {
		this.contact = contact;
	}

	@Override
	public String getContact() {
		return contact;
	}

	@Override
	public String getFormattedContact() {
		return formatContact(contact);
	}
}
