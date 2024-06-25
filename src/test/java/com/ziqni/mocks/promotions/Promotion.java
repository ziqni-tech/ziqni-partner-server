package com.ziqni.mocks.promotions;

import java.time.OffsetDateTime;

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
}
