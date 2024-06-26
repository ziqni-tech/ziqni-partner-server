package com.ziqni.cache.promotions;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

class PromotionsTest {

    private final static Map<String, Promotion> mockPromotions = new HashMap<>();
    private static AtomicInteger count = new AtomicInteger(0);
    private final static String OPERATOR_TAG_123 = "operator:123";
    private final static String OPERATOR_TAG_456 = "operator:456";

    @BeforeAll
    static void setup(){

        for(int i = 0; i < 10; i++) {
            final var id = count.incrementAndGet();
            final var promotion = new Promotion("id"+id, PromotionType.Achievement, OffsetDateTime.now().minusDays(1), OffsetDateTime.now().plusDays(1), String.valueOf(id), new ComplexFilters().addMustItem(OPERATOR_TAG_123));
            mockPromotions.put(promotion.getId(), promotion);
        }
    }

    private static Promotion getRandomPromotion() {
        return mockPromotions.get(new Random().nextInt(mockPromotions.size()));
    }

    private Map<String, Promotion> getNewRandomPromotions(int numberToCreate) {
        Map<String, Promotion> tmpMockPromotions = new HashMap<>();

        for(int i = 0; i < numberToCreate; i++) {
            final var id = count.incrementAndGet();
            final var promotion = new Promotion("id-"+id, PromotionType.Achievement, OffsetDateTime.now().minusDays(1), OffsetDateTime.now().plusDays(1), String.valueOf(id), new ComplexFilters().addMustItem(OPERATOR_TAG_123));
            mockPromotions.put(promotion.getId(), promotion);
        }

        return tmpMockPromotions;
    }

    @Test
    void loadPromotions() {
        final var promotions = new Promotions() {

            @Override
            public Promotion loadPromotionFromRemote(String id, PromotionType type) {
                return mockPromotions.get(id);
            }

            @Override
            public void loadNewPromotionsFromRemote(long lastRun) {
                getNewRandomPromotions(10).values().forEach(this::addPromotion);
            }
        };

        mockPromotions.values().forEach(promotions::addPromotion);

        final var member1 = new SimpleMember("member1", new HashSet<>(List.of(OPERATOR_TAG_123)));
        final var member2 = new SimpleMember("member2", new HashSet<>(List.of(OPERATOR_TAG_456)));

        final var m1Result = promotions.playerHasActivePromotions(member1.id, OPERATOR_TAG_123);
        final var m2Result = promotions.playerHasActivePromotions(member2.id, OPERATOR_TAG_456);

        assertTrue( m1Result);
        assertFalse( m2Result);
    }

    @Test
    void loadPromotion() {
    }

    static class SimpleMember{
        public final String id;
        public final HashSet<String> tags;

        SimpleMember(String id, HashSet<String> tags) {
            this.id = id;
            this.tags = tags;
        }
    }
}
