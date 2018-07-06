package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class ChangeVoicemailRequest  {
  
  @ApiModelProperty(example = "42", value = "")
  private Integer timeout = null;
  @ApiModelProperty(required = true, value = "")
  private Boolean active = false;
  @ApiModelProperty(required = true, value = "")
  private Boolean transcription = false;

 /**
   * Get timeout
   * minimum: 0
   * @return timeout
  **/
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public ChangeVoicemailRequest timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ChangeVoicemailRequest active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get transcription
   * @return transcription
  **/
  public Boolean getTranscription() {
    return transcription;
  }

  public void setTranscription(Boolean transcription) {
    this.transcription = transcription;
  }

  public ChangeVoicemailRequest transcription(Boolean transcription) {
    this.transcription = transcription;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeVoicemailRequest {\n");
    
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    transcription: ").append(toIndentedString(transcription)).append("\n");
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

