package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class RecordingRequest  {

  @ApiModelProperty(example = "true", required = true, value = "Announce recording start/stop to all participants")
  private Boolean announcement = false;
  @ApiModelProperty(example = "true", required = true, value = "Start/stop the recording")
  private Boolean value = false;

 /**
   * Announce recording start/stop to all participants
   * @return announcement
  **/
  public Boolean getAnnouncement() {
    return announcement;
  }

  public void setAnnouncement(Boolean announcement) {
    this.announcement = announcement;
  }

  public RecordingRequest announcement(Boolean announcement) {
    this.announcement = announcement;
    return this;
  }

 /**
   * Start/stop the recording
   * @return value
  **/
  public Boolean getValue() {
    return value;
  }

  public void setValue(Boolean value) {
    this.value = value;
  }

  public RecordingRequest value(Boolean value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingRequest {\n");

    sb.append("    announcement: ").append(toIndentedString(announcement)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

