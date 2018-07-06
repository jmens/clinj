package io.swagger.model;

import io.swagger.model.CallNotificationResponse;
import io.swagger.model.FaxNotificationResponse;
import io.swagger.model.SmsNotificationResponse;
import io.swagger.model.VoicemailNotificationResponse;
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

public class NotificationsResponse  {

  @ApiModelProperty(value = "")
  private List<FaxNotificationResponse> fax = new ArrayList<FaxNotificationResponse>();
  @ApiModelProperty(value = "")
  private List<VoicemailNotificationResponse> voicemail = new ArrayList<VoicemailNotificationResponse>();
  @ApiModelProperty(value = "")
  private List<CallNotificationResponse> call = new ArrayList<CallNotificationResponse>();
  @ApiModelProperty(value = "")
  private List<SmsNotificationResponse> sms = new ArrayList<SmsNotificationResponse>();

 /**
   * Get fax
   * @return fax
  **/
  public List<FaxNotificationResponse> getFax() {
    return fax;
  }

  public void setFax(List<FaxNotificationResponse> fax) {
    this.fax = fax;
  }

  public NotificationsResponse fax(List<FaxNotificationResponse> fax) {
    this.fax = fax;
    return this;
  }

  public NotificationsResponse addFaxItem(FaxNotificationResponse faxItem) {
    this.fax.add(faxItem);
    return this;
  }

 /**
   * Get voicemail
   * @return voicemail
  **/
  public List<VoicemailNotificationResponse> getVoicemail() {
    return voicemail;
  }

  public void setVoicemail(List<VoicemailNotificationResponse> voicemail) {
    this.voicemail = voicemail;
  }

  public NotificationsResponse voicemail(List<VoicemailNotificationResponse> voicemail) {
    this.voicemail = voicemail;
    return this;
  }

  public NotificationsResponse addVoicemailItem(VoicemailNotificationResponse voicemailItem) {
    this.voicemail.add(voicemailItem);
    return this;
  }

 /**
   * Get startSynchronous
   * @return startSynchronous
  **/
  public List<CallNotificationResponse> getCall() {
    return call;
  }

  public void setCall(List<CallNotificationResponse> call) {
    this.call = call;
  }

  public NotificationsResponse call(List<CallNotificationResponse> call) {
    this.call = call;
    return this;
  }

  public NotificationsResponse addCallItem(CallNotificationResponse callItem) {
    this.call.add(callItem);
    return this;
  }

 /**
   * Get sms
   * @return sms
  **/
  public List<SmsNotificationResponse> getSms() {
    return sms;
  }

  public void setSms(List<SmsNotificationResponse> sms) {
    this.sms = sms;
  }

  public NotificationsResponse sms(List<SmsNotificationResponse> sms) {
    this.sms = sms;
    return this;
  }

  public NotificationsResponse addSmsItem(SmsNotificationResponse smsItem) {
    this.sms.add(smsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationsResponse {\n");

    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    voicemail: ").append(toIndentedString(voicemail)).append("\n");
    sb.append("    startSynchronous: ").append(toIndentedString(call)).append("\n");
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

