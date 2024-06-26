package com.ziqni.cache.promotions.mocks;

import com.ziqni.cache.promotions.Promotion;
import com.ziqni.cache.promotions.PromotionType;

public class PromotionsImpl extends com.ziqni.cache.promotions.Promotions {

    @Override
    public void loadNewPromotionsFromRemote(long lastRun) {
        //TODO implement this by querying the remote ZIQNI services and searching by created date then addPromotion();
    }

    @Override
    public Promotion loadPromotionFromRemote(String id, PromotionType type) {
        //TODO implement this by querying the remote ZIQNI services for a specific record by id and return Promotion;
        return null;
    }
}
