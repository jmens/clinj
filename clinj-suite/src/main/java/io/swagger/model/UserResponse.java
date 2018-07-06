package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class UserResponse  {
  
  @ApiModelProperty(example = "w0", value = "")
  private String id = null;
  @ApiModelProperty(example = "Ada", value = "")
  private String firstname = null;
  @ApiModelProperty(example = "Lovelace", value = "")
  private String lastname = null;
  @ApiModelProperty(example = "ada.lovelace@sipgate.love", value = "")
  private String email = null;
  @ApiModelProperty(example = "e0", value = "")
  private String defaultDevice = null;
  @ApiModelProperty(value = "")
  private Boolean admin = false;

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

  public UserResponse id(String id) {
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

  public UserResponse firstname(String firstname) {
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

  public UserResponse lastname(String lastname) {
    this.lastname = lastname;
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

  public UserResponse email(String email) {
    this.email = email;
    return this;
  }

 /**
   * Get defaultDevice
   * @return defaultDevice
  **/
  public String getDefaultDevice() {
    return defaultDevice;
  }

  public void setDefaultDevice(String defaultDevice) {
    this.defaultDevice = defaultDevice;
  }

  public UserResponse defaultDevice(String defaultDevice) {
    this.defaultDevice = defaultDevice;
    return this;
  }

 /**
   * Get admin
   * @return admin
  **/
  public Boolean getAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public UserResponse admin(Boolean admin) {
    this.admin = admin;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    defaultDevice: ").append(toIndentedString(defaultDevice)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
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

