package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class PhonelineResponse  {
  
  @ApiModelProperty(example = "p0", value = "")
  private String id = null;
  @ApiModelProperty(example = "Alan Turing", value = "")
  private String alias = null;
  @ApiModelProperty(value = "")
  private String blockAnonymousUrl = null;
  @ApiModelProperty(value = "")
  private String busyOnBusyUrl = null;
  @ApiModelProperty(value = "")
  private String devicesUrl = null;
  @ApiModelProperty(value = "")
  private String forwardingsUrl = null;
  @ApiModelProperty(value = "")
  private String numbersUrl = null;
  @ApiModelProperty(value = "")
  private String parallelForwardingsUrl = null;
  @ApiModelProperty(value = "")
  private String voicemailsUrl = null;

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

  public PhonelineResponse id(String id) {
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

  public PhonelineResponse alias(String alias) {
    this.alias = alias;
    return this;
  }

 /**
   * Get blockAnonymousUrl
   * @return blockAnonymousUrl
  **/
  public String getBlockAnonymousUrl() {
    return blockAnonymousUrl;
  }

  public void setBlockAnonymousUrl(String blockAnonymousUrl) {
    this.blockAnonymousUrl = blockAnonymousUrl;
  }

  public PhonelineResponse blockAnonymousUrl(String blockAnonymousUrl) {
    this.blockAnonymousUrl = blockAnonymousUrl;
    return this;
  }

 /**
   * Get busyOnBusyUrl
   * @return busyOnBusyUrl
  **/
  public String getBusyOnBusyUrl() {
    return busyOnBusyUrl;
  }

  public void setBusyOnBusyUrl(String busyOnBusyUrl) {
    this.busyOnBusyUrl = busyOnBusyUrl;
  }

  public PhonelineResponse busyOnBusyUrl(String busyOnBusyUrl) {
    this.busyOnBusyUrl = busyOnBusyUrl;
    return this;
  }

 /**
   * Get devicesUrl
   * @return devicesUrl
  **/
  public String getDevicesUrl() {
    return devicesUrl;
  }

  public void setDevicesUrl(String devicesUrl) {
    this.devicesUrl = devicesUrl;
  }

  public PhonelineResponse devicesUrl(String devicesUrl) {
    this.devicesUrl = devicesUrl;
    return this;
  }

 /**
   * Get forwardingsUrl
   * @return forwardingsUrl
  **/
  public String getForwardingsUrl() {
    return forwardingsUrl;
  }

  public void setForwardingsUrl(String forwardingsUrl) {
    this.forwardingsUrl = forwardingsUrl;
  }

  public PhonelineResponse forwardingsUrl(String forwardingsUrl) {
    this.forwardingsUrl = forwardingsUrl;
    return this;
  }

 /**
   * Get numbersUrl
   * @return numbersUrl
  **/
  public String getNumbersUrl() {
    return numbersUrl;
  }

  public void setNumbersUrl(String numbersUrl) {
    this.numbersUrl = numbersUrl;
  }

  public PhonelineResponse numbersUrl(String numbersUrl) {
    this.numbersUrl = numbersUrl;
    return this;
  }

 /**
   * Get parallelForwardingsUrl
   * @return parallelForwardingsUrl
  **/
  public String getParallelForwardingsUrl() {
    return parallelForwardingsUrl;
  }

  public void setParallelForwardingsUrl(String parallelForwardingsUrl) {
    this.parallelForwardingsUrl = parallelForwardingsUrl;
  }

  public PhonelineResponse parallelForwardingsUrl(String parallelForwardingsUrl) {
    this.parallelForwardingsUrl = parallelForwardingsUrl;
    return this;
  }

 /**
   * Get voicemailsUrl
   * @return voicemailsUrl
  **/
  public String getVoicemailsUrl() {
    return voicemailsUrl;
  }

  public void setVoicemailsUrl(String voicemailsUrl) {
    this.voicemailsUrl = voicemailsUrl;
  }

  public PhonelineResponse voicemailsUrl(String voicemailsUrl) {
    this.voicemailsUrl = voicemailsUrl;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhonelineResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    blockAnonymousUrl: ").append(toIndentedString(blockAnonymousUrl)).append("\n");
    sb.append("    busyOnBusyUrl: ").append(toIndentedString(busyOnBusyUrl)).append("\n");
    sb.append("    devicesUrl: ").append(toIndentedString(devicesUrl)).append("\n");
    sb.append("    forwardingsUrl: ").append(toIndentedString(forwardingsUrl)).append("\n");
    sb.append("    numbersUrl: ").append(toIndentedString(numbersUrl)).append("\n");
    sb.append("    parallelForwardingsUrl: ").append(toIndentedString(parallelForwardingsUrl)).append("\n");
    sb.append("    voicemailsUrl: ").append(toIndentedString(voicemailsUrl)).append("\n");
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

