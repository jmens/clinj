package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class GreetingResponse  {
  
  @ApiModelProperty(example = "42", value = "")
  private String id = null;
  @ApiModelProperty(example = "My Greeting", value = "")
  private String alias = null;
  @ApiModelProperty(example = "https://www.example.com/greeting.mp3", value = "")
  private String greetingUrl = null;
  @ApiModelProperty(value = "")
  private Boolean active = false;

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

  public GreetingResponse id(String id) {
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

  public GreetingResponse alias(String alias) {
    this.alias = alias;
    return this;
  }

 /**
   * Get greetingUrl
   * @return greetingUrl
  **/
  public String getGreetingUrl() {
    return greetingUrl;
  }

  public void setGreetingUrl(String greetingUrl) {
    this.greetingUrl = greetingUrl;
  }

  public GreetingResponse greetingUrl(String greetingUrl) {
    this.greetingUrl = greetingUrl;
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

  public GreetingResponse active(Boolean active) {
    this.active = active;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GreetingResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    greetingUrl: ").append(toIndentedString(greetingUrl)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

