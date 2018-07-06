package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class CredentialsResponse  {
  
  @ApiModelProperty(value = "")
  private String username = null;
  @ApiModelProperty(value = "")
  private String password = null;
  @ApiModelProperty(value = "")
  private String sipServer = null;
  @ApiModelProperty(value = "")
  private String outboundProxy = null;
  @ApiModelProperty(value = "")
  private String sipServerWebsocketUrl = null;

 /**
   * Get username
   * @return username
  **/
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public CredentialsResponse username(String username) {
    this.username = username;
    return this;
  }

 /**
   * Get password
   * @return password
  **/
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CredentialsResponse password(String password) {
    this.password = password;
    return this;
  }

 /**
   * Get sipServer
   * @return sipServer
  **/
  public String getSipServer() {
    return sipServer;
  }

  public void setSipServer(String sipServer) {
    this.sipServer = sipServer;
  }

  public CredentialsResponse sipServer(String sipServer) {
    this.sipServer = sipServer;
    return this;
  }

 /**
   * Get outboundProxy
   * @return outboundProxy
  **/
  public String getOutboundProxy() {
    return outboundProxy;
  }

  public void setOutboundProxy(String outboundProxy) {
    this.outboundProxy = outboundProxy;
  }

  public CredentialsResponse outboundProxy(String outboundProxy) {
    this.outboundProxy = outboundProxy;
    return this;
  }

 /**
   * Get sipServerWebsocketUrl
   * @return sipServerWebsocketUrl
  **/
  public String getSipServerWebsocketUrl() {
    return sipServerWebsocketUrl;
  }

  public void setSipServerWebsocketUrl(String sipServerWebsocketUrl) {
    this.sipServerWebsocketUrl = sipServerWebsocketUrl;
  }

  public CredentialsResponse sipServerWebsocketUrl(String sipServerWebsocketUrl) {
    this.sipServerWebsocketUrl = sipServerWebsocketUrl;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialsResponse {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    sipServer: ").append(toIndentedString(sipServer)).append("\n");
    sb.append("    outboundProxy: ").append(toIndentedString(outboundProxy)).append("\n");
    sb.append("    sipServerWebsocketUrl: ").append(toIndentedString(sipServerWebsocketUrl)).append("\n");
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

