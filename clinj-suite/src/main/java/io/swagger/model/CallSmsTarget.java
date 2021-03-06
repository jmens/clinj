package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class CallSmsTarget  {
  
  @ApiModelProperty(example = "1337", value = "")
  private String id = null;
  @ApiModelProperty(example = "+4915799912345", value = "")
  private String number = null;

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

  @ApiModelProperty(value = "")
  private DirectionEnum direction = null;

@XmlType(name="CauseEnum")
@XmlEnum(String.class)
public enum CauseEnum {

@XmlEnumValue("MISSED") MISSED(String.valueOf("MISSED")), @XmlEnumValue("SUCCESSFUL") SUCCESSFUL(String.valueOf("SUCCESSFUL"));


    private String value;

    CauseEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CauseEnum fromValue(String v) {
        for (CauseEnum b : CauseEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private CauseEnum cause = null;

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

  public CallSmsTarget id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get number
   * @return number
  **/
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public CallSmsTarget number(String number) {
    this.number = number;
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

  public CallSmsTarget direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

 /**
   * Get cause
   * @return cause
  **/
  public CauseEnum getCause() {
    return cause;
  }

  public void setCause(CauseEnum cause) {
    this.cause = cause;
  }

  public CallSmsTarget cause(CauseEnum cause) {
    this.cause = cause;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallSmsTarget {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
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

