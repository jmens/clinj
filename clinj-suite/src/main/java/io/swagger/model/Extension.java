package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

public class Extension {


	@XmlType(name = "TypeEnum")
	@XmlEnum(String.class)
	public enum TypeEnum {

		@XmlEnumValue("WEBUSER") WEBUSER(String.valueOf("WEBUSER")), @XmlEnumValue("PERSON") PERSON(
				String.valueOf("PERSON")), @XmlEnumValue("REGISTER") REGISTER(
				String.valueOf("REGISTER")), @XmlEnumValue("FAX") FAX(
				String.valueOf("FAX")), @XmlEnumValue("EXTERNAL") EXTERNAL(
				String.valueOf("EXTERNAL")), @XmlEnumValue("MOBILE") MOBILE(
				String.valueOf("MOBILE")), @XmlEnumValue("VOICEMAIL") VOICEMAIL(
				String.valueOf("VOICEMAIL")), @XmlEnumValue("GROUP") GROUP(
				String.valueOf("GROUP")), @XmlEnumValue("SMS") SMS(String.valueOf("SMS")), @XmlEnumValue("TRUNK") TRUNK(
				String.valueOf("TRUNK")), @XmlEnumValue("SIM") SIM(String.valueOf("SIM"));


		private String value;

		TypeEnum(String v) {
			value = v;
		}

		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static TypeEnum fromValue(String v) {
			for (TypeEnum b : TypeEnum.values()) {
				if (String.valueOf(b.value).equals(v)) {
					return b;
				}
			}
			return null;
		}
	}

	@ApiModelProperty(value = "")
	private TypeEnum type = null;
	@ApiModelProperty(value = "")
	private Integer id = null;
	@ApiModelProperty(value = "")
	private String masterSipid = null;
	@ApiModelProperty(value = "")
	private Boolean validDeviceExtension = false;
	@ApiModelProperty(value = "")
	private String _short = null;

	/**
	 * Get type
	 *
	 * @return type
	 **/
	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	public Extension type(TypeEnum type) {
		this.type = type;
		return this;
	}

	/**
	 * Get id
	 *
	 * @return id
	 **/
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Extension id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * Get masterSipid
	 *
	 * @return masterSipid
	 **/
	public String getMasterSipid() {
		return masterSipid;
	}

	public void setMasterSipid(String masterSipid) {
		this.masterSipid = masterSipid;
	}

	public Extension masterSipid(String masterSipid) {
		this.masterSipid = masterSipid;
		return this;
	}

	/**
	 * Get validDeviceExtension
	 *
	 * @return validDeviceExtension
	 **/
	public Boolean getValidDeviceExtension() {
		return validDeviceExtension;
	}

	public void setValidDeviceExtension(Boolean validDeviceExtension) {
		this.validDeviceExtension = validDeviceExtension;
	}

	public Extension validDeviceExtension(Boolean validDeviceExtension) {
		this.validDeviceExtension = validDeviceExtension;
		return this;
	}

	/**
	 * Get _short
	 *
	 * @return _short
	 **/
	public String getShort() {
		return _short;
	}

	public void setShort(String _short) {
		this._short = _short;
	}

	public Extension _short(String _short) {
		this._short = _short;
		return this;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Extension {\n");

		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    masterSipid: ").append(toIndentedString(masterSipid)).append("\n");
		sb.append("    validDeviceExtension: ").append(toIndentedString(validDeviceExtension)).append("\n");
		sb.append("    _short: ").append(toIndentedString(_short)).append("\n");
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

