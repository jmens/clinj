package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class PropertiesResponse  {
  
  @ApiModelProperty(value = "")
  private Boolean identityVerificationRequired = false;
  @ApiModelProperty(value = "")
  private Boolean welcomeScreenEnabled = false;
  @ApiModelProperty(value = "")
  private Boolean verificationLetterCodeRequired = false;

 /**
   * Get identityVerificationRequired
   * @return identityVerificationRequired
  **/
  public Boolean getIdentityVerificationRequired() {
    return identityVerificationRequired;
  }

  public void setIdentityVerificationRequired(Boolean identityVerificationRequired) {
    this.identityVerificationRequired = identityVerificationRequired;
  }

  public PropertiesResponse identityVerificationRequired(Boolean identityVerificationRequired) {
    this.identityVerificationRequired = identityVerificationRequired;
    return this;
  }

 /**
   * Get welcomeScreenEnabled
   * @return welcomeScreenEnabled
  **/
  public Boolean getWelcomeScreenEnabled() {
    return welcomeScreenEnabled;
  }

  public void setWelcomeScreenEnabled(Boolean welcomeScreenEnabled) {
    this.welcomeScreenEnabled = welcomeScreenEnabled;
  }

  public PropertiesResponse welcomeScreenEnabled(Boolean welcomeScreenEnabled) {
    this.welcomeScreenEnabled = welcomeScreenEnabled;
    return this;
  }

 /**
   * Get verificationLetterCodeRequired
   * @return verificationLetterCodeRequired
  **/
  public Boolean getVerificationLetterCodeRequired() {
    return verificationLetterCodeRequired;
  }

  public void setVerificationLetterCodeRequired(Boolean verificationLetterCodeRequired) {
    this.verificationLetterCodeRequired = verificationLetterCodeRequired;
  }

  public PropertiesResponse verificationLetterCodeRequired(Boolean verificationLetterCodeRequired) {
    this.verificationLetterCodeRequired = verificationLetterCodeRequired;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesResponse {\n");
    
    sb.append("    identityVerificationRequired: ").append(toIndentedString(identityVerificationRequired)).append("\n");
    sb.append("    welcomeScreenEnabled: ").append(toIndentedString(welcomeScreenEnabled)).append("\n");
    sb.append("    verificationLetterCodeRequired: ").append(toIndentedString(verificationLetterCodeRequired)).append("\n");
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

