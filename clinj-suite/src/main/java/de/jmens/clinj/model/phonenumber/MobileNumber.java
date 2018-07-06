package de.jmens.clinj.model.phonenumber;

public class MobileNumber extends Phonenumber {

	public MobileNumber(String number) {
		super(number);
	}

	public String toE164() {
		return number;
	}

	public String toLocal() {
		return number;
	}
}
