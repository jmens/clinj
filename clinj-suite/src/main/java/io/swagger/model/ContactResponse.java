package io.swagger.model;

import io.swagger.model.AddressResponse;
import io.swagger.model.EMailResponse;
import io.swagger.model.NumberResponse;
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

public class ContactResponse  {
  
  @ApiModelProperty(example = "b3d9af4a-78f9-11e6-8b77-86f30ca893d3", value = "")
  private String id = null;
  @ApiModelProperty(example = "Ada Lovelace", value = "")
  private String name = null;
  @ApiModelProperty(example = "4AAQSkZJRgABAQAAAQABAAD...", value = "")
  private String picture = null;
  @ApiModelProperty(value = "")
  private List<EMailResponse> emails = new ArrayList<EMailResponse>();
  @ApiModelProperty(value = "")
  private List<NumberResponse> numbers = new ArrayList<NumberResponse>();
  @ApiModelProperty(value = "")
  private List<AddressResponse> addresses = new ArrayList<AddressResponse>();
  @ApiModelProperty(value = "")
  private List<List<String>> organization = new ArrayList<List<String>>();

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

  public ContactResponse id(String id) {
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

  public ContactResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get picture
   * @return picture
  **/
  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public ContactResponse picture(String picture) {
    this.picture = picture;
    return this;
  }

 /**
   * Get emails
   * @return emails
  **/
  public List<EMailResponse> getEmails() {
    return emails;
  }

  public void setEmails(List<EMailResponse> emails) {
    this.emails = emails;
  }

  public ContactResponse emails(List<EMailResponse> emails) {
    this.emails = emails;
    return this;
  }

  public ContactResponse addEmailsItem(EMailResponse emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }

 /**
   * Get numbers
   * @return numbers
  **/
  public List<NumberResponse> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<NumberResponse> numbers) {
    this.numbers = numbers;
  }

  public ContactResponse numbers(List<NumberResponse> numbers) {
    this.numbers = numbers;
    return this;
  }

  public ContactResponse addNumbersItem(NumberResponse numbersItem) {
    this.numbers.add(numbersItem);
    return this;
  }

 /**
   * Get addresses
   * @return addresses
  **/
  public List<AddressResponse> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<AddressResponse> addresses) {
    this.addresses = addresses;
  }

  public ContactResponse addresses(List<AddressResponse> addresses) {
    this.addresses = addresses;
    return this;
  }

  public ContactResponse addAddressesItem(AddressResponse addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

 /**
   * Get organization
   * @return organization
  **/
  public List<List<String>> getOrganization() {
    return organization;
  }

  public void setOrganization(List<List<String>> organization) {
    this.organization = organization;
  }

  public ContactResponse organization(List<List<String>> organization) {
    this.organization = organization;
    return this;
  }

  public ContactResponse addOrganizationItem(List<String> organizationItem) {
    this.organization.add(organizationItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    numbers: ").append(toIndentedString(numbers)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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

