package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class AddCallEmailNotificationRequest  {
  
  @ApiModelProperty(example = "e0/p0", required = true, value = "")
  private String endpointId = null;
  @ApiModelProperty(example = "INCOMING", required = true, value = "")
  private String direction = null;
  @ApiModelProperty(example = "MISSED", required = true, value = "")
  private String cause = null;
  @ApiModelProperty(example = "grace.hopper@example.com", required = true, value = "")
  private String email = null;

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

  public AddCallEmailNotificationRequest endpointId(String endpointId) {
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

  public AddCallEmailNotificationRequest direction(String direction) {
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

  public AddCallEmailNotificationRequest cause(String cause) {
    this.cause = cause;
    return this;
  }

 /**
   * Get email
   * @return email
  **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AddCallEmailNotificationRequest email(String email) {
    this.email = email;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCallEmailNotificationRequest {\n");
    
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

