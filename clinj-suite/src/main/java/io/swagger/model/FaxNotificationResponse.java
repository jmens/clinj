package io.swagger.model;

import io.swagger.model.FaxEmailTarget;
import io.swagger.model.FaxSmsTarget;
import io.swagger.model.ReportTarget;
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

public class FaxNotificationResponse  {
  
  @ApiModelProperty(example = "f0/v0/p0", value = "")
  private String endpointId = null;
  @ApiModelProperty(example = "Fax/Voicemail of Grace Hopper", value = "")
  private String endpointAlias = null;
  @ApiModelProperty(value = "")
  private List<FaxEmailTarget> emails = new ArrayList<FaxEmailTarget>();
  @ApiModelProperty(value = "")
  private List<FaxSmsTarget> sms = new ArrayList<FaxSmsTarget>();
  @ApiModelProperty(value = "")
  private List<ReportTarget> reports = new ArrayList<ReportTarget>();

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

  public FaxNotificationResponse endpointId(String endpointId) {
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

  public FaxNotificationResponse endpointAlias(String endpointAlias) {
    this.endpointAlias = endpointAlias;
    return this;
  }

 /**
   * Get emails
   * @return emails
  **/
  public List<FaxEmailTarget> getEmails() {
    return emails;
  }

  public void setEmails(List<FaxEmailTarget> emails) {
    this.emails = emails;
  }

  public FaxNotificationResponse emails(List<FaxEmailTarget> emails) {
    this.emails = emails;
    return this;
  }

  public FaxNotificationResponse addEmailsItem(FaxEmailTarget emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }

 /**
   * Get sms
   * @return sms
  **/
  public List<FaxSmsTarget> getSms() {
    return sms;
  }

  public void setSms(List<FaxSmsTarget> sms) {
    this.sms = sms;
  }

  public FaxNotificationResponse sms(List<FaxSmsTarget> sms) {
    this.sms = sms;
    return this;
  }

  public FaxNotificationResponse addSmsItem(FaxSmsTarget smsItem) {
    this.sms.add(smsItem);
    return this;
  }

 /**
   * Get reports
   * @return reports
  **/
  public List<ReportTarget> getReports() {
    return reports;
  }

  public void setReports(List<ReportTarget> reports) {
    this.reports = reports;
  }

  public FaxNotificationResponse reports(List<ReportTarget> reports) {
    this.reports = reports;
    return this;
  }

  public FaxNotificationResponse addReportsItem(ReportTarget reportsItem) {
    this.reports.add(reportsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxNotificationResponse {\n");
    
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    endpointAlias: ").append(toIndentedString(endpointAlias)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
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

