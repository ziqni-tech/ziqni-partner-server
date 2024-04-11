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
import com.ziqni.webhook.model.AwardAllOf;
import com.ziqni.webhook.model.OptParamModels;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Award
 */
@JsonPropertyOrder({
  Award.JSON_PROPERTY_METADATA,
  Award.JSON_PROPERTY_OBJECT_TYPE,
  Award.JSON_PROPERTY_CONSTRAINTS,
  Award.JSON_PROPERTY_ACCOUNT_ID,
  Award.JSON_PROPERTY_SPACE_NAME,
  Award.JSON_PROPERTY_AWARD_ID,
  Award.JSON_PROPERTY_REWARD_ID,
  Award.JSON_PROPERTY_REWARD_TYPE_KEY,
  Award.JSON_PROPERTY_REWARD_TYPE_ID,
  Award.JSON_PROPERTY_REWARD_META_DATA,
  Award.JSON_PROPERTY_VALUE,
  Award.JSON_PROPERTY_MEMBER_REF_ID,
  Award.JSON_PROPERTY_MEMBER_ID,
  Award.JSON_PROPERTY_REWARD_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Award {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_OBJECT_TYPE = "objectType";
  private String objectType;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = null;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_SPACE_NAME = "spaceName";
  private String spaceName;

  public static final String JSON_PROPERTY_AWARD_ID = "awardId";
  private String awardId;

  public static final String JSON_PROPERTY_REWARD_ID = "rewardId";
  private String rewardId;

  public static final String JSON_PROPERTY_REWARD_TYPE_KEY = "rewardTypeKey";
  private String rewardTypeKey;

  public static final String JSON_PROPERTY_REWARD_TYPE_ID = "rewardTypeId";
  private String rewardTypeId;

  public static final String JSON_PROPERTY_REWARD_META_DATA = "rewardMetaData";
  private Map<String, String> rewardMetaData = null;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public static final String JSON_PROPERTY_MEMBER_REF_ID = "memberRefId";
  private String memberRefId;

  public static final String JSON_PROPERTY_MEMBER_ID = "memberId";
  private String memberId;

  public static final String JSON_PROPERTY_REWARD_NAME = "rewardName";
  private String rewardName;


  public Award metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Award putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public Award objectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

   /**
   * Get objectType
   * @return objectType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OBJECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getObjectType() {
    return objectType;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }


  public Award constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public Award addConstraintsItem(String constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Constraints applied to this object, like hasRewards etc.
   * @return constraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Constraints applied to this object, like hasRewards etc.")
  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getConstraints() {
    return constraints;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstraints(List<String> constraints) {
    this.constraints = constraints;
  }


  public Award accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The account identifier
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The account identifier")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public Award spaceName(String spaceName) {
    this.spaceName = spaceName;
    return this;
  }

   /**
   * The space name
   * @return spaceName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The space name")
  @JsonProperty(JSON_PROPERTY_SPACE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSpaceName() {
    return spaceName;
  }


  @JsonProperty(JSON_PROPERTY_SPACE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSpaceName(String spaceName) {
    this.spaceName = spaceName;
  }


  public Award awardId(String awardId) {
    this.awardId = awardId;
    return this;
  }

   /**
   * Get awardId
   * @return awardId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AWARD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAwardId() {
    return awardId;
  }


  @JsonProperty(JSON_PROPERTY_AWARD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAwardId(String awardId) {
    this.awardId = awardId;
  }


  public Award rewardId(String rewardId) {
    this.rewardId = rewardId;
    return this;
  }

   /**
   * Get rewardId
   * @return rewardId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REWARD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRewardId() {
    return rewardId;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRewardId(String rewardId) {
    this.rewardId = rewardId;
  }


  public Award rewardTypeKey(String rewardTypeKey) {
    this.rewardTypeKey = rewardTypeKey;
    return this;
  }

   /**
   * Get rewardTypeKey
   * @return rewardTypeKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REWARD_TYPE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRewardTypeKey() {
    return rewardTypeKey;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_TYPE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRewardTypeKey(String rewardTypeKey) {
    this.rewardTypeKey = rewardTypeKey;
  }


  public Award rewardTypeId(String rewardTypeId) {
    this.rewardTypeId = rewardTypeId;
    return this;
  }

   /**
   * Get rewardTypeId
   * @return rewardTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REWARD_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRewardTypeId() {
    return rewardTypeId;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRewardTypeId(String rewardTypeId) {
    this.rewardTypeId = rewardTypeId;
  }


  public Award rewardMetaData(Map<String, String> rewardMetaData) {
    this.rewardMetaData = rewardMetaData;
    return this;
  }

  public Award putRewardMetaDataItem(String key, String rewardMetaDataItem) {
    if (this.rewardMetaData == null) {
      this.rewardMetaData = new HashMap<>();
    }
    this.rewardMetaData.put(key, rewardMetaDataItem);
    return this;
  }

   /**
   * Get rewardMetaData
   * @return rewardMetaData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REWARD_META_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getRewardMetaData() {
    return rewardMetaData;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_META_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRewardMetaData(Map<String, String> rewardMetaData) {
    this.rewardMetaData = rewardMetaData;
  }


  public Award value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(Double value) {
    this.value = value;
  }


  public Award memberRefId(String memberRefId) {
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


  public Award memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * Member id
   * @return memberId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Member id")
  @JsonProperty(JSON_PROPERTY_MEMBER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMemberId() {
    return memberId;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }


  public Award rewardName(String rewardName) {
    this.rewardName = rewardName;
    return this;
  }

   /**
   * Firtst 120 characters of the default name
   * @return rewardName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Firtst 120 characters of the default name")
  @JsonProperty(JSON_PROPERTY_REWARD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRewardName() {
    return rewardName;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRewardName(String rewardName) {
    this.rewardName = rewardName;
  }


  /**
   * Return true if this Award object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Award award = (Award) o;
    return Objects.equals(this.metadata, award.metadata) &&
        Objects.equals(this.objectType, award.objectType) &&
        Objects.equals(this.constraints, award.constraints) &&
        Objects.equals(this.accountId, award.accountId) &&
        Objects.equals(this.spaceName, award.spaceName) &&
        Objects.equals(this.awardId, award.awardId) &&
        Objects.equals(this.rewardId, award.rewardId) &&
        Objects.equals(this.rewardTypeKey, award.rewardTypeKey) &&
        Objects.equals(this.rewardTypeId, award.rewardTypeId) &&
        Objects.equals(this.rewardMetaData, award.rewardMetaData) &&
        Objects.equals(this.value, award.value) &&
        Objects.equals(this.memberRefId, award.memberRefId) &&
        Objects.equals(this.memberId, award.memberId) &&
        Objects.equals(this.rewardName, award.rewardName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, objectType, constraints, accountId, spaceName, awardId, rewardId, rewardTypeKey, rewardTypeId, rewardMetaData, value, memberRefId, memberId, rewardName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Award {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    spaceName: ").append(toIndentedString(spaceName)).append("\n");
    sb.append("    awardId: ").append(toIndentedString(awardId)).append("\n");
    sb.append("    rewardId: ").append(toIndentedString(rewardId)).append("\n");
    sb.append("    rewardTypeKey: ").append(toIndentedString(rewardTypeKey)).append("\n");
    sb.append("    rewardTypeId: ").append(toIndentedString(rewardTypeId)).append("\n");
    sb.append("    rewardMetaData: ").append(toIndentedString(rewardMetaData)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    memberRefId: ").append(toIndentedString(memberRefId)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    rewardName: ").append(toIndentedString(rewardName)).append("\n");
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

