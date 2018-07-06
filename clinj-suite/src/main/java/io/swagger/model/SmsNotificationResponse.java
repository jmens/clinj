package io.swagger.model;

import io.swagger.model.SmsEmailTarget;
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

public class SmsNotificationResponse  {
  
  @ApiModelProperty(example = "f0/v0/p0", value = "")
  private String endpointId = null;
  @ApiModelProperty(example = "Fax/Voicemail of Grace Hopper", value = "")
  private String endpointAlias = null;
  @ApiModelProperty(value = "")
  private List<SmsEmailTarget> emails = new ArrayList<SmsEmailTarget>();

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

  public SmsNotificationResponse endpointId(String endpointId) {
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

  public SmsNotificationResponse endpointAlias(String endpointAlias) {
    this.endpointAlias = endpointAlias;
    return this;
  }

 /**
   * Get emails
   * @return emails
  **/
  public List<SmsEmailTarget> getEmails() {
    return emails;
  }

  public void setEmails(List<SmsEmailTarget> emails) {
    this.emails = emails;
  }

  public SmsNotificationResponse emails(List<SmsEmailTarget> emails) {
    this.emails = emails;
    return this;
  }

  public SmsNotificationResponse addEmailsItem(SmsEmailTarget emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsNotificationResponse {\n");
    
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    endpointAlias: ").append(toIndentedString(endpointAlias)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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

