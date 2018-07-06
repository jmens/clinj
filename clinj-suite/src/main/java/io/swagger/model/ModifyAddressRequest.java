package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class ModifyAddressRequest  {
  
  @ApiModelProperty(example = "DE", required = true, value = "")
  private String countrycode = null;
  @ApiModelProperty(example = "NRW", value = "")
  private String state = null;
  @ApiModelProperty(example = "40219", required = true, value = "")
  private String postcode = null;
  @ApiModelProperty(example = "Düsseldorf", required = true, value = "")
  private String city = null;
  @ApiModelProperty(example = "Gladbacher Str.", value = "")
  private String street = null;
  @ApiModelProperty(example = "74", value = "")
  private String number = null;
  @ApiModelProperty(example = "1-3 Spring Gardens", value = "")
  private String address1 = null;
  @ApiModelProperty(example = "Flat A", value = "")
  private String address2 = null;

 /**
   * Get countrycode
   * @return countrycode
  **/
  public String getCountrycode() {
    return countrycode;
  }

  public void setCountrycode(String countrycode) {
    this.countrycode = countrycode;
  }

  public ModifyAddressRequest countrycode(String countrycode) {
    this.countrycode = countrycode;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ModifyAddressRequest state(String state) {
    this.state = state;
    return this;
  }

 /**
   * Get postcode
   * @return postcode
  **/
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public ModifyAddressRequest postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

 /**
   * Get city
   * @return city
  **/
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ModifyAddressRequest city(String city) {
    this.city = city;
    return this;
  }

 /**
   * Get street
   * @return street
  **/
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public ModifyAddressRequest street(String street) {
    this.street = street;
    return this;
  }

 /**
   * Get number
   * @return number
  **/
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public ModifyAddressRequest number(String number) {
    this.number = number;
    return this;
  }

 /**
   * Get address1
   * @return address1
  **/
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public ModifyAddressRequest address1(String address1) {
    this.address1 = address1;
    return this;
  }

 /**
   * Get address2
   * @return address2
  **/
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public ModifyAddressRequest address2(String address2) {
    this.address2 = address2;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyAddressRequest {\n");
    
    sb.append("    countrycode: ").append(toIndentedString(countrycode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
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

