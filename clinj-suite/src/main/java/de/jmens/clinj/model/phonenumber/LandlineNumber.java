package de.jmens.clinj.model.phonenumber;

public class LandlineNumber extends Phonenumber {

	public LandlineNumber(String number) {
		super(number);
	}

	public String toE164() {
		return number;
	}

	public String toLocal() {
		return number;
	}
}
