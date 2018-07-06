package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class SendFaxRequest  {
  
  @ApiModelProperty(example = "f0", required = true, value = "")
  private String faxlineId = null;
  @ApiModelProperty(example = "+4921112345678", required = true, value = "")
  private String recipient = null;
  @ApiModelProperty(example = "fax.pdf", required = true, value = "")
  private String filename = null;
  @ApiModelProperty(example = "TWF5IHRoZSBmb3VydGggYmUgd2l0aCB5b3U=", required = true, value = "")
  private String base64Content = null;

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

  public SendFaxRequest faxlineId(String faxlineId) {
    this.faxlineId = faxlineId;
    return this;
  }

 /**
   * Get recipient
   * @return recipient
  **/
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public SendFaxRequest recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

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

  public SendFaxRequest filename(String filename) {
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

  public SendFaxRequest base64Content(String base64Content) {
    this.base64Content = base64Content;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendFaxRequest {\n");
    
    sb.append("    faxlineId: ").append(toIndentedString(faxlineId)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
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

