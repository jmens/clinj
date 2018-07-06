package io.swagger.model;

import io.swagger.model.PortingResponse;
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

public class PortingsResponse  {
  
  @ApiModelProperty(value = "")
  private List<PortingResponse> items = new ArrayList<PortingResponse>();

 /**
   * Get items
   * @return items
  **/
  public List<PortingResponse> getItems() {
    return items;
  }

  public void setItems(List<PortingResponse> items) {
    this.items = items;
  }

  public PortingsResponse items(List<PortingResponse> items) {
    this.items = items;
    return this;
  }

  public PortingsResponse addItemsItem(PortingResponse itemsItem) {
    this.items.add(itemsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortingsResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

