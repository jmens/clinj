package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class AddressResponse  {
  
  @ApiModelProperty(value = "")
  private String poBox = null;
  @ApiModelProperty(value = "")
  private String extendedAddress = null;
  @ApiModelProperty(value = "")
  private String streetAddress = null;
  @ApiModelProperty(value = "")
  private String locality = null;
  @ApiModelProperty(value = "")
  private String region = null;
  @ApiModelProperty(value = "")
  private String postalCode = null;
  @ApiModelProperty(value = "")
  private String country = null;

 /**
   * Get poBox
   * @return poBox
  **/
  public String getPoBox() {
    return poBox;
  }

  public void setPoBox(String poBox) {
    this.poBox = poBox;
  }

  public AddressResponse poBox(String poBox) {
    this.poBox = poBox;
    return this;
  }

 /**
   * Get extendedAddress
   * @return extendedAddress
  **/
  public String getExtendedAddress() {
    return extendedAddress;
  }

  public void setExtendedAddress(String extendedAddress) {
    this.extendedAddress = extendedAddress;
  }

  public AddressResponse extendedAddress(String extendedAddress) {
    this.extendedAddress = extendedAddress;
    return this;
  }

 /**
   * Get streetAddress
   * @return streetAddress
  **/
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public AddressResponse streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

 /**
   * Get locality
   * @return locality
  **/
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public AddressResponse locality(String locality) {
    this.locality = locality;
    return this;
  }

 /**
   * Get region
   * @return region
  **/
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public AddressResponse region(String region) {
    this.region = region;
    return this;
  }

 /**
   * Get postalCode
   * @return postalCode
  **/
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public AddressResponse postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

 /**
   * Get country
   * @return country
  **/
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AddressResponse country(String country) {
    this.country = country;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressResponse {\n");
    
    sb.append("    poBox: ").append(toIndentedString(poBox)).append("\n");
    sb.append("    extendedAddress: ").append(toIndentedString(extendedAddress)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

