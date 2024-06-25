package com.ziqni.mocks.promotions;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ComplexFilters
 */
@JsonPropertyOrder({
        ComplexFilters.JSON_PROPERTY_SHOULD_MATCH_AT_LEAST,
        ComplexFilters.JSON_PROPERTY_MUST_NOT,
        ComplexFilters.JSON_PROPERTY_SHOULD,
        ComplexFilters.JSON_PROPERTY_MUST
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ComplexFilters {
    public static final String JSON_PROPERTY_SHOULD_MATCH_AT_LEAST = "shouldMatchAtLeast";
    private Integer shouldMatchAtLeast;

    public static final String JSON_PROPERTY_MUST_NOT = "mustNot";
    private List<String> mustNot = null;

    public static final String JSON_PROPERTY_SHOULD = "should";
    private List<String> should = null;

    public static final String JSON_PROPERTY_MUST = "must";
    private List<String> must = null;

    public ComplexFilters() {
    }

    public ComplexFilters shouldMatchAtLeast(Integer shouldMatchAtLeast) {
        this.shouldMatchAtLeast = shouldMatchAtLeast;
        return this;
    }

    /**
     * integer
     * @return shouldMatchAtLeast
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "integer")
    @JsonProperty(JSON_PROPERTY_SHOULD_MATCH_AT_LEAST)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public Integer getShouldMatchAtLeast() {
        return shouldMatchAtLeast;
    }


    @JsonProperty(JSON_PROPERTY_SHOULD_MATCH_AT_LEAST)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setShouldMatchAtLeast(Integer shouldMatchAtLeast) {
        this.shouldMatchAtLeast = shouldMatchAtLeast;
    }


    public ComplexFilters mustNot(List<String> mustNot) {
        this.mustNot = mustNot;
        return this;
    }

    public ComplexFilters addMustNotItem(String mustNotItem) {
        if (this.mustNot == null) {
            this.mustNot = new ArrayList<>();
        }
        this.mustNot.add(mustNotItem);
        return this;
    }

    /**
     * Get mustNot
     * @return mustNot
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_MUST_NOT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<String> getMustNot() {
        return mustNot;
    }


    @JsonProperty(JSON_PROPERTY_MUST_NOT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMustNot(List<String> mustNot) {
        this.mustNot = mustNot;
    }


    public ComplexFilters should(List<String> should) {
        this.should = should;
        return this;
    }

    public ComplexFilters addShouldItem(String shouldItem) {
        if (this.should == null) {
            this.should = new ArrayList<>();
        }
        this.should.add(shouldItem);
        return this;
    }

    /**
     * Get should
     * @return should
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SHOULD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<String> getShould() {
        return should;
    }


    @JsonProperty(JSON_PROPERTY_SHOULD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setShould(List<String> should) {
        this.should = should;
    }


    public ComplexFilters must(List<String> must) {
        this.must = must;
        return this;
    }

    public ComplexFilters addMustItem(String mustItem) {
        if (this.must == null) {
            this.must = new ArrayList<>();
        }
        this.must.add(mustItem);
        return this;
    }

    /**
     * Get must
     * @return must
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_MUST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<String> getMust() {
        return must;
    }


    @JsonProperty(JSON_PROPERTY_MUST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMust(List<String> must) {
        this.must = must;
    }


    /**
     * Return true if this ComplexFilters object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComplexFilters complexFilters = (ComplexFilters) o;
        return Objects.equals(this.shouldMatchAtLeast, complexFilters.shouldMatchAtLeast) &&
                Objects.equals(this.mustNot, complexFilters.mustNot) &&
                Objects.equals(this.should, complexFilters.should) &&
                Objects.equals(this.must, complexFilters.must);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shouldMatchAtLeast, mustNot, should, must);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComplexFilters {\n");
        sb.append("    shouldMatchAtLeast: ").append(toIndentedString(shouldMatchAtLeast)).append("\n");
        sb.append("    mustNot: ").append(toIndentedString(mustNot)).append("\n");
        sb.append("    should: ").append(toIndentedString(should)).append("\n");
        sb.append("    must: ").append(toIndentedString(must)).append("\n");
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

