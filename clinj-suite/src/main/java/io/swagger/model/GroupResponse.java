package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class GroupResponse  {
  
  @ApiModelProperty(example = "g0", value = "")
  private String id = null;
  @ApiModelProperty(example = "Turings Group", value = "")
  private String alias = null;
  @ApiModelProperty(value = "")
  private String groupNumbersUrl = null;
  @ApiModelProperty(value = "")
  private String groupUsersUrl = null;

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

  public GroupResponse id(String id) {
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

  public GroupResponse alias(String alias) {
    this.alias = alias;
    return this;
  }

 /**
   * Get groupNumbersUrl
   * @return groupNumbersUrl
  **/
  public String getGroupNumbersUrl() {
    return groupNumbersUrl;
  }

  public void setGroupNumbersUrl(String groupNumbersUrl) {
    this.groupNumbersUrl = groupNumbersUrl;
  }

  public GroupResponse groupNumbersUrl(String groupNumbersUrl) {
    this.groupNumbersUrl = groupNumbersUrl;
    return this;
  }

 /**
   * Get groupUsersUrl
   * @return groupUsersUrl
  **/
  public String getGroupUsersUrl() {
    return groupUsersUrl;
  }

  public void setGroupUsersUrl(String groupUsersUrl) {
    this.groupUsersUrl = groupUsersUrl;
  }

  public GroupResponse groupUsersUrl(String groupUsersUrl) {
    this.groupUsersUrl = groupUsersUrl;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    groupNumbersUrl: ").append(toIndentedString(groupNumbersUrl)).append("\n");
    sb.append("    groupUsersUrl: ").append(toIndentedString(groupUsersUrl)).append("\n");
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

