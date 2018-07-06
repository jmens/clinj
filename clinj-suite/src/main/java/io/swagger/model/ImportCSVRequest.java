package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class ImportCSVRequest  {
  
  @ApiModelProperty(example = "Zmlyc3RuYW1lLGxhc3RuYW1lLG51bWJlcgpBZGEsTG92ZWxhY2UsKzQ5MTU3OTk5MTIzNDUKQWxhbixUdXJpbmcsKzQ5MTU3OTk5MTIzNDUK", value = "")
  private String base64Content = null;

 /**
   * Get base64Content
   * @return base64Content
  **/
  public String getBase64Content() {
    return base64Content;
  }

  public void setBase64Content(String base64Content) {
    this.base64Content = base64Content;
  }

  public ImportCSVRequest base64Content(String base64Content) {
    this.base64Content = base64Content;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportCSVRequest {\n");
    
    sb.append("    base64Content: ").append(toIndentedString(base64Content)).append("\n");
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

