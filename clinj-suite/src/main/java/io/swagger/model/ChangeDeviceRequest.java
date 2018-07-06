package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class ChangeDeviceRequest  {
  
  @ApiModelProperty(value = "")
  private Boolean dnd = false;
  @ApiModelProperty(value = "")
  private Integer emergencyAddressId = null;

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

  public ChangeDeviceRequest dnd(Boolean dnd) {
    this.dnd = dnd;
    return this;
  }

 /**
   * Get emergencyAddressId
   * @return emergencyAddressId
  **/
  public Integer getEmergencyAddressId() {
    return emergencyAddressId;
  }

  public void setEmergencyAddressId(Integer emergencyAddressId) {
    this.emergencyAddressId = emergencyAddressId;
  }

  public ChangeDeviceRequest emergencyAddressId(Integer emergencyAddressId) {
    this.emergencyAddressId = emergencyAddressId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeDeviceRequest {\n");
    
    sb.append("    dnd: ").append(toIndentedString(dnd)).append("\n");
    sb.append("    emergencyAddressId: ").append(toIndentedString(emergencyAddressId)).append("\n");
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

