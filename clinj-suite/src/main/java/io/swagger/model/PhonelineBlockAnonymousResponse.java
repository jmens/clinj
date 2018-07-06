package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class PhonelineBlockAnonymousResponse  {
  
  @ApiModelProperty(value = "")
  private Boolean enabled = false;

@XmlType(name="TargetEnum")
@XmlEnum(String.class)
public enum TargetEnum {

@XmlEnumValue("REJECT") REJECT(String.valueOf("REJECT")), @XmlEnumValue("VOICEMAIL") VOICEMAIL(String.valueOf("VOICEMAIL"));


    private String value;

    TargetEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TargetEnum fromValue(String v) {
        for (TargetEnum b : TargetEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private TargetEnum target = null;

 /**
   * Get enabled
   * @return enabled
  **/
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public PhonelineBlockAnonymousResponse enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

 /**
   * Get target
   * @return target
  **/
  public TargetEnum getTarget() {
    return target;
  }

  public void setTarget(TargetEnum target) {
    this.target = target;
  }

  public PhonelineBlockAnonymousResponse target(TargetEnum target) {
    this.target = target;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhonelineBlockAnonymousResponse {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

