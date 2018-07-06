package io.swagger.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

public class Client {

	@ApiModelProperty(example = "Example name", required = true, value = "Name of the application the client is intended to use with")
	private String name = null;
	@ApiModelProperty(example = "Example description", required = true, value = "Short description of the application the client is intended to use with")
	private String description = null;
	@ApiModelProperty(example = "[\"https://_*.example.com/_*\"]", required = true, value = "Valid URI pattern a browser can redirect to after a successful login or logout (simple wildcards are allowed e.g. 'http://example.com/_*')")
	private List<String> redirectUris = new ArrayList<String>();
	@ApiModelProperty(example = "[\"http://_*.example.com\",\"https://_*.example.com\"]", required = true, value = "Allowed CORS origins (simple wildcards are allowed e.g. 'http://_*.example.com')")
	private List<String> webOrigins = new ArrayList<String>();

	/**
	 * Name of the application the client is intended to use with
	 *
	 * @return name
	 **/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Client name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Short description of the application the client is intended to use with
	 *
	 * @return description
	 **/
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Client description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Valid URI pattern a browser can redirect to after a successful login or logout (simple wildcards are allowed e.g. &#39;http://example.com/_*&#39;)
	 *
	 * @return redirectUris
	 **/
	public List<String> getRedirectUris() {
		return redirectUris;
	}

	public void setRedirectUris(List<String> redirectUris) {
		this.redirectUris = redirectUris;
	}

	public Client redirectUris(List<String> redirectUris) {
		this.redirectUris = redirectUris;
		return this;
	}

	public Client addRedirectUrisItem(String redirectUrisItem) {
		this.redirectUris.add(redirectUrisItem);
		return this;
	}

	/**
	 * Allowed CORS origins (simple wildcards are allowed e.g. &#39;http://_*.example.com&#39;)
	 *
	 * @return webOrigins
	 **/
	public List<String> getWebOrigins() {
		return webOrigins;
	}

	public void setWebOrigins(List<String> webOrigins) {
		this.webOrigins = webOrigins;
	}

	public Client webOrigins(List<String> webOrigins) {
		this.webOrigins = webOrigins;
		return this;
	}

	public Client addWebOriginsItem(String webOriginsItem) {
		this.webOrigins.add(webOriginsItem);
		return this;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Client {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
		sb.append("    webOrigins: ").append(toIndentedString(webOrigins)).append("\n");
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

