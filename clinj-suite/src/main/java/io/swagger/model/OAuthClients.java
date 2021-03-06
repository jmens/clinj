package io.swagger.model;

import io.swagger.model.OAuthClient;
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

public class OAuthClients  {
  
  @ApiModelProperty(value = "")
  private List<OAuthClient> data = new ArrayList<OAuthClient>();

 /**
   * Get data
   * @return data
  **/
  public List<OAuthClient> getData() {
    return data;
  }

  public void setData(List<OAuthClient> data) {
    this.data = data;
  }

  public OAuthClients data(List<OAuthClient> data) {
    this.data = data;
    return this;
  }

  public OAuthClients addDataItem(OAuthClient dataItem) {
    this.data.add(dataItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthClients {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

