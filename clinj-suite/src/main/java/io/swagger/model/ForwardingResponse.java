package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class ForwardingResponse  {
  
  @ApiModelProperty(example = "Accounting group", value = "")
  private String alias = null;
  @ApiModelProperty(example = "p1", value = "")
  private String destination = null;
  @ApiModelProperty(value = "")
  private Integer timeout = null;
  @ApiModelProperty(value = "")
  private Boolean active = false;

 /**
   * Get alias
   * @return alias
  **/
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public ForwardingResponse alias(String alias) {
    this.alias = alias;
    return this;
  }

 /**
   * Get destination
   * @return destination
  **/
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public ForwardingResponse destination(String destination) {
    this.destination = destination;
    return this;
  }

 /**
   * Get timeout
   * @return timeout
  **/
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public ForwardingResponse timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ForwardingResponse active(Boolean active) {
    this.active = active;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForwardingResponse {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

