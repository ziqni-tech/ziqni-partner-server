package com.ziqni.cache.promotions;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.CacheLoader;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

/**
 * Promotions cache
 */
public abstract class Promotions implements Runnable, CacheLoader<PromotionKey, Promotion> {

    private final static int initialDelay = 1;  // one-minute delay for the first execution
    private final static int waitBetweenDelaySeconds = 60;  // sixty-seconds delay for the first execution
    private final static int period = 30;       // period between successive executions

    /** The scheduler. */
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    /** The cache. */
    private final LoadingCache<PromotionKey, Promotion> promotionsCache;
    /** The players query cache. */
    private final LoadingCache<PlayerKey, Boolean> playersQueryCache;
    /** The schedule at fixed rate. */
    private ScheduledFuture<?> scheduleAtFixedRate;
    /** The last run time. */
    private final AtomicLong lastRun = new AtomicLong(OffsetDateTime.now().minusMonths(3).toEpochSecond()-waitBetweenDelaySeconds);

    public Promotions() {
        this.promotionsCache = Caffeine.newBuilder().build(this);
        this.playersQueryCache = Caffeine.newBuilder().expireAfterWrite(30, TimeUnit.SECONDS).build(new CacheLoader<PlayerKey, Boolean>() {
            @Override
            public @Nullable Boolean load(PlayerKey key) {
                return playerHasActivePromotions(key.getId(), key.getOperatorId());
            }
        });
    }

    public void start(){
        if(Objects.nonNull(scheduleAtFixedRate) && !scheduleAtFixedRate.isCancelled()){
            // Schedule the task to run every 30 minutes, starting now
            this.scheduleAtFixedRate = scheduler.scheduleAtFixedRate(this, initialDelay, period, TimeUnit.MINUTES);
        }
    }

    public void stop(){
        if(Objects.nonNull(scheduleAtFixedRate) && !scheduleAtFixedRate.isCancelled()){
            scheduleAtFixedRate.cancel(false);
        }
    }

    public boolean started(){
        return Objects.nonNull(scheduleAtFixedRate) && !scheduleAtFixedRate.isCancelled();
    }

    public void addPromotion(Promotion promotion){
        promotionsCache.put(promotion.getKey(), promotion);
    }

    public boolean playerHasActivePromotionsWithCache(String playerId, String operatorId){
        return this.playersQueryCache.get(new PlayerKey(playerId, operatorId));
    }

    public boolean playerHasActivePromotions(String playerId, String operatorId){
        return promotionsCache.asMap().values().stream()
                .filter(promotion -> isInCorrectGroups(promotion.getMemberTagsFilter(), Set.of(operatorId)))
                .anyMatch(promotion -> promotion.getStartDate().isBefore(OffsetDateTime.now()) && promotion.getEndDate().isAfter(OffsetDateTime.now()));
    }

    public void removeExpiredPromotions(){
        final var toDump = promotionsCache.asMap().values().stream().filter(promotion -> promotion.getEndDate().isBefore(OffsetDateTime.now())).map(Promotion::getKey).collect(Collectors.toList());
        this.promotionsCache.invalidateAll(toDump);
    }

    /**
     * @param complexFilters
     * @param tags
     * @return boolean
     */
    public static boolean isInCorrectGroups(ComplexFilters complexFilters, Set<String> tags){

        final Set<String> safe = Objects.isNull(tags) ? Set.of() : tags;

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

    public Long getLastRun() {
        return lastRun.get();
    }

    @Override
    public void run() {
        if(OffsetDateTime.now().toEpochSecond()-getLastRun() > waitBetweenDelaySeconds){
            this.lastRun.set(OffsetDateTime.now().toEpochSecond());
            loadNewPromotionsFromRemote(getLastRun());
        }
    }

    @Override
    public @Nullable Promotion load(PromotionKey key) throws Exception {
        return loadPromotionFromRemote(key.getId(), key.getType());
    }

    /**
     * Load new promotions by making a query request to ZIQNI competitions and contest API
     * search for new promotions created since the last run that are at least Ready
     * @param lastRun
     */
    public abstract void loadNewPromotionsFromRemote(long lastRun);

    /**
     * Load new promotions by making a query request to ZIQNI competitions and contest API
     * search for new promotions created since the last run that are at least Ready
     * @param id The id
     * @param type The type
     */
    public abstract Promotion loadPromotionFromRemote(String id, PromotionType type);

}
