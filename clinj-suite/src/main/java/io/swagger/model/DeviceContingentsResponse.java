package io.swagger.model;

import io.swagger.model.ContingentResponse;
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

public class DeviceContingentsResponse  {
  
  @ApiModelProperty(value = "")
  private List<ContingentResponse> contingents = new ArrayList<ContingentResponse>();

 /**
   * Get contingents
   * @return contingents
  **/
  public List<ContingentResponse> getContingents() {
    return contingents;
  }

  public void setContingents(List<ContingentResponse> contingents) {
    this.contingents = contingents;
  }

  public DeviceContingentsResponse contingents(List<ContingentResponse> contingents) {
    this.contingents = contingents;
    return this;
  }

  public DeviceContingentsResponse addContingentsItem(ContingentResponse contingentsItem) {
    this.contingents.add(contingentsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceContingentsResponse {\n");
    
    sb.append("    contingents: ").append(toIndentedString(contingents)).append("\n");
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

