package io.swagger.model;

import io.swagger.model.NumberResponseWithEndpoint;
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

public class NumbersResponse  {
  
  @ApiModelProperty(value = "")
  private List<NumberResponseWithEndpoint> items = new ArrayList<NumberResponseWithEndpoint>();

 /**
   * Get items
   * @return items
  **/
  public List<NumberResponseWithEndpoint> getItems() {
    return items;
  }

  public void setItems(List<NumberResponseWithEndpoint> items) {
    this.items = items;
  }

  public NumbersResponse items(List<NumberResponseWithEndpoint> items) {
    this.items = items;
    return this;
  }

  public NumbersResponse addItemsItem(NumberResponseWithEndpoint itemsItem) {
    this.items.add(itemsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumbersResponse {\n");
    
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

