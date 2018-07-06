package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class PhonelineSipgateIoLogResponse  {
  
  @ApiModelProperty(example = "2015-10-21T19:28:00Z", value = "")
  private String created = null;
  @ApiModelProperty(example = "https://demo.sipgate.io", value = "")
  private String url = null;
  @ApiModelProperty(example = "event=newCall&from=492111234567&to=4915791234567&direction=in&callId=123456&user[]=Alice", value = "")
  private String request = null;
  @ApiModelProperty(example = "HTTP/1.1 200 OK...", value = "")
  private String response = null;
  @ApiModelProperty(example = "Response does not have content type application/xml", value = "")
  private String xmlError = null;
  @ApiModelProperty(example = "200", value = "")
  private String status = null;

 /**
   * Get created
   * @return created
  **/
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public PhonelineSipgateIoLogResponse created(String created) {
    this.created = created;
    return this;
  }

 /**
   * Get url
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PhonelineSipgateIoLogResponse url(String url) {
    this.url = url;
    return this;
  }

 /**
   * Get request
   * @return request
  **/
  public String getRequest() {
    return request;
  }

  public void setRequest(String request) {
    this.request = request;
  }

  public PhonelineSipgateIoLogResponse request(String request) {
    this.request = request;
    return this;
  }

 /**
   * Get response
   * @return response
  **/
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public PhonelineSipgateIoLogResponse response(String response) {
    this.response = response;
    return this;
  }

 /**
   * Get xmlError
   * @return xmlError
  **/
  public String getXmlError() {
    return xmlError;
  }

  public void setXmlError(String xmlError) {
    this.xmlError = xmlError;
  }

  public PhonelineSipgateIoLogResponse xmlError(String xmlError) {
    this.xmlError = xmlError;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PhonelineSipgateIoLogResponse status(String status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhonelineSipgateIoLogResponse {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    xmlError: ").append(toIndentedString(xmlError)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

