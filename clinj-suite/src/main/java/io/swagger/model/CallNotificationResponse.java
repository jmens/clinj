package io.swagger.model;

import io.swagger.model.CallEmailTarget;
import io.swagger.model.CallSmsTarget;
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

public class CallNotificationResponse  {
  
  @ApiModelProperty(example = "f0/v0/p0", value = "")
  private String endpointId = null;
  @ApiModelProperty(example = "Fax/Voicemail of Grace Hopper", value = "")
  private String endpointAlias = null;
  @ApiModelProperty(value = "")
  private List<CallEmailTarget> emails = new ArrayList<CallEmailTarget>();
  @ApiModelProperty(value = "")
  private List<CallSmsTarget> sms = new ArrayList<CallSmsTarget>();

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

  public CallNotificationResponse endpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

 /**
   * Get endpointAlias
   * @return endpointAlias
  **/
  public String getEndpointAlias() {
    return endpointAlias;
  }

  public void setEndpointAlias(String endpointAlias) {
    this.endpointAlias = endpointAlias;
  }

  public CallNotificationResponse endpointAlias(String endpointAlias) {
    this.endpointAlias = endpointAlias;
    return this;
  }

 /**
   * Get emails
   * @return emails
  **/
  public List<CallEmailTarget> getEmails() {
    return emails;
  }

  public void setEmails(List<CallEmailTarget> emails) {
    this.emails = emails;
  }

  public CallNotificationResponse emails(List<CallEmailTarget> emails) {
    this.emails = emails;
    return this;
  }

  public CallNotificationResponse addEmailsItem(CallEmailTarget emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }

 /**
   * Get sms
   * @return sms
  **/
  public List<CallSmsTarget> getSms() {
    return sms;
  }

  public void setSms(List<CallSmsTarget> sms) {
    this.sms = sms;
  }

  public CallNotificationResponse sms(List<CallSmsTarget> sms) {
    this.sms = sms;
    return this;
  }

  public CallNotificationResponse addSmsItem(CallSmsTarget smsItem) {
    this.sms.add(smsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallNotificationResponse {\n");
    
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    endpointAlias: ").append(toIndentedString(endpointAlias)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
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

