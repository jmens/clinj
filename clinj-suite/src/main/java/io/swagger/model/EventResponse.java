package io.swagger.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class EventResponse  {
  
  @ApiModelProperty(value = "")
  private String eventId = null;
  @ApiModelProperty(value = "")
  private String eventType = null;
  @ApiModelProperty(value = "")
  private Map<String, String> payload = new HashMap<String, String>();

 /**
   * Get eventId
   * @return eventId
  **/
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public EventResponse eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * Get eventType
   * @return eventType
  **/
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public EventResponse eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

 /**
   * Get payload
   * @return payload
  **/
  public Map<String, String> getPayload() {
    return payload;
  }

  public void setPayload(Map<String, String> payload) {
    this.payload = payload;
  }

  public EventResponse payload(Map<String, String> payload) {
    this.payload = payload;
    return this;
  }

  public EventResponse putPayloadItem(String key, String payloadItem) {
    this.payload.put(key, payloadItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventResponse {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

