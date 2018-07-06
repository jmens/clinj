package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class AccountResponse  {
  
  @ApiModelProperty(example = "Love sipgate", value = "")
  private String company = null;

@XmlType(name="MainProductTypeEnum")
@XmlEnum(String.class)
public enum MainProductTypeEnum {

@XmlEnumValue("AFFILIATE") AFFILIATE(String.valueOf("AFFILIATE")), @XmlEnumValue("FORMER_AFFILIATE") FORMER_AFFILIATE(String.valueOf("FORMER_AFFILIATE")), @XmlEnumValue("BASIC") BASIC(String.valueOf("BASIC")), @XmlEnumValue("FORMER_BASIC") FORMER_BASIC(String.valueOf("FORMER_BASIC")), @XmlEnumValue("SATELLITE") SATELLITE(String.valueOf("SATELLITE")), @XmlEnumValue("FORMER_SATELLITE") FORMER_SATELLITE(String.valueOf("FORMER_SATELLITE")), @XmlEnumValue("SIMQUADRAT") SIMQUADRAT(String.valueOf("SIMQUADRAT")), @XmlEnumValue("FORMER_SIMQUADRAT") FORMER_SIMQUADRAT(String.valueOf("FORMER_SIMQUADRAT")), @XmlEnumValue("TEAM") TEAM(String.valueOf("TEAM")), @XmlEnumValue("FORMER_TEAM") FORMER_TEAM(String.valueOf("FORMER_TEAM")), @XmlEnumValue("TRUNKING") TRUNKING(String.valueOf("TRUNKING")), @XmlEnumValue("CLINQ") CLINQ(String.valueOf("CLINQ")), @XmlEnumValue("FORMER_TRUNKING") FORMER_TRUNKING(String.valueOf("FORMER_TRUNKING"));


    private String value;

    MainProductTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MainProductTypeEnum fromValue(String v) {
        for (MainProductTypeEnum b : MainProductTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private MainProductTypeEnum mainProductType = null;
  @ApiModelProperty(value = "")
  private String logoUrl = null;
  @ApiModelProperty(value = "")
  private Boolean verified = false;

 /**
   * Get company
   * @return company
  **/
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public AccountResponse company(String company) {
    this.company = company;
    return this;
  }

 /**
   * Get mainProductType
   * @return mainProductType
  **/
  public MainProductTypeEnum getMainProductType() {
    return mainProductType;
  }

  public void setMainProductType(MainProductTypeEnum mainProductType) {
    this.mainProductType = mainProductType;
  }

  public AccountResponse mainProductType(MainProductTypeEnum mainProductType) {
    this.mainProductType = mainProductType;
    return this;
  }

 /**
   * Get logoUrl
   * @return logoUrl
  **/
  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  public AccountResponse logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
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

  public AccountResponse verified(Boolean verified) {
    this.verified = verified;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountResponse {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    mainProductType: ").append(toIndentedString(mainProductType)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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

