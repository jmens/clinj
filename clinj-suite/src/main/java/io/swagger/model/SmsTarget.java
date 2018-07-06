package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;

public class SmsTarget {

	@ApiModelProperty(example = "1337", value = "")
	private String id = null;
	@ApiModelProperty(example = "+4915799912345", value = "")
	private String number = null;

	/**
	 * Get id
	 *
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SmsTarget id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get number
	 *
	 * @return number
	 **/
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public SmsTarget number(String number) {
		this.number = number;
		return this;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SmsTarget {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

