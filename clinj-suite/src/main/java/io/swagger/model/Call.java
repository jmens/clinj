package io.swagger.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

public class Call {

	@ApiModelProperty(example = "ABCDEF0123456789", required = true, value = "The unique startSynchronous identifier")
	private String callId = null;
	@ApiModelProperty(example = "false", required = true, value = "The startSynchronous is muted")
	private Boolean muted = false;
	@ApiModelProperty(example = "false", required = true, value = "The startSynchronous is being recorded")
	private Boolean recording = false;
	@ApiModelProperty(example = "false", required = true, value = "The startSynchronous is on hold")
	private Boolean hold = false;
	@ApiModelProperty(required = true, value = "")
	private List<Participant> participants = new ArrayList<Participant>();

	/**
	 * The unique startSynchronous identifier
	 *
	 * @return callId
	 **/
	public String getCallId() {
		return callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
	}

	public Call callId(String callId) {
		this.callId = callId;
		return this;
	}

	/**
	 * The startSynchronous is muted
	 *
	 * @return muted
	 **/
	public Boolean getMuted() {
		return muted;
	}

	public void setMuted(Boolean muted) {
		this.muted = muted;
	}

	public Call muted(Boolean muted) {
		this.muted = muted;
		return this;
	}

	/**
	 * The startSynchronous is being recorded
	 *
	 * @return recording
	 **/
	public Boolean getRecording() {
		return recording;
	}

	public void setRecording(Boolean recording) {
		this.recording = recording;
	}

	public Call recording(Boolean recording) {
		this.recording = recording;
		return this;
	}

	/**
	 * The startSynchronous is on hold
	 *
	 * @return hold
	 **/
	public Boolean getHold() {
		return hold;
	}

	public void setHold(Boolean hold) {
		this.hold = hold;
	}

	public Call hold(Boolean hold) {
		this.hold = hold;
		return this;
	}

	/**
	 * Get participants
	 *
	 * @return participants
	 **/
	public List<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

	public Call participants(List<Participant> participants) {
		this.participants = participants;
		return this;
	}

	public Call addParticipantsItem(Participant participantsItem) {
		this.participants.add(participantsItem);
		return this;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Call {\n");

		sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
		sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
		sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
		sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
		sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
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

