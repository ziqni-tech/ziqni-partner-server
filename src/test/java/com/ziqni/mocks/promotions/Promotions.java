package com.ziqni.mocks.promotions;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class Promotions {

    ConcurrentHashMap<String, Promotion> cache = new ConcurrentHashMap<>();


    public void addPromotion(Promotion promotion){
        cache.compute(promotion.getId(), (k,v) -> promotion);
    }

    public boolean playerHasActivePromotions(String playerId, String operatorId){
        return cache.values().stream()
                .filter(promotion -> promotion.getEntrantMemberTagsFilter() != null)
                .filter(promotion -> promotion.getEntrantMemberTagsFilter().getMust() != null)
                .filter(promotion -> promotion.getEntrantMemberTagsFilter().getMust().contains(playerId))
                .filter(promotion -> promotion.getEntrantMemberTagsFilter().getMust().contains(operatorId))
                .anyMatch(promotion -> promotion.getStartDate().isBefore(OffsetDateTime.now()) && promotion.getEndDate().isAfter(OffsetDateTime.now()));
    }

    public static boolean isInCorrectGroups(ComplexFilters complexFilters, HashSet<String> tags){

        final HashSet<String> safe = Objects.isNull(tags) ? new HashSet<>() : tags;

        final var must =
                complexFilters.getMust() == null ||
                        complexFilters.getMust().isEmpty() ||
                        safe.containsAll(complexFilters.getMust());

        final var mustNot =
                complexFilters.getMustNot() == null ||
                        complexFilters.getMustNot().isEmpty() ||
                        complexFilters.getMustNot().stream().noneMatch(safe::contains);

        final var should =
                complexFilters.getShould() == null ||
                        complexFilters.getShould().isEmpty() ||
                        complexFilters.getShould().stream().map(safe::contains).filter(x -> x).count() >= complexFilters.getShouldMatchAtLeast();

        return must && mustNot && should;
    }
}
