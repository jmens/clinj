package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class ChangeExternalDeviceIncomingCallDisplayRequest  {
  

@XmlType(name="IncomingCallDisplayEnum")
@XmlEnum(String.class)
public enum IncomingCallDisplayEnum {

@XmlEnumValue("CALLED_NUMBER") CALLED_NUMBER(String.valueOf("CALLED_NUMBER")), @XmlEnumValue("CALLER_NUMBER") CALLER_NUMBER(String.valueOf("CALLER_NUMBER"));


    private String value;

    IncomingCallDisplayEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IncomingCallDisplayEnum fromValue(String v) {
        for (IncomingCallDisplayEnum b : IncomingCallDisplayEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "")
  private IncomingCallDisplayEnum incomingCallDisplay = null;

 /**
   * Get incomingCallDisplay
   * @return incomingCallDisplay
  **/
  public IncomingCallDisplayEnum getIncomingCallDisplay() {
    return incomingCallDisplay;
  }

  public void setIncomingCallDisplay(IncomingCallDisplayEnum incomingCallDisplay) {
    this.incomingCallDisplay = incomingCallDisplay;
  }

  public ChangeExternalDeviceIncomingCallDisplayRequest incomingCallDisplay(IncomingCallDisplayEnum incomingCallDisplay) {
    this.incomingCallDisplay = incomingCallDisplay;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeExternalDeviceIncomingCallDisplayRequest {\n");
    
    sb.append("    incomingCallDisplay: ").append(toIndentedString(incomingCallDisplay)).append("\n");
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

