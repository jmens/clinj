package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class ActivateSimRequest  {
  
  @ApiModelProperty(example = "1234567", value = "")
  private String simId = null;

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

  public ActivateSimRequest simId(String simId) {
    this.simId = simId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivateSimRequest {\n");
    
    sb.append("    simId: ").append(toIndentedString(simId)).append("\n");
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

