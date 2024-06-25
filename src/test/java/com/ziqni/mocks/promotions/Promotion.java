package com.ziqni.mocks.promotions;

import java.time.OffsetDateTime;
import java.util.Objects;

public class Promotion {

    private final String id;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
    private String name;
    private ComplexFilters entrantMemberTagsFilter;

    public Promotion(String id, OffsetDateTime startDate, OffsetDateTime endDate, String name, ComplexFilters filters) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.name = name;
        this.entrantMemberTagsFilter = filters;
    }

    public String getId() {
        return id;
    }

    public OffsetDateTime getStartDate() {
        return startDate;
    }

    public OffsetDateTime getEndDate() {
        return endDate;
    }

    public String getName() {
        return name;
    }

    public ComplexFilters getEntrantMemberTagsFilter() {
        return entrantMemberTagsFilter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Promotion)) return false;
        Promotion promotion = (Promotion) o;
        return Objects.equals(getId(), promotion.getId()) && Objects.equals(getStartDate(), promotion.getStartDate()) && Objects.equals(getEndDate(), promotion.getEndDate()) && Objects.equals(getName(), promotion.getName()) && Objects.equals(getEntrantMemberTagsFilter(), promotion.getEntrantMemberTagsFilter());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStartDate(), getEndDate(), getName(), getEntrantMemberTagsFilter());
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "id='" + id + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", name='" + name + '\'' +
                ", entrantMemberTagsFilter=" + entrantMemberTagsFilter +
                '}';
    }
}
