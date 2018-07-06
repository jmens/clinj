package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class VoicemailResponse  {
  
  @ApiModelProperty(example = "v0", value = "")
  private String id = null;
  @ApiModelProperty(example = "Voicemail of Grace Hopper", value = "")
  private String alias = null;
  @ApiModelProperty(example = "20", value = "")
  private Integer timeout = null;
  @ApiModelProperty(value = "")
  private Boolean active = false;
  @ApiModelProperty(value = "")
  private Boolean transcription = false;
  @ApiModelProperty(value = "")
  private Boolean canTranscribe = false;
  @ApiModelProperty(value = "")
  private String greetingsUrl = null;
  @ApiModelProperty(value = "")
  private String activeGreetingAlias = null;
  @ApiModelProperty(value = "")
  private String activeGreetingId = null;
  @ApiModelProperty(example = "50000", value = "")
  private String accessNumber = null;

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

  public VoicemailResponse id(String id) {
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

  public VoicemailResponse alias(String alias) {
    this.alias = alias;
    return this;
  }

 /**
   * Get timeout
   * @return timeout
  **/
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public VoicemailResponse timeout(Integer timeout) {
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

  public VoicemailResponse active(Boolean active) {
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

  public VoicemailResponse transcription(Boolean transcription) {
    this.transcription = transcription;
    return this;
  }

 /**
   * Get canTranscribe
   * @return canTranscribe
  **/
  public Boolean getCanTranscribe() {
    return canTranscribe;
  }

  public void setCanTranscribe(Boolean canTranscribe) {
    this.canTranscribe = canTranscribe;
  }

  public VoicemailResponse canTranscribe(Boolean canTranscribe) {
    this.canTranscribe = canTranscribe;
    return this;
  }

 /**
   * Get greetingsUrl
   * @return greetingsUrl
  **/
  public String getGreetingsUrl() {
    return greetingsUrl;
  }

  public void setGreetingsUrl(String greetingsUrl) {
    this.greetingsUrl = greetingsUrl;
  }

  public VoicemailResponse greetingsUrl(String greetingsUrl) {
    this.greetingsUrl = greetingsUrl;
    return this;
  }

 /**
   * Get activeGreetingAlias
   * @return activeGreetingAlias
  **/
  public String getActiveGreetingAlias() {
    return activeGreetingAlias;
  }

  public void setActiveGreetingAlias(String activeGreetingAlias) {
    this.activeGreetingAlias = activeGreetingAlias;
  }

  public VoicemailResponse activeGreetingAlias(String activeGreetingAlias) {
    this.activeGreetingAlias = activeGreetingAlias;
    return this;
  }

 /**
   * Get activeGreetingId
   * @return activeGreetingId
  **/
  public String getActiveGreetingId() {
    return activeGreetingId;
  }

  public void setActiveGreetingId(String activeGreetingId) {
    this.activeGreetingId = activeGreetingId;
  }

  public VoicemailResponse activeGreetingId(String activeGreetingId) {
    this.activeGreetingId = activeGreetingId;
    return this;
  }

 /**
   * Get accessNumber
   * @return accessNumber
  **/
  public String getAccessNumber() {
    return accessNumber;
  }

  public void setAccessNumber(String accessNumber) {
    this.accessNumber = accessNumber;
  }

  public VoicemailResponse accessNumber(String accessNumber) {
    this.accessNumber = accessNumber;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    transcription: ").append(toIndentedString(transcription)).append("\n");
    sb.append("    canTranscribe: ").append(toIndentedString(canTranscribe)).append("\n");
    sb.append("    greetingsUrl: ").append(toIndentedString(greetingsUrl)).append("\n");
    sb.append("    activeGreetingAlias: ").append(toIndentedString(activeGreetingAlias)).append("\n");
    sb.append("    activeGreetingId: ").append(toIndentedString(activeGreetingId)).append("\n");
    sb.append("    accessNumber: ").append(toIndentedString(accessNumber)).append("\n");
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

