package de.jmens.clinq.client.converter;

import de.jmens.clinj.model.Contact;
import io.swagger.model.InternalContactResponse;

public final class ContactMapper {
	private ContactMapper() {
		super();
	}

	public static Contact toContact(InternalContactResponse contact) {
		final Contact result = new Contact();
		result.setId(contact.getId());
		result.setDirectDial(contact.getDirectdial());
		result.setEmails(contact.getEmails());
		result.setFax(contact.getFax());
		result.setLandline(contact.getLandline());
		result.setMobile(contact.getMobile());
		result.setName(contact.getName());
		return result;
	}

}
