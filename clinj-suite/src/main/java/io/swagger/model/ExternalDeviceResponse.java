package io.swagger.model;

import io.swagger.model.ActiveRouting;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class ExternalDeviceResponse  {
  
  @ApiModelProperty(example = "e0", value = "")
  private String id = null;
  @ApiModelProperty(example = "VoIP phone of Grace Hopper", value = "")
  private String alias = null;

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("REGISTER") REGISTER(String.valueOf("REGISTER")), @XmlEnumValue("MOBILE") MOBILE(String.valueOf("MOBILE")), @XmlEnumValue("EXTERNAL") EXTERNAL(String.valueOf("EXTERNAL"));


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
  @ApiModelProperty(value = "")
  private Boolean online = false;
  @ApiModelProperty(value = "")
  private Boolean dnd = false;
  @ApiModelProperty(value = "")
  private List<ActiveRouting> activePhonelines = new ArrayList<ActiveRouting>();
  @ApiModelProperty(value = "")
  private List<ActiveRouting> activeGroups = new ArrayList<ActiveRouting>();
  @ApiModelProperty(example = "+4915799912345", value = "")
  private String number = null;

@XmlType(name="IncomingCallDisplayStateEnum")
@XmlEnum(String.class)
public enum IncomingCallDisplayStateEnum {

@XmlEnumValue("CALLED_NUMBER") CALLED_NUMBER(String.valueOf("CALLED_NUMBER")), @XmlEnumValue("CALLER_NUMBER") CALLER_NUMBER(String.valueOf("CALLER_NUMBER"));


    private String value;

    IncomingCallDisplayStateEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IncomingCallDisplayStateEnum fromValue(String v) {
        for (IncomingCallDisplayStateEnum b : IncomingCallDisplayStateEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private IncomingCallDisplayStateEnum incomingCallDisplayState = null;

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

  public ExternalDeviceResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get alias
   * @return alias
  **/
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public ExternalDeviceResponse alias(String alias) {
    this.alias = alias;
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

  public ExternalDeviceResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get online
   * @return online
  **/
  public Boolean getOnline() {
    return online;
  }

  public void setOnline(Boolean online) {
    this.online = online;
  }

  public ExternalDeviceResponse online(Boolean online) {
    this.online = online;
    return this;
  }

 /**
   * Get dnd
   * @return dnd
  **/
  public Boolean getDnd() {
    return dnd;
  }

  public void setDnd(Boolean dnd) {
    this.dnd = dnd;
  }

  public ExternalDeviceResponse dnd(Boolean dnd) {
    this.dnd = dnd;
    return this;
  }

 /**
   * Get activePhonelines
   * @return activePhonelines
  **/
  public List<ActiveRouting> getActivePhonelines() {
    return activePhonelines;
  }

  public void setActivePhonelines(List<ActiveRouting> activePhonelines) {
    this.activePhonelines = activePhonelines;
  }

  public ExternalDeviceResponse activePhonelines(List<ActiveRouting> activePhonelines) {
    this.activePhonelines = activePhonelines;
    return this;
  }

  public ExternalDeviceResponse addActivePhonelinesItem(ActiveRouting activePhonelinesItem) {
    this.activePhonelines.add(activePhonelinesItem);
    return this;
  }

 /**
   * Get activeGroups
   * @return activeGroups
  **/
  public List<ActiveRouting> getActiveGroups() {
    return activeGroups;
  }

  public void setActiveGroups(List<ActiveRouting> activeGroups) {
    this.activeGroups = activeGroups;
  }

  public ExternalDeviceResponse activeGroups(List<ActiveRouting> activeGroups) {
    this.activeGroups = activeGroups;
    return this;
  }

  public ExternalDeviceResponse addActiveGroupsItem(ActiveRouting activeGroupsItem) {
    this.activeGroups.add(activeGroupsItem);
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

  public ExternalDeviceResponse number(String number) {
    this.number = number;
    return this;
  }

 /**
   * Get incomingCallDisplayState
   * @return incomingCallDisplayState
  **/
  public IncomingCallDisplayStateEnum getIncomingCallDisplayState() {
    return incomingCallDisplayState;
  }

  public void setIncomingCallDisplayState(IncomingCallDisplayStateEnum incomingCallDisplayState) {
    this.incomingCallDisplayState = incomingCallDisplayState;
  }

  public ExternalDeviceResponse incomingCallDisplayState(IncomingCallDisplayStateEnum incomingCallDisplayState) {
    this.incomingCallDisplayState = incomingCallDisplayState;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDeviceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    dnd: ").append(toIndentedString(dnd)).append("\n");
    sb.append("    activePhonelines: ").append(toIndentedString(activePhonelines)).append("\n");
    sb.append("    activeGroups: ").append(toIndentedString(activeGroups)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    incomingCallDisplayState: ").append(toIndentedString(incomingCallDisplayState)).append("\n");
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

