package io.swagger.model;

import io.swagger.model.UserResponse;
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

public class UsersResponse  {
  
  @ApiModelProperty(value = "")
  private List<UserResponse> items = new ArrayList<UserResponse>();

 /**
   * Get items
   * @return items
  **/
  public List<UserResponse> getItems() {
    return items;
  }

  public void setItems(List<UserResponse> items) {
    this.items = items;
  }

  public UsersResponse items(List<UserResponse> items) {
    this.items = items;
    return this;
  }

  public UsersResponse addItemsItem(UserResponse itemsItem) {
    this.items.add(itemsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersResponse {\n");
    
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

