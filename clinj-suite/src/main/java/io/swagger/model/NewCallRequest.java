package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class NewCallRequest  {
  
  @ApiModelProperty(example = "e0", value = "")
  private String deviceId = null;
  @ApiModelProperty(example = "e0", required = true, value = "")
  private String caller = null;
  @ApiModelProperty(example = "+4915799912345", required = true, value = "")
  private String callee = null;
  @ApiModelProperty(example = "+4915799912345", value = "")
  private String callerId = null;

 /**
   * Get deviceId
   * @return deviceId
  **/
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public NewCallRequest deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

 /**
   * Get caller
   * @return caller
  **/
  public String getCaller() {
    return caller;
  }

  public void setCaller(String caller) {
    this.caller = caller;
  }

  public NewCallRequest caller(String caller) {
    this.caller = caller;
    return this;
  }

 /**
   * Get callee
   * @return callee
  **/
  public String getCallee() {
    return callee;
  }

  public void setCallee(String callee) {
    this.callee = callee;
  }

  public NewCallRequest callee(String callee) {
    this.callee = callee;
    return this;
  }

 /**
   * Get callerId
   * @return callerId
  **/
  public String getCallerId() {
    return callerId;
  }

  public void setCallerId(String callerId) {
    this.callerId = callerId;
  }

  public NewCallRequest callerId(String callerId) {
    this.callerId = callerId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCallRequest {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    caller: ").append(toIndentedString(caller)).append("\n");
    sb.append("    callee: ").append(toIndentedString(callee)).append("\n");
    sb.append("    callerId: ").append(toIndentedString(callerId)).append("\n");
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

