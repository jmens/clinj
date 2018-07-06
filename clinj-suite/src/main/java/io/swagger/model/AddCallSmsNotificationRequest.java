package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class AddCallSmsNotificationRequest  {
  
  @ApiModelProperty(example = "e0/p0", required = true, value = "")
  private String endpointId = null;
  @ApiModelProperty(example = "INCOMING", required = true, value = "")
  private String direction = null;
  @ApiModelProperty(example = "MISSED", required = true, value = "")
  private String cause = null;
  @ApiModelProperty(example = "+4915799912345", required = true, value = "")
  private String number = null;

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

  public AddCallSmsNotificationRequest endpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

 /**
   * Get direction
   * @return direction
  **/
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public AddCallSmsNotificationRequest direction(String direction) {
    this.direction = direction;
    return this;
  }

 /**
   * Get cause
   * @return cause
  **/
  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public AddCallSmsNotificationRequest cause(String cause) {
    this.cause = cause;
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

  public AddCallSmsNotificationRequest number(String number) {
    this.number = number;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCallSmsNotificationRequest {\n");
    
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

