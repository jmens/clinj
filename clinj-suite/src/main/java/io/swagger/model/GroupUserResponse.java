package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class GroupUserResponse  {
  
  @ApiModelProperty(example = "w0", value = "")
  private String id = null;
  @ApiModelProperty(example = "Ada", value = "")
  private String firstname = null;
  @ApiModelProperty(example = "Lovelace", value = "")
  private String lastname = null;
  @ApiModelProperty(value = "")
  private String userUrl = null;

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

  public GroupUserResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get firstname
   * @return firstname
  **/
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public GroupUserResponse firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

 /**
   * Get lastname
   * @return lastname
  **/
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public GroupUserResponse lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

 /**
   * Get userUrl
   * @return userUrl
  **/
  public String getUserUrl() {
    return userUrl;
  }

  public void setUserUrl(String userUrl) {
    this.userUrl = userUrl;
  }

  public GroupUserResponse userUrl(String userUrl) {
    this.userUrl = userUrl;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupUserResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    userUrl: ").append(toIndentedString(userUrl)).append("\n");
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

