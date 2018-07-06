package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class IdentityVerificationResponse  {
  

@XmlType(name="StateEnum")
@XmlEnum(String.class)
public enum StateEnum {

@XmlEnumValue("SUCCESS") SUCCESS(String.valueOf("SUCCESS")), @XmlEnumValue("PENDING") PENDING(String.valueOf("PENDING")), @XmlEnumValue("FAILED") FAILED(String.valueOf("FAILED"));


    private String value;

    StateEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StateEnum fromValue(String v) {
        for (StateEnum b : StateEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private StateEnum state = null;
  @ApiModelProperty(value = "")
  private String externalReferenceId = null;
  @ApiModelProperty(value = "")
  private String externalTransactionNumber = null;
  @ApiModelProperty(value = "")
  private String externalVerificationLink = null;

 /**
   * Get state
   * @return state
  **/
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public IdentityVerificationResponse state(StateEnum state) {
    this.state = state;
    return this;
  }

 /**
   * Get externalReferenceId
   * @return externalReferenceId
  **/
  public String getExternalReferenceId() {
    return externalReferenceId;
  }

  public void setExternalReferenceId(String externalReferenceId) {
    this.externalReferenceId = externalReferenceId;
  }

  public IdentityVerificationResponse externalReferenceId(String externalReferenceId) {
    this.externalReferenceId = externalReferenceId;
    return this;
  }

 /**
   * Get externalTransactionNumber
   * @return externalTransactionNumber
  **/
  public String getExternalTransactionNumber() {
    return externalTransactionNumber;
  }

  public void setExternalTransactionNumber(String externalTransactionNumber) {
    this.externalTransactionNumber = externalTransactionNumber;
  }

  public IdentityVerificationResponse externalTransactionNumber(String externalTransactionNumber) {
    this.externalTransactionNumber = externalTransactionNumber;
    return this;
  }

 /**
   * Get externalVerificationLink
   * @return externalVerificationLink
  **/
  public String getExternalVerificationLink() {
    return externalVerificationLink;
  }

  public void setExternalVerificationLink(String externalVerificationLink) {
    this.externalVerificationLink = externalVerificationLink;
  }

  public IdentityVerificationResponse externalVerificationLink(String externalVerificationLink) {
    this.externalVerificationLink = externalVerificationLink;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationResponse {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    externalReferenceId: ").append(toIndentedString(externalReferenceId)).append("\n");
    sb.append("    externalTransactionNumber: ").append(toIndentedString(externalTransactionNumber)).append("\n");
    sb.append("    externalVerificationLink: ").append(toIndentedString(externalVerificationLink)).append("\n");
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

