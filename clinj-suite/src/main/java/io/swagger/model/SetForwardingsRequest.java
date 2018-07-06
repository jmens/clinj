package io.swagger.model;

import io.swagger.model.Forwarding;
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

public class SetForwardingsRequest  {
  
  @ApiModelProperty(value = "")
  private List<Forwarding> forwardings = new ArrayList<Forwarding>();

 /**
   * Get forwardings
   * @return forwardings
  **/
  public List<Forwarding> getForwardings() {
    return forwardings;
  }

  public void setForwardings(List<Forwarding> forwardings) {
    this.forwardings = forwardings;
  }

  public SetForwardingsRequest forwardings(List<Forwarding> forwardings) {
    this.forwardings = forwardings;
    return this;
  }

  public SetForwardingsRequest addForwardingsItem(Forwarding forwardingsItem) {
    this.forwardings.add(forwardingsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetForwardingsRequest {\n");
    
    sb.append("    forwardings: ").append(toIndentedString(forwardings)).append("\n");
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

