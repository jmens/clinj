package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class ContingentResponse  {
  
  @ApiModelProperty(example = "DATA_FAST", value = "")
  private String type = null;
  @ApiModelProperty(example = "2500", value = "")
  private Integer amount = null;
  @ApiModelProperty(example = "1000", value = "")
  private Integer used = null;
  @ApiModelProperty(example = "1500", value = "")
  private Integer left = null;
  @ApiModelProperty(example = "KILOBYTE", value = "")
  private String unit = null;
  @ApiModelProperty(example = "2016-02-10T14:19:39Z", value = "")
  private String expires = null;

 /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ContingentResponse type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get amount
   * @return amount
  **/
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public ContingentResponse amount(Integer amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Get used
   * @return used
  **/
  public Integer getUsed() {
    return used;
  }

  public void setUsed(Integer used) {
    this.used = used;
  }

  public ContingentResponse used(Integer used) {
    this.used = used;
    return this;
  }

 /**
   * Get left
   * @return left
  **/
  public Integer getLeft() {
    return left;
  }

  public void setLeft(Integer left) {
    this.left = left;
  }

  public ContingentResponse left(Integer left) {
    this.left = left;
    return this;
  }

 /**
   * Get unit
   * @return unit
  **/
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public ContingentResponse unit(String unit) {
    this.unit = unit;
    return this;
  }

 /**
   * Get expires
   * @return expires
  **/
  public String getExpires() {
    return expires;
  }

  public void setExpires(String expires) {
    this.expires = expires;
  }

  public ContingentResponse expires(String expires) {
    this.expires = expires;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContingentResponse {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
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

