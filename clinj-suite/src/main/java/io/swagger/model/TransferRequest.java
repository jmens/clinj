package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class TransferRequest  {
  
  @ApiModelProperty(example = "false", required = true, value = "The transfer is attended or blind")
  private Boolean attended = false;
  @ApiModelProperty(example = "+4915799912345", required = true, value = "Transfer target phone number")
  private String phoneNumber = null;

 /**
   * The transfer is attended or blind
   * @return attended
  **/
  public Boolean getAttended() {
    return attended;
  }

  public void setAttended(Boolean attended) {
    this.attended = attended;
  }

  public TransferRequest attended(Boolean attended) {
    this.attended = attended;
    return this;
  }

 /**
   * Transfer target phone number
   * @return phoneNumber
  **/
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public TransferRequest phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRequest {\n");
    
    sb.append("    attended: ").append(toIndentedString(attended)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

