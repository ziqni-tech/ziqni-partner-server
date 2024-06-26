package com.ziqni.cache.promotions;

import java.util.Objects;

public class PromotionKey {

    private final String id;
    private final PromotionType type;

    public PromotionKey(String id, PromotionType type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public PromotionType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PromotionKey)) return false;
        PromotionKey that = (PromotionKey) o;
        return Objects.equals(id, that.id) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "PromotionKey{" +
                "id=" + id +
                ", type=" + type +
                '}';
    }
}
