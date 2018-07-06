package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class MobileCredentialsResponse  {
  
  @ApiModelProperty(example = "1234567", value = "")
  private String simId = null;
  @ApiModelProperty(example = "12345", value = "")
  private String puk1 = null;
  @ApiModelProperty(example = "67890", value = "")
  private String puk2 = null;

 /**
   * Get simId
   * @return simId
  **/
  public String getSimId() {
    return simId;
  }

  public void setSimId(String simId) {
    this.simId = simId;
  }

  public MobileCredentialsResponse simId(String simId) {
    this.simId = simId;
    return this;
  }

 /**
   * Get puk1
   * @return puk1
  **/
  public String getPuk1() {
    return puk1;
  }

  public void setPuk1(String puk1) {
    this.puk1 = puk1;
  }

  public MobileCredentialsResponse puk1(String puk1) {
    this.puk1 = puk1;
    return this;
  }

 /**
   * Get puk2
   * @return puk2
  **/
  public String getPuk2() {
    return puk2;
  }

  public void setPuk2(String puk2) {
    this.puk2 = puk2;
  }

  public MobileCredentialsResponse puk2(String puk2) {
    this.puk2 = puk2;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileCredentialsResponse {\n");
    
    sb.append("    simId: ").append(toIndentedString(simId)).append("\n");
    sb.append("    puk1: ").append(toIndentedString(puk1)).append("\n");
    sb.append("    puk2: ").append(toIndentedString(puk2)).append("\n");
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

