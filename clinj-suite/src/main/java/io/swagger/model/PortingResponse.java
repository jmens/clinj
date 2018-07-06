package io.swagger.model;

import io.swagger.model.PortingNumberResponse;
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

public class PortingResponse  {
  
  @ApiModelProperty(value = "")
  private String id = null;
  @ApiModelProperty(example = "2015-10-21", value = "")
  private String portDate = null;
  @ApiModelProperty(value = "")
  private List<PortingNumberResponse> numbers = new ArrayList<PortingNumberResponse>();
  @ApiModelProperty(example = "200", value = "")
  private Integer status = null;
  @ApiModelProperty(value = "")
  private Boolean revocable = false;
  @ApiModelProperty(value = "")
  private Boolean pending = false;

 /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PortingResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get portDate
   * @return portDate
  **/
  public String getPortDate() {
    return portDate;
  }

  public void setPortDate(String portDate) {
    this.portDate = portDate;
  }

  public PortingResponse portDate(String portDate) {
    this.portDate = portDate;
    return this;
  }

 /**
   * Get numbers
   * @return numbers
  **/
  public List<PortingNumberResponse> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<PortingNumberResponse> numbers) {
    this.numbers = numbers;
  }

  public PortingResponse numbers(List<PortingNumberResponse> numbers) {
    this.numbers = numbers;
    return this;
  }

  public PortingResponse addNumbersItem(PortingNumberResponse numbersItem) {
    this.numbers.add(numbersItem);
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public PortingResponse status(Integer status) {
    this.status = status;
    return this;
  }

 /**
   * Get revocable
   * @return revocable
  **/
  public Boolean getRevocable() {
    return revocable;
  }

  public void setRevocable(Boolean revocable) {
    this.revocable = revocable;
  }

  public PortingResponse revocable(Boolean revocable) {
    this.revocable = revocable;
    return this;
  }

 /**
   * Get pending
   * @return pending
  **/
  public Boolean getPending() {
    return pending;
  }

  public void setPending(Boolean pending) {
    this.pending = pending;
  }

  public PortingResponse pending(Boolean pending) {
    this.pending = pending;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortingResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    portDate: ").append(toIndentedString(portDate)).append("\n");
    sb.append("    numbers: ").append(toIndentedString(numbers)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    revocable: ").append(toIndentedString(revocable)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
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

