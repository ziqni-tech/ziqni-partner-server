package com.ziqni.mocks.promotions;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;


/**
 * ComplexFilters
 */
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
    public Integer getShouldMatchAtLeast() {
        return shouldMatchAtLeast;
    }

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
    public List<String> getMustNot() {
        return mustNot;
    }


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
    public List<String> getShould() {
        return should;
    }

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
    public List<String> getMust() {
        return must;
    }

    public void setMust(List<String> must) {
        this.must = must;
    }


    /**
     * Return true if this ComplexFilters object is equal to o.
     */
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

