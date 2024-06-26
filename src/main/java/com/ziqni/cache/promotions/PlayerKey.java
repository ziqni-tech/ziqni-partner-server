package com.ziqni.cache.promotions;

import java.util.Objects;

public class PlayerKey {

    private final String id;
    private final String operatorId;

    public PlayerKey(String id, String operatorId) {
        this.id = id;
        this.operatorId = operatorId;
    }

    public String getId() {
        return id;
    }

    public String getOperatorId() {
        return operatorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerKey)) return false;
        PlayerKey playerKey = (PlayerKey) o;
        return Objects.equals(getId(), playerKey.getId()) && Objects.equals(getOperatorId(), playerKey.getOperatorId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getOperatorId());
    }

    @Override
    public String toString() {
        return "PlayerKey{" +
                "id='" + id + '\'' +
                ", operatorId='" + operatorId + '\'' +
                '}';
    }
}
