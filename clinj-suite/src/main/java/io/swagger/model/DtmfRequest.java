package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;

public class DtmfRequest {

	@ApiModelProperty(example = "123456", required = true, value = "DTMF sequence to send")
	private String sequence = null;

	/**
	 * DTMF sequence to send
	 *
	 * @return sequence
	 **/
	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public DtmfRequest sequence(String sequence) {
		this.sequence = sequence;
		return this;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DtmfRequest {\n");

		sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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

