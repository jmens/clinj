package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;

public class EmailTarget {

	@ApiModelProperty(example = "42", value = "")
	private String id = null;
	@ApiModelProperty(example = "grace.hopper@example.com", value = "")
	private String email = null;

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

	public EmailTarget id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get email
	 *
	 * @return email
	 **/
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EmailTarget email(String email) {
		this.email = email;
		return this;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EmailTarget {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

