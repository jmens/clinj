package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;

public class TacRequest {

	@ApiModelProperty(value = "")
	private Boolean accepted = false;

	/**
	 * Get accepted
	 *
	 * @return accepted
	 **/
	public Boolean getAccepted() {
		return accepted;
	}

	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}

	public TacRequest accepted(Boolean accepted) {
		this.accepted = accepted;
		return this;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TacRequest {\n");

		sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
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

