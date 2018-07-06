package io.swagger.model;

import io.swagger.model.EmailTarget;
import io.swagger.model.SmsTarget;
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

public class VoicemailNotificationResponse  {
  
  @ApiModelProperty(example = "f0/v0/p0", value = "")
  private String endpointId = null;
  @ApiModelProperty(example = "Fax/Voicemail of Grace Hopper", value = "")
  private String endpointAlias = null;
  @ApiModelProperty(value = "")
  private List<EmailTarget> emails = new ArrayList<EmailTarget>();
  @ApiModelProperty(value = "")
  private List<SmsTarget> sms = new ArrayList<SmsTarget>();

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

  public VoicemailNotificationResponse endpointId(String endpointId) {
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

  public VoicemailNotificationResponse endpointAlias(String endpointAlias) {
    this.endpointAlias = endpointAlias;
    return this;
  }

 /**
   * Get emails
   * @return emails
  **/
  public List<EmailTarget> getEmails() {
    return emails;
  }

  public void setEmails(List<EmailTarget> emails) {
    this.emails = emails;
  }

  public VoicemailNotificationResponse emails(List<EmailTarget> emails) {
    this.emails = emails;
    return this;
  }

  public VoicemailNotificationResponse addEmailsItem(EmailTarget emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }

 /**
   * Get sms
   * @return sms
  **/
  public List<SmsTarget> getSms() {
    return sms;
  }

  public void setSms(List<SmsTarget> sms) {
    this.sms = sms;
  }

  public VoicemailNotificationResponse sms(List<SmsTarget> sms) {
    this.sms = sms;
    return this;
  }

  public VoicemailNotificationResponse addSmsItem(SmsTarget smsItem) {
    this.sms.add(smsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailNotificationResponse {\n");
    
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

