/*
 * ZIQNI Webhook Services
 * Webhook subscriber services intended use is to assist in the creation of a subscriber service.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: sales@ziqni.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ziqni.webhook.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NewMemberAllOf
 */
@JsonPropertyOrder({
  NewMemberAllOf.JSON_PROPERTY_MEMBER_ID,
  NewMemberAllOf.JSON_PROPERTY_MEMBER_REF_ID,
  NewMemberAllOf.JSON_PROPERTY_MEMBER_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NewMemberAllOf {
  public static final String JSON_PROPERTY_MEMBER_ID = "memberId";
  private String memberId;

  public static final String JSON_PROPERTY_MEMBER_REF_ID = "memberRefId";
  private String memberRefId;

  public static final String JSON_PROPERTY_MEMBER_NAME = "memberName";
  private String memberName;


  public NewMemberAllOf memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * Member identifier
   * @return memberId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Member identifier")
  @JsonProperty(JSON_PROPERTY_MEMBER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMemberId() {
    return memberId;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }


  public NewMemberAllOf memberRefId(String memberRefId) {
    this.memberRefId = memberRefId;
    return this;
  }

   /**
   * Member Reference id
   * @return memberRefId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Member Reference id")
  @JsonProperty(JSON_PROPERTY_MEMBER_REF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMemberRefId() {
    return memberRefId;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_REF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberRefId(String memberRefId) {
    this.memberRefId = memberRefId;
  }


  public NewMemberAllOf memberName(String memberName) {
    this.memberName = memberName;
    return this;
  }

   /**
   * First 120 characters of the default name
   * @return memberName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "First 120 characters of the default name")
  @JsonProperty(JSON_PROPERTY_MEMBER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMemberName() {
    return memberName;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }


  /**
   * Return true if this NewMember_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewMemberAllOf newMemberAllOf = (NewMemberAllOf) o;
    return Objects.equals(this.memberId, newMemberAllOf.memberId) &&
        Objects.equals(this.memberRefId, newMemberAllOf.memberRefId) &&
        Objects.equals(this.memberName, newMemberAllOf.memberName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, memberRefId, memberName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewMemberAllOf {\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    memberRefId: ").append(toIndentedString(memberRefId)).append("\n");
    sb.append("    memberName: ").append(toIndentedString(memberName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

