package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class ResendFaxRequest  {
  
  @ApiModelProperty(example = "100018428", required = true, value = "")
  private String faxId = null;
  @ApiModelProperty(example = "f0", required = true, value = "")
  private String faxlineId = null;

 /**
   * Get faxId
   * @return faxId
  **/
  public String getFaxId() {
    return faxId;
  }

  public void setFaxId(String faxId) {
    this.faxId = faxId;
  }

  public ResendFaxRequest faxId(String faxId) {
    this.faxId = faxId;
    return this;
  }

 /**
   * Get faxlineId
   * @return faxlineId
  **/
  public String getFaxlineId() {
    return faxlineId;
  }

  public void setFaxlineId(String faxlineId) {
    this.faxlineId = faxlineId;
  }

  public ResendFaxRequest faxlineId(String faxlineId) {
    this.faxlineId = faxlineId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResendFaxRequest {\n");
    
    sb.append("    faxId: ").append(toIndentedString(faxId)).append("\n");
    sb.append("    faxlineId: ").append(toIndentedString(faxlineId)).append("\n");
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

