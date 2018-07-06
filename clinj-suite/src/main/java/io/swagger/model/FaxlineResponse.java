package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class FaxlineResponse  {
  
  @ApiModelProperty(example = "f0", value = "")
  private String id = null;
  @ApiModelProperty(example = "Alexander Bain's fax", value = "")
  private String alias = null;
  @ApiModelProperty(example = "Example Ltd.", value = "")
  private String tagline = null;
  @ApiModelProperty(value = "")
  private Boolean canSend = false;
  @ApiModelProperty(value = "")
  private Boolean canReceive = false;

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

  public FaxlineResponse id(String id) {
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

  public FaxlineResponse alias(String alias) {
    this.alias = alias;
    return this;
  }

 /**
   * Get tagline
   * @return tagline
  **/
  public String getTagline() {
    return tagline;
  }

  public void setTagline(String tagline) {
    this.tagline = tagline;
  }

  public FaxlineResponse tagline(String tagline) {
    this.tagline = tagline;
    return this;
  }

 /**
   * Get canSend
   * @return canSend
  **/
  public Boolean getCanSend() {
    return canSend;
  }

  public void setCanSend(Boolean canSend) {
    this.canSend = canSend;
  }

  public FaxlineResponse canSend(Boolean canSend) {
    this.canSend = canSend;
    return this;
  }

 /**
   * Get canReceive
   * @return canReceive
  **/
  public Boolean getCanReceive() {
    return canReceive;
  }

  public void setCanReceive(Boolean canReceive) {
    this.canReceive = canReceive;
  }

  public FaxlineResponse canReceive(Boolean canReceive) {
    this.canReceive = canReceive;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxlineResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    tagline: ").append(toIndentedString(tagline)).append("\n");
    sb.append("    canSend: ").append(toIndentedString(canSend)).append("\n");
    sb.append("    canReceive: ").append(toIndentedString(canReceive)).append("\n");
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

