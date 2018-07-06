package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class RestrictionItem  {
  

@XmlType(name="RestrictionEnum")
@XmlEnum(String.class)
public enum RestrictionEnum {

@XmlEnumValue("CAN_CREATE_REGISTER_DEVICE") CAN_CREATE_REGISTER_DEVICE(String.valueOf("CAN_CREATE_REGISTER_DEVICE")), @XmlEnumValue("CAN_DELETE_REGISTER_DEVICE") CAN_DELETE_REGISTER_DEVICE(String.valueOf("CAN_DELETE_REGISTER_DEVICE")), @XmlEnumValue("CAN_CREATE_MOBILE_DEVICE") CAN_CREATE_MOBILE_DEVICE(String.valueOf("CAN_CREATE_MOBILE_DEVICE")), @XmlEnumValue("CAN_DELETE_MOBILE_DEVICE") CAN_DELETE_MOBILE_DEVICE(String.valueOf("CAN_DELETE_MOBILE_DEVICE")), @XmlEnumValue("CAN_CREATE_EXTERNAL_DEVICE") CAN_CREATE_EXTERNAL_DEVICE(String.valueOf("CAN_CREATE_EXTERNAL_DEVICE")), @XmlEnumValue("CAN_DELETE_EXTERNAL_DEVICE") CAN_DELETE_EXTERNAL_DEVICE(String.valueOf("CAN_DELETE_EXTERNAL_DEVICE")), @XmlEnumValue("CAN_CHANGE_EXTERNAL_DEVICE") CAN_CHANGE_EXTERNAL_DEVICE(String.valueOf("CAN_CHANGE_EXTERNAL_DEVICE")), @XmlEnumValue("CAN_BOOK_PHONELINE_FEATURE") CAN_BOOK_PHONELINE_FEATURE(String.valueOf("CAN_BOOK_PHONELINE_FEATURE")), @XmlEnumValue("CAN_CREATE_PHONELINE_EXTENSION") CAN_CREATE_PHONELINE_EXTENSION(String.valueOf("CAN_CREATE_PHONELINE_EXTENSION")), @XmlEnumValue("CAN_DELETE_PHONELINE_EXTENSION") CAN_DELETE_PHONELINE_EXTENSION(String.valueOf("CAN_DELETE_PHONELINE_EXTENSION")), @XmlEnumValue("CAN_CREATE_QUICKDIAL_NUMBER") CAN_CREATE_QUICKDIAL_NUMBER(String.valueOf("CAN_CREATE_QUICKDIAL_NUMBER")), @XmlEnumValue("CAN_CHANGE_QUICKDIAL_NUMBER") CAN_CHANGE_QUICKDIAL_NUMBER(String.valueOf("CAN_CHANGE_QUICKDIAL_NUMBER")), @XmlEnumValue("CAN_DELETE_QUICKDIAL_NUMBER") CAN_DELETE_QUICKDIAL_NUMBER(String.valueOf("CAN_DELETE_QUICKDIAL_NUMBER")), @XmlEnumValue("CAN_GET_HISTORY") CAN_GET_HISTORY(String.valueOf("CAN_GET_HISTORY")), @XmlEnumValue("CAN_DELETE_HISTORY") CAN_DELETE_HISTORY(String.valueOf("CAN_DELETE_HISTORY")), @XmlEnumValue("CAN_CREATE_FAX_EXTENSION") CAN_CREATE_FAX_EXTENSION(String.valueOf("CAN_CREATE_FAX_EXTENSION")), @XmlEnumValue("CAN_DELETE_FAX_EXTENSION") CAN_DELETE_FAX_EXTENSION(String.valueOf("CAN_DELETE_FAX_EXTENSION")), @XmlEnumValue("CAN_BOOK_FAX_FEATURE") CAN_BOOK_FAX_FEATURE(String.valueOf("CAN_BOOK_FAX_FEATURE")), @XmlEnumValue("CAN_SEND_FAX") CAN_SEND_FAX(String.valueOf("CAN_SEND_FAX")), @XmlEnumValue("CAN_RECEIVE_FAX") CAN_RECEIVE_FAX(String.valueOf("CAN_RECEIVE_FAX")), @XmlEnumValue("CAN_CHANGE_DEVICE_EMERGENCY_LOCATION") CAN_CHANGE_DEVICE_EMERGENCY_LOCATION(String.valueOf("CAN_CHANGE_DEVICE_EMERGENCY_LOCATION")), @XmlEnumValue("CAN_ACTIVATE_SIM") CAN_ACTIVATE_SIM(String.valueOf("CAN_ACTIVATE_SIM")), @XmlEnumValue("CAN_GET_BLACKLIST") CAN_GET_BLACKLIST(String.valueOf("CAN_GET_BLACKLIST")), @XmlEnumValue("CAN_MANAGE_BLACKLIST") CAN_MANAGE_BLACKLIST(String.valueOf("CAN_MANAGE_BLACKLIST")), @XmlEnumValue("MAX_PARALLEL_FORWARDINGS") MAX_PARALLEL_FORWARDINGS(String.valueOf("MAX_PARALLEL_FORWARDINGS")), @XmlEnumValue("MAX_FORWARDINGS") MAX_FORWARDINGS(String.valueOf("MAX_FORWARDINGS")), @XmlEnumValue("NOTIFICATION_RESTRICTIONS") NOTIFICATION_RESTRICTIONS(String.valueOf("NOTIFICATION_RESTRICTIONS")), @XmlEnumValue("GSUITE_EXTENSION") GSUITE_EXTENSION(String.valueOf("GSUITE_EXTENSION"));


    private String value;

    RestrictionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RestrictionEnum fromValue(String v) {
        for (RestrictionEnum b : RestrictionEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private RestrictionEnum restriction = null;
  @ApiModelProperty(value = "")
  private Object value = null;
  @ApiModelProperty(example = "w0", value = "")
  private String target = null;

 /**
   * Get restriction
   * @return restriction
  **/
  public RestrictionEnum getRestriction() {
    return restriction;
  }

  public void setRestriction(RestrictionEnum restriction) {
    this.restriction = restriction;
  }

  public RestrictionItem restriction(RestrictionEnum restriction) {
    this.restriction = restriction;
    return this;
  }

 /**
   * Get value
   * @return value
  **/
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public RestrictionItem value(Object value) {
    this.value = value;
    return this;
  }

 /**
   * Get target
   * @return target
  **/
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public RestrictionItem target(String target) {
    this.target = target;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestrictionItem {\n");
    
    sb.append("    restriction: ").append(toIndentedString(restriction)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

