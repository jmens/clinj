package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class RegisteredDevice  {
  
  @ApiModelProperty(value = "")
  private String userAgent = null;
  @ApiModelProperty(value = "")
  private String ip = null;
  @ApiModelProperty(value = "")
  private String port = null;

 /**
   * Get userAgent
   * @return userAgent
  **/
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public RegisteredDevice userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

 /**
   * Get ip
   * @return ip
  **/
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public RegisteredDevice ip(String ip) {
    this.ip = ip;
    return this;
  }

 /**
   * Get port
   * @return port
  **/
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public RegisteredDevice port(String port) {
    this.port = port;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisteredDevice {\n");
    
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

