package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class AddGreetingRequest  {
  
  @ApiModelProperty(example = "greeting.mp3", value = "")
  private String filename = null;
  @ApiModelProperty(example = "RG8uIE9yIGRvIG5vdC4gVGhlcmUgaXMgbm8gdHJ5LiAtLVlvZGEK", value = "")
  private String base64Content = null;

 /**
   * Get filename
   * @return filename
  **/
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public AddGreetingRequest filename(String filename) {
    this.filename = filename;
    return this;
  }

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

  public AddGreetingRequest base64Content(String base64Content) {
    this.base64Content = base64Content;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddGreetingRequest {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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

