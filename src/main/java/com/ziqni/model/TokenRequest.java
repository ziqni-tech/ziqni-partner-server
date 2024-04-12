package com.ziqni.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

/**
 * TokenRequest
 */
@JsonPropertyOrder({
        TokenRequest.JSON_PROPERTY_OPERATOR_ID,
        TokenRequest.JSON_PROPERTY_PLAYER_ID,
        TokenRequest.JSON_PROPERTY_CURRENCY_CODE,
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TokenRequest {

    public static final String JSON_PROPERTY_OPERATOR_ID = "operatorId";
    private String operatorId;

    public static final String JSON_PROPERTY_PLAYER_ID = "playerId";
    private String playerId;

    public static final String JSON_PROPERTY_CURRENCY_CODE = "playerCurrencyCode";
    private String currencyCode;

    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_OPERATOR_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getOperatorId() {
        return operatorId;
    }

    public TokenRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }

    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_PLAYER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getPlayerId() {
        return playerId;
    }

    public TokenRequest setPlayerId(String playerId) {
        this.playerId = playerId;
        return this;
    }

    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCurrencyCode() {
        return currencyCode;
    }

    public TokenRequest setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TokenRequest)) return false;
        TokenRequest that = (TokenRequest) o;
        return Objects.equals(getOperatorId(), that.getOperatorId()) && Objects.equals(getPlayerId(), that.getPlayerId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOperatorId(), getPlayerId());
    }

    @Override
    public String toString() {
        return "TokenRequest{" +
                "operatorId='" + operatorId + '\'' +
                ", playerId='" + playerId + '\'' +
                '}';
    }
}

