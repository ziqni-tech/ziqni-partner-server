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
import com.ziqni.webhook.model.ContestCreatedAllOf;
import com.ziqni.webhook.model.OptParamModels;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ContestFinalised
 */
@JsonPropertyOrder({
  ContestFinalised.JSON_PROPERTY_METADATA,
  ContestFinalised.JSON_PROPERTY_OBJECT_TYPE,
  ContestFinalised.JSON_PROPERTY_CONSTRAINTS,
  ContestFinalised.JSON_PROPERTY_ACCOUNT_ID,
  ContestFinalised.JSON_PROPERTY_SPACE_NAME,
  ContestFinalised.JSON_PROPERTY_CONTEST_ID,
  ContestFinalised.JSON_PROPERTY_CONTEST_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContestFinalised {
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

  public static final String JSON_PROPERTY_CONTEST_ID = "contestId";
  private String contestId;

  public static final String JSON_PROPERTY_CONTEST_NAME = "contestName";
  private String contestName;


  public ContestFinalised metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public ContestFinalised putMetadataItem(String key, String metadataItem) {
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


  public ContestFinalised objectType(String objectType) {
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


  public ContestFinalised constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public ContestFinalised addConstraintsItem(String constraintsItem) {
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


  public ContestFinalised accountId(String accountId) {
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


  public ContestFinalised spaceName(String spaceName) {
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


  public ContestFinalised contestId(String contestId) {
    this.contestId = contestId;
    return this;
  }

   /**
   * Contest identifier
   * @return contestId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Contest identifier")
  @JsonProperty(JSON_PROPERTY_CONTEST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getContestId() {
    return contestId;
  }


  @JsonProperty(JSON_PROPERTY_CONTEST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContestId(String contestId) {
    this.contestId = contestId;
  }


  public ContestFinalised contestName(String contestName) {
    this.contestName = contestName;
    return this;
  }

   /**
   * First 120 characters of the default name
   * @return contestName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "First 120 characters of the default name")
  @JsonProperty(JSON_PROPERTY_CONTEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContestName() {
    return contestName;
  }


  @JsonProperty(JSON_PROPERTY_CONTEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContestName(String contestName) {
    this.contestName = contestName;
  }


  /**
   * Return true if this ContestFinalised object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestFinalised contestFinalised = (ContestFinalised) o;
    return Objects.equals(this.metadata, contestFinalised.metadata) &&
        Objects.equals(this.objectType, contestFinalised.objectType) &&
        Objects.equals(this.constraints, contestFinalised.constraints) &&
        Objects.equals(this.accountId, contestFinalised.accountId) &&
        Objects.equals(this.spaceName, contestFinalised.spaceName) &&
        Objects.equals(this.contestId, contestFinalised.contestId) &&
        Objects.equals(this.contestName, contestFinalised.contestName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, objectType, constraints, accountId, spaceName, contestId, contestName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestFinalised {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    spaceName: ").append(toIndentedString(spaceName)).append("\n");
    sb.append("    contestId: ").append(toIndentedString(contestId)).append("\n");
    sb.append("    contestName: ").append(toIndentedString(contestName)).append("\n");
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

