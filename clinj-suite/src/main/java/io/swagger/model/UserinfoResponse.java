package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserinfoResponse  {

  @ApiModelProperty(example = "w0", value = "")
  private String sub = null;
  @ApiModelProperty(example = "sipgate.de", value = "")
  private String domain = null;
  @ApiModelProperty(example = "0000000", value = "")
  private String masterSipId = null;
  @ApiModelProperty(example = "de_DE", value = "")
  private String locale = null;

	/**
	 * Get sub
	 *
	 * @return sub
	 **/
	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public UserinfoResponse sub(String sub) {
		this.sub = sub;
		return this;
	}

	/**
	 * Get domain
	 *
	 * @return domain
	 **/
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public UserinfoResponse domain(String domain) {
		this.domain = domain;
		return this;
	}

	/**
	 * Get masterSipId
	 *
	 * @return masterSipId
	 **/
	public String getMasterSipId() {
		return masterSipId;
	}

	public void setMasterSipId(String masterSipId) {
		this.masterSipId = masterSipId;
	}

	public UserinfoResponse masterSipId(String masterSipId) {
		this.masterSipId = masterSipId;
		return this;
	}

	/**
	 * Get locale
	 *
	 * @return locale
	 **/
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public UserinfoResponse locale(String locale) {
		this.locale = locale;
		return this;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UserinfoResponse {\n");

		sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
		sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
		sb.append("    masterSipId: ").append(toIndentedString(masterSipId)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

