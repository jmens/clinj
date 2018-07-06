package io.swagger.model;

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

public class InternalContactResponse  {
  
  @ApiModelProperty(example = "0a50261ebd1a390fed2bf326f2673c145582a63", value = "")
  private String id = null;
  @ApiModelProperty(example = "Ada Lovelace", value = "")
  private String name = null;
  @ApiModelProperty(value = "")
  private List<String> emails = new ArrayList<String>();
  @ApiModelProperty(value = "")
  private List<String> mobile = new ArrayList<String>();
  @ApiModelProperty(value = "")
  private List<String> landline = new ArrayList<String>();
  @ApiModelProperty(value = "")
  private List<String> fax = new ArrayList<String>();
  @ApiModelProperty(value = "")
  private List<String> directdial = new ArrayList<String>();

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

  public InternalContactResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InternalContactResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get emails
   * @return emails
  **/
  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
  }

  public InternalContactResponse emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public InternalContactResponse addEmailsItem(String emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }

 /**
   * Get mobile
   * @return mobile
  **/
  public List<String> getMobile() {
    return mobile;
  }

  public void setMobile(List<String> mobile) {
    this.mobile = mobile;
  }

  public InternalContactResponse mobile(List<String> mobile) {
    this.mobile = mobile;
    return this;
  }

  public InternalContactResponse addMobileItem(String mobileItem) {
    this.mobile.add(mobileItem);
    return this;
  }

 /**
   * Get landline
   * @return landline
  **/
  public List<String> getLandline() {
    return landline;
  }

  public void setLandline(List<String> landline) {
    this.landline = landline;
  }

  public InternalContactResponse landline(List<String> landline) {
    this.landline = landline;
    return this;
  }

  public InternalContactResponse addLandlineItem(String landlineItem) {
    this.landline.add(landlineItem);
    return this;
  }

 /**
   * Get fax
   * @return fax
  **/
  public List<String> getFax() {
    return fax;
  }

  public void setFax(List<String> fax) {
    this.fax = fax;
  }

  public InternalContactResponse fax(List<String> fax) {
    this.fax = fax;
    return this;
  }

  public InternalContactResponse addFaxItem(String faxItem) {
    this.fax.add(faxItem);
    return this;
  }

 /**
   * Get directdial
   * @return directdial
  **/
  public List<String> getDirectdial() {
    return directdial;
  }

  public void setDirectdial(List<String> directdial) {
    this.directdial = directdial;
  }

  public InternalContactResponse directdial(List<String> directdial) {
    this.directdial = directdial;
    return this;
  }

  public InternalContactResponse addDirectdialItem(String directdialItem) {
    this.directdial.add(directdialItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalContactResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    landline: ").append(toIndentedString(landline)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    directdial: ").append(toIndentedString(directdial)).append("\n");
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

