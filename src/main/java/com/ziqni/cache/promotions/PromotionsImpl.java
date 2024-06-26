package com.ziqni.cache.promotions;

import com.ziqni.admin.sdk.model.Achievement;
import com.ziqni.admin.sdk.model.Competition;

public class PromotionsImpl extends com.ziqni.cache.promotions.Promotions{

    @Override
    public void loadNewPromotionsFromRemote(long lastRun) {
        loadNewAchievementFromRemote(lastRun);
        loadNewCompetitionsFromRemote(lastRun);
    }

    @Override
    public Promotion loadPromotionFromRemote(String id, PromotionType type) {
        if (type == PromotionType.Achievement) {
            final var achievement = loadAchievementFromRemote(0);
            return new Promotion(achievement.getId(), PromotionType.Achievement, achievement.getScheduling().getStartDate(), achievement.getScheduling().getEndDate(), achievement.getName(), achievement.getMemberTagsFilter());
        } else if (type == PromotionType.Competition) {
            final var competition = loadCompetitionsFromRemote(0);
            return new Promotion(competition.getId(), PromotionType.Competition, competition.getScheduledStartDate(), competition.getScheduledEndDate(), competition.getName(), competition.getEntrantMemberTagsFilter());
        } else {
            return null;
        }
    }

    private void loadNewAchievementFromRemote(long lastRun){
        // search then add
        // addPromotion(promotion);
    }

    private void loadNewCompetitionsFromRemote(long lastRun){
        // search then add
        // addPromotion(promotion);
    }

    private Achievement loadAchievementFromRemote(long lastRun){
        return null;
    }

    private Competition loadCompetitionsFromRemote(long lastRun){
        return null;
    }
}
