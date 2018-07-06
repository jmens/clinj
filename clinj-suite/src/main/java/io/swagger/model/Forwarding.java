package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;

public class Forwarding {

	@ApiModelProperty(example = "+4915799912345", value = "")
	private String destination = null;
	@ApiModelProperty(value = "")
	private Integer timeout = null;
	@ApiModelProperty(value = "")
	private Boolean active = false;

	/**
	 * Get destination
	 *
	 * @return destination
	 **/
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Forwarding destination(String destination) {
		this.destination = destination;
		return this;
	}

	/**
	 * Get timeout
	 * maximum: 600
	 *
	 * @return timeout
	 **/
	public Integer getTimeout() {
		return timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}

	public Forwarding timeout(Integer timeout) {
		this.timeout = timeout;
		return this;
	}

	/**
	 * Get active
	 *
	 * @return active
	 **/
	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Forwarding active(Boolean active) {
		this.active = active;
		return this;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Forwarding {\n");

		sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
		sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
		sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

