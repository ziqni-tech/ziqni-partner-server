package com.ziqni.cache.promotions;

import com.ziqni.admin.sdk.model.DependantOn;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

public class Promotion {

    private final String id;
    private final PromotionType type;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
    private String name;
    private DependantOn memberTagsFilter;
    private List<String> products;

    public Promotion(String id, PromotionType type, OffsetDateTime startDate, OffsetDateTime endDate, String name, DependantOn memberTagsFilter) {
        this.id = id;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.name = name;
        this.memberTagsFilter = memberTagsFilter;
        this.products = List.of();
    }

    public Promotion(String id, PromotionType type, OffsetDateTime startDate, OffsetDateTime endDate, String name, DependantOn memberTagsFilter, List<String> products) {
        this.id = id;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.name = name;
        this.memberTagsFilter = memberTagsFilter;
        this.products = products;
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

    public DependantOn getMemberTagsFilter() {
        return memberTagsFilter;
    }

    public List<String> getProducts() {
        return products;
    }

    public PromotionType getType() {
        return type;
    }

    public PromotionKey getKey(){
        return new PromotionKey(id, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Promotion)) return false;
        Promotion promotion = (Promotion) o;
        return Objects.equals(getId(), promotion.getId()) && getType() == promotion.getType() && Objects.equals(getStartDate(), promotion.getStartDate()) && Objects.equals(getEndDate(), promotion.getEndDate()) && Objects.equals(getName(), promotion.getName()) && Objects.equals(getMemberTagsFilter(), promotion.getMemberTagsFilter()) && Objects.equals(getProducts(), promotion.getProducts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getType(), getStartDate(), getEndDate(), getName(), getMemberTagsFilter(), getProducts());
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", name='" + name + '\'' +
                ", memberTagsFilter=" + memberTagsFilter +
                ", products=" + products +
                '}';
    }
}
