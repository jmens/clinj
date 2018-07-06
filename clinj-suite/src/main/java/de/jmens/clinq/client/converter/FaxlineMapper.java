package de.jmens.clinq.client.converter;

import de.jmens.clinj.model.Faxline;
import io.swagger.model.FaxlineResponse;

public final class FaxlineMapper {
	private FaxlineMapper() {
		super();
	}

	public static Faxline toFaxline(FaxlineResponse faxline) {
		final Faxline result = new Faxline();
		result.setId(faxline.getId());
		result.setCanSend(faxline.getCanSend());
		result.setCanReceive(faxline.getCanReceive());
		result.setAlias(faxline.getAlias());
		result.setTagline(faxline.getTagline());
		return result;
	}
}
