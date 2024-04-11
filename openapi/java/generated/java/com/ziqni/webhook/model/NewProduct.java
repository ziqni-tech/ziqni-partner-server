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
import com.ziqni.webhook.model.NewProductAllOf;
import com.ziqni.webhook.model.OptParamModels;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NewProduct
 */
@JsonPropertyOrder({
  NewProduct.JSON_PROPERTY_METADATA,
  NewProduct.JSON_PROPERTY_OBJECT_TYPE,
  NewProduct.JSON_PROPERTY_CONSTRAINTS,
  NewProduct.JSON_PROPERTY_ACCOUNT_ID,
  NewProduct.JSON_PROPERTY_SPACE_NAME,
  NewProduct.JSON_PROPERTY_PRODUCT_ID,
  NewProduct.JSON_PROPERTY_PRODUCT_REF_ID,
  NewProduct.JSON_PROPERTY_PRODUCT_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NewProduct {
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

  public static final String JSON_PROPERTY_PRODUCT_ID = "productId";
  private String productId;

  public static final String JSON_PROPERTY_PRODUCT_REF_ID = "productRefId";
  private String productRefId;

  public static final String JSON_PROPERTY_PRODUCT_NAME = "productName";
  private String productName;


  public NewProduct metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public NewProduct putMetadataItem(String key, String metadataItem) {
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


  public NewProduct objectType(String objectType) {
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


  public NewProduct constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public NewProduct addConstraintsItem(String constraintsItem) {
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


  public NewProduct accountId(String accountId) {
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


  public NewProduct spaceName(String spaceName) {
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


  public NewProduct productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Product identifier
   * @return productId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Product identifier")
  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProductId() {
    return productId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProductId(String productId) {
    this.productId = productId;
  }


  public NewProduct productRefId(String productRefId) {
    this.productRefId = productRefId;
    return this;
  }

   /**
   * Product Reference id
   * @return productRefId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product Reference id")
  @JsonProperty(JSON_PROPERTY_PRODUCT_REF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductRefId() {
    return productRefId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_REF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductRefId(String productRefId) {
    this.productRefId = productRefId;
  }


  public NewProduct productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * First 120 characters of the default name
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "First 120 characters of the default name")
  @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductName() {
    return productName;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductName(String productName) {
    this.productName = productName;
  }


  /**
   * Return true if this NewProduct object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewProduct newProduct = (NewProduct) o;
    return Objects.equals(this.metadata, newProduct.metadata) &&
        Objects.equals(this.objectType, newProduct.objectType) &&
        Objects.equals(this.constraints, newProduct.constraints) &&
        Objects.equals(this.accountId, newProduct.accountId) &&
        Objects.equals(this.spaceName, newProduct.spaceName) &&
        Objects.equals(this.productId, newProduct.productId) &&
        Objects.equals(this.productRefId, newProduct.productRefId) &&
        Objects.equals(this.productName, newProduct.productName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, objectType, constraints, accountId, spaceName, productId, productRefId, productName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewProduct {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    spaceName: ").append(toIndentedString(spaceName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productRefId: ").append(toIndentedString(productRefId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
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

