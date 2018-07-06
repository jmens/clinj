package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class ChangeNumberSettingsRequest  {
  
  @ApiModelProperty(example = "p0", value = "")
  private String endpointId = null;
  @ApiModelProperty(example = "false", value = "")
  private Boolean releaseForMnp = false;
  @ApiModelProperty(example = "false", value = "")
  private Boolean quickDial = false;

 /**
   * Get endpointId
   * @return endpointId
  **/
  public String getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }

  public ChangeNumberSettingsRequest endpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

 /**
   * Get releaseForMnp
   * @return releaseForMnp
  **/
  public Boolean getReleaseForMnp() {
    return releaseForMnp;
  }

  public void setReleaseForMnp(Boolean releaseForMnp) {
    this.releaseForMnp = releaseForMnp;
  }

  public ChangeNumberSettingsRequest releaseForMnp(Boolean releaseForMnp) {
    this.releaseForMnp = releaseForMnp;
    return this;
  }

 /**
   * Get quickDial
   * @return quickDial
  **/
  public Boolean getQuickDial() {
    return quickDial;
  }

  public void setQuickDial(Boolean quickDial) {
    this.quickDial = quickDial;
  }

  public ChangeNumberSettingsRequest quickDial(Boolean quickDial) {
    this.quickDial = quickDial;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeNumberSettingsRequest {\n");
    
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    releaseForMnp: ").append(toIndentedString(releaseForMnp)).append("\n");
    sb.append("    quickDial: ").append(toIndentedString(quickDial)).append("\n");
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

