package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class AddFaxEmailNotificationRequest  {
  
  @ApiModelProperty(example = "f0", required = true, value = "")
  private String faxlineId = null;

@XmlType(name="DirectionEnum")
@XmlEnum(String.class)
public enum DirectionEnum {

@XmlEnumValue("INCOMING") INCOMING(String.valueOf("INCOMING")), @XmlEnumValue("OUTGOING") OUTGOING(String.valueOf("OUTGOING"));


    private String value;

    DirectionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String v) {
        for (DirectionEnum b : DirectionEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "")
  private DirectionEnum direction = null;
  @ApiModelProperty(example = "grace.hopper@example.com", required = true, value = "")
  private String email = null;

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

  public AddFaxEmailNotificationRequest faxlineId(String faxlineId) {
    this.faxlineId = faxlineId;
    return this;
  }

 /**
   * Get direction
   * @return direction
  **/
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public AddFaxEmailNotificationRequest direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

 /**
   * Get email
   * @return email
  **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AddFaxEmailNotificationRequest email(String email) {
    this.email = email;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddFaxEmailNotificationRequest {\n");
    
    sb.append("    faxlineId: ").append(toIndentedString(faxlineId)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

