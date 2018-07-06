package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class SetSipgateIoPhonelineSettingsRequest  {
  
  @ApiModelProperty(value = "")
  private Boolean incomingActive = false;
  @ApiModelProperty(value = "")
  private Boolean outgoingActive = false;
  @ApiModelProperty(example = "https://io.sipgate.beer/my/incoming/url", required = true, value = "")
  private String incomingUrl = null;
  @ApiModelProperty(example = "https://io.sipgate.rehab/my/outgoing/url", required = true, value = "")
  private String outgoingUrl = null;
  @ApiModelProperty(value = "")
  private Boolean log = false;
  @ApiModelProperty(example = "-----BEGIN CERTIFICATE-----", value = "")
  private String certificate = null;
  @ApiModelProperty(value = "")
  private Boolean allowSelfSigned = false;

 /**
   * Get incomingActive
   * @return incomingActive
  **/
  public Boolean getIncomingActive() {
    return incomingActive;
  }

  public void setIncomingActive(Boolean incomingActive) {
    this.incomingActive = incomingActive;
  }

  public SetSipgateIoPhonelineSettingsRequest incomingActive(Boolean incomingActive) {
    this.incomingActive = incomingActive;
    return this;
  }

 /**
   * Get outgoingActive
   * @return outgoingActive
  **/
  public Boolean getOutgoingActive() {
    return outgoingActive;
  }

  public void setOutgoingActive(Boolean outgoingActive) {
    this.outgoingActive = outgoingActive;
  }

  public SetSipgateIoPhonelineSettingsRequest outgoingActive(Boolean outgoingActive) {
    this.outgoingActive = outgoingActive;
    return this;
  }

 /**
   * Get incomingUrl
   * @return incomingUrl
  **/
  public String getIncomingUrl() {
    return incomingUrl;
  }

  public void setIncomingUrl(String incomingUrl) {
    this.incomingUrl = incomingUrl;
  }

  public SetSipgateIoPhonelineSettingsRequest incomingUrl(String incomingUrl) {
    this.incomingUrl = incomingUrl;
    return this;
  }

 /**
   * Get outgoingUrl
   * @return outgoingUrl
  **/
  public String getOutgoingUrl() {
    return outgoingUrl;
  }

  public void setOutgoingUrl(String outgoingUrl) {
    this.outgoingUrl = outgoingUrl;
  }

  public SetSipgateIoPhonelineSettingsRequest outgoingUrl(String outgoingUrl) {
    this.outgoingUrl = outgoingUrl;
    return this;
  }

 /**
   * Get log
   * @return log
  **/
  public Boolean getLog() {
    return log;
  }

  public void setLog(Boolean log) {
    this.log = log;
  }

  public SetSipgateIoPhonelineSettingsRequest log(Boolean log) {
    this.log = log;
    return this;
  }

 /**
   * Get certificate
   * @return certificate
  **/
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public SetSipgateIoPhonelineSettingsRequest certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

 /**
   * Get allowSelfSigned
   * @return allowSelfSigned
  **/
  public Boolean getAllowSelfSigned() {
    return allowSelfSigned;
  }

  public void setAllowSelfSigned(Boolean allowSelfSigned) {
    this.allowSelfSigned = allowSelfSigned;
  }

  public SetSipgateIoPhonelineSettingsRequest allowSelfSigned(Boolean allowSelfSigned) {
    this.allowSelfSigned = allowSelfSigned;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetSipgateIoPhonelineSettingsRequest {\n");
    
    sb.append("    incomingActive: ").append(toIndentedString(incomingActive)).append("\n");
    sb.append("    outgoingActive: ").append(toIndentedString(outgoingActive)).append("\n");
    sb.append("    incomingUrl: ").append(toIndentedString(incomingUrl)).append("\n");
    sb.append("    outgoingUrl: ").append(toIndentedString(outgoingUrl)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    allowSelfSigned: ").append(toIndentedString(allowSelfSigned)).append("\n");
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

