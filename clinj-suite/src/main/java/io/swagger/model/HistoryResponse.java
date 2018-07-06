package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.model.HistoryEntryResponse;
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

@JsonIgnoreProperties(ignoreUnknown = true)
public class HistoryResponse  {

  @ApiModelProperty(value = "")
  private List<HistoryEntryResponse> items = new ArrayList<HistoryEntryResponse>();

 /**
   * Get items
   * @return items
  **/
  public List<HistoryEntryResponse> getItems() {
    return items;
  }

  public void setItems(List<HistoryEntryResponse> items) {
    this.items = items;
  }

  public HistoryResponse items(List<HistoryEntryResponse> items) {
    this.items = items;
    return this;
  }

  public HistoryResponse addItemsItem(HistoryEntryResponse itemsItem) {
    this.items.add(itemsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryResponse {\n");

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

