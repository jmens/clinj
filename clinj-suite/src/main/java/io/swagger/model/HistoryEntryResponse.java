package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.model.Extension;
import io.swagger.model.Number;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HistoryEntryResponse {

	@ApiModelProperty(example = "100001234", value = "")
	private String id = null;
	@ApiModelProperty(value = "")
	private Number source = null;
	@ApiModelProperty(value = "")
	private Number target = null;
	@ApiModelProperty(example = "Dennis Ritchie", value = "")
	private String sourceAlias = null;
	@ApiModelProperty(example = "Ken Thompson", value = "")
	private String targetAlias = null;

	@XmlType(name = "TypeEnum")
	@XmlEnum(String.class)
	public enum TypeEnum {

		@XmlEnumValue("CALL")CALL(String.valueOf("CALL")), @XmlEnumValue("VOICEMAIL")VOICEMAIL(
				String.valueOf("VOICEMAIL")), @XmlEnumValue("SMS")SMS(String.valueOf("SMS")), @XmlEnumValue("FAX")FAX(
				String.valueOf("FAX")), @XmlEnumValue("REGISTER")REGISTER(String.valueOf("REGISTER")),
		@XmlEnumValue("MOBILE")MOBILE(String.valueOf("MOBILE"));


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
	@ApiModelProperty(example = "2016-02-10T14:19:39Z", value = "")
	private String created = null;
	@ApiModelProperty(example = "2016-02-10T14:19:39Z", value = "")
	private String lastModified = null;

	@XmlType(name = "DirectionEnum")
	@XmlEnum(String.class)
	public enum DirectionEnum {

		@XmlEnumValue("MISSED_INCOMING")MISSED_INCOMING(
				String.valueOf("MISSED_INCOMING")), @XmlEnumValue("INCOMING")INCOMING(
				String.valueOf("INCOMING")), @XmlEnumValue("OUTGOING")OUTGOING(
				String.valueOf("OUTGOING")), @XmlEnumValue("MISSED_OUTGOING")MISSED_OUTGOING(
				String.valueOf("MISSED_OUTGOING"));


		private String value;

		DirectionEnum(String v) {
			value = v;
		}

		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static DirectionEnum fromValue(String v) {
			for (DirectionEnum b : DirectionEnum.values()) {
				if (String.valueOf(b.value).equals(v)) {
					return b;
				}
			}
			return null;
		}
	}

	@ApiModelProperty(value = "")
	private DirectionEnum direction = null;
	@ApiModelProperty(value = "")
	private Extension connectionId = null;

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

	public HistoryEntryResponse id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get source
	 *
	 * @return source
	 **/
	public Number getSource() {
		return source;
	}

	public void setSource(Number source) {
		this.source = source;
	}

	public HistoryEntryResponse source(Number source) {
		this.source = source;
		return this;
	}

	/**
	 * Get target
	 *
	 * @return target
	 **/
	public Number getTarget() {
		return target;
	}

	public void setTarget(Number target) {
		this.target = target;
	}

	public HistoryEntryResponse target(Number target) {
		this.target = target;
		return this;
	}

	/**
	 * Get sourceAlias
	 *
	 * @return sourceAlias
	 **/
	public String getSourceAlias() {
		return sourceAlias;
	}

	public void setSourceAlias(String sourceAlias) {
		this.sourceAlias = sourceAlias;
	}

	public HistoryEntryResponse sourceAlias(String sourceAlias) {
		this.sourceAlias = sourceAlias;
		return this;
	}

	/**
	 * Get targetAlias
	 *
	 * @return targetAlias
	 **/
	public String getTargetAlias() {
		return targetAlias;
	}

	public void setTargetAlias(String targetAlias) {
		this.targetAlias = targetAlias;
	}

	public HistoryEntryResponse targetAlias(String targetAlias) {
		this.targetAlias = targetAlias;
		return this;
	}

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

	public HistoryEntryResponse type(TypeEnum type) {
		this.type = type;
		return this;
	}

	/**
	 * Get created
	 *
	 * @return created
	 **/
	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public HistoryEntryResponse created(String created) {
		this.created = created;
		return this;
	}

	/**
	 * Get lastModified
	 *
	 * @return lastModified
	 **/
	public String getLastModified() {
		return lastModified;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

	public HistoryEntryResponse lastModified(String lastModified) {
		this.lastModified = lastModified;
		return this;
	}

	/**
	 * Get direction
	 *
	 * @return direction
	 **/
	public DirectionEnum getDirection() {
		return direction;
	}

	public void setDirection(DirectionEnum direction) {
		this.direction = direction;
	}

	public HistoryEntryResponse direction(DirectionEnum direction) {
		this.direction = direction;
		return this;
	}

	/**
	 * Get connectionId
	 *
	 * @return connectionId
	 **/
	public Extension getConnectionId() {
		return connectionId;
	}

	public void setConnectionId(Extension connectionId) {
		this.connectionId = connectionId;
	}

	public HistoryEntryResponse connectionId(Extension connectionId) {
		this.connectionId = connectionId;
		return this;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HistoryEntryResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    source: ").append(toIndentedString(source)).append("\n");
		sb.append("    target: ").append(toIndentedString(target)).append("\n");
		sb.append("    sourceAlias: ").append(toIndentedString(sourceAlias)).append("\n");
		sb.append("    targetAlias: ").append(toIndentedString(targetAlias)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    created: ").append(toIndentedString(created)).append("\n");
		sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
		sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
		sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
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

