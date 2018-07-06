package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class Participant {

	@ApiModelProperty(example = "ABCDEF0123456789", required = true, value = "The unique participant identifier")
	private String participantId = null;
	@ApiModelProperty(example = "+4915799912345", required = true, value = "Participants phone number (can be empty for various reasons, e.g. anonymous participant)")
	private String phoneNumber = null;
	@ApiModelProperty(example = "false", required = true, value = "Participant is muted")
	private Boolean muted = false;
	@ApiModelProperty(example = "false", required = true, value = "Participant is on hold")
	private Boolean hold = false;
	@ApiModelProperty(example = "false", required = true, value = "Participant is the startSynchronous owner")
	private Boolean owner = false;

	/**
	 * The unique participant identifier
	 *
	 * @return participantId
	 **/
	public String getParticipantId() {
		return participantId;
	}

	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public Participant participantId(String participantId) {
		this.participantId = participantId;
		return this;
	}

	/**
	 * Participants phone number (can be empty for various reasons, e.g. anonymous participant)
	 *
	 * @return phoneNumber
	 **/
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Participant phoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	/**
	 * Participant is muted
	 *
	 * @return muted
	 **/
	public Boolean getMuted() {
		return muted;
	}

	public void setMuted(Boolean muted) {
		this.muted = muted;
	}

	public Participant muted(Boolean muted) {
		this.muted = muted;
		return this;
	}

	/**
	 * Participant is on hold
	 *
	 * @return hold
	 **/
	public Boolean getHold() {
		return hold;
	}

	public void setHold(Boolean hold) {
		this.hold = hold;
	}

	public Participant hold(Boolean hold) {
		this.hold = hold;
		return this;
	}

	/**
	 * Participant is the startSynchronous owner
	 *
	 * @return owner
	 **/
	public Boolean getOwner() {
		return owner;
	}

	public void setOwner(Boolean owner) {
		this.owner = owner;
	}

	public Participant owner(Boolean owner) {
		this.owner = owner;
		return this;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Participant {\n");

		sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
		sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
		sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
		sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
		sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private static String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}

