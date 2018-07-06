package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class SipgateIoUrlResponse  {
  
  @ApiModelProperty(example = "https://io.sipgate.beer/my/incoming/url", value = "")
  private String incomingUrl = null;
  @ApiModelProperty(example = "https://io.sipgate.rehab/my/outgoing/url", value = "")
  private String outgoingUrl = null;

 /**
   * Get incomingUrl
   * @return incomingUrl
  **/
  public String getIncomingUrl() {
    return incomingUrl;
  }

  public void setIncomingUrl(String incomingUrl) {
    this.incomingUrl = incomingUrl;
  }

  public SipgateIoUrlResponse incomingUrl(String incomingUrl) {
    this.incomingUrl = incomingUrl;
    return this;
  }

 /**
   * Get outgoingUrl
   * @return outgoingUrl
  **/
  public String getOutgoingUrl() {
    return outgoingUrl;
  }

  public void setOutgoingUrl(String outgoingUrl) {
    this.outgoingUrl = outgoingUrl;
  }

  public SipgateIoUrlResponse outgoingUrl(String outgoingUrl) {
    this.outgoingUrl = outgoingUrl;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SipgateIoUrlResponse {\n");
    
    sb.append("    incomingUrl: ").append(toIndentedString(incomingUrl)).append("\n");
    sb.append("    outgoingUrl: ").append(toIndentedString(outgoingUrl)).append("\n");
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

