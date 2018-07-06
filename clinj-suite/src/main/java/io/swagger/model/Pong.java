package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;

public class Pong {

	@ApiModelProperty(example = "pong", required = true, value = "Ping-pong")
	private String ping = null;

	/**
	 * Ping-pong
	 *
	 * @return ping
	 **/
	public String getPing() {
		return ping;
	}

	public void setPing(String ping) {
		this.ping = ping;
	}

	public Pong ping(String ping) {
		this.ping = ping;
		return this;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Pong {\n");

		sb.append("    ping: ").append(toIndentedString(ping)).append("\n");
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

