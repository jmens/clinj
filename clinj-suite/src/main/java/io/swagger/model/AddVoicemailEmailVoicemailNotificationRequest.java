package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class AddVoicemailEmailVoicemailNotificationRequest  {
  
  @ApiModelProperty(example = "v0", required = true, value = "")
  private String voicemailId = null;
  @ApiModelProperty(example = "grace.hopper@example.com", required = true, value = "")
  private String email = null;

 /**
   * Get voicemailId
   * @return voicemailId
  **/
  public String getVoicemailId() {
    return voicemailId;
  }

  public void setVoicemailId(String voicemailId) {
    this.voicemailId = voicemailId;
  }

  public AddVoicemailEmailVoicemailNotificationRequest voicemailId(String voicemailId) {
    this.voicemailId = voicemailId;
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

  public AddVoicemailEmailVoicemailNotificationRequest email(String email) {
    this.email = email;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddVoicemailEmailVoicemailNotificationRequest {\n");
    
    sb.append("    voicemailId: ").append(toIndentedString(voicemailId)).append("\n");
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

