package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class NumberResponseWithEndpoint  {
  
  @ApiModelProperty(value = "")
  private String id = null;
  @ApiModelProperty(example = "+4915799912345", value = "")
  private String number = null;
  @ApiModelProperty(example = "01579-9912345", value = "")
  private String localized = null;

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("MOBILE") MOBILE(String.valueOf("MOBILE")), @XmlEnumValue("LANDLINE") LANDLINE(String.valueOf("LANDLINE")), @XmlEnumValue("QUICKDIAL") QUICKDIAL(String.valueOf("QUICKDIAL")), @XmlEnumValue("INTERNATIONAL") INTERNATIONAL(String.valueOf("INTERNATIONAL"));


    private String value;

    TypeEnum (String v) {
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
  @ApiModelProperty(example = "p0", value = "")
  private String endpointId = null;
  @ApiModelProperty(value = "")
  private String endpointAlias = null;
  @ApiModelProperty(value = "")
  private String endpointUrl = null;

 /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NumberResponseWithEndpoint id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get number
   * @return number
  **/
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public NumberResponseWithEndpoint number(String number) {
    this.number = number;
    return this;
  }

 /**
   * Get localized
   * @return localized
  **/
  public String getLocalized() {
    return localized;
  }

  public void setLocalized(String localized) {
    this.localized = localized;
  }

  public NumberResponseWithEndpoint localized(String localized) {
    this.localized = localized;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public NumberResponseWithEndpoint type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get endpointId
   * @return endpointId
  **/
  public String getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }

  public NumberResponseWithEndpoint endpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

 /**
   * Get endpointAlias
   * @return endpointAlias
  **/
  public String getEndpointAlias() {
    return endpointAlias;
  }

  public void setEndpointAlias(String endpointAlias) {
    this.endpointAlias = endpointAlias;
  }

  public NumberResponseWithEndpoint endpointAlias(String endpointAlias) {
    this.endpointAlias = endpointAlias;
    return this;
  }

 /**
   * Get endpointUrl
   * @return endpointUrl
  **/
  public String getEndpointUrl() {
    return endpointUrl;
  }

  public void setEndpointUrl(String endpointUrl) {
    this.endpointUrl = endpointUrl;
  }

  public NumberResponseWithEndpoint endpointUrl(String endpointUrl) {
    this.endpointUrl = endpointUrl;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberResponseWithEndpoint {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    localized: ").append(toIndentedString(localized)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    endpointAlias: ").append(toIndentedString(endpointAlias)).append("\n");
    sb.append("    endpointUrl: ").append(toIndentedString(endpointUrl)).append("\n");
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

