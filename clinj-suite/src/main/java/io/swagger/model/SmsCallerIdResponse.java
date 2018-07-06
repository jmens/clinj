package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class SmsCallerIdResponse  {
  
  @ApiModelProperty(value = "")
  private Integer id = null;
  @ApiModelProperty(value = "")
  private String phonenumber = null;
  @ApiModelProperty(value = "")
  private Boolean verified = false;
  @ApiModelProperty(value = "")
  private Boolean defaultNumber = false;

 /**
   * Get id
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SmsCallerIdResponse id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get phonenumber
   * @return phonenumber
  **/
  public String getPhonenumber() {
    return phonenumber;
  }

  public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
  }

  public SmsCallerIdResponse phonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
    return this;
  }

 /**
   * Get verified
   * @return verified
  **/
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public SmsCallerIdResponse verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

 /**
   * Get defaultNumber
   * @return defaultNumber
  **/
  public Boolean getDefaultNumber() {
    return defaultNumber;
  }

  public void setDefaultNumber(Boolean defaultNumber) {
    this.defaultNumber = defaultNumber;
  }

  public SmsCallerIdResponse defaultNumber(Boolean defaultNumber) {
    this.defaultNumber = defaultNumber;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsCallerIdResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    phonenumber: ").append(toIndentedString(phonenumber)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    defaultNumber: ").append(toIndentedString(defaultNumber)).append("\n");
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

