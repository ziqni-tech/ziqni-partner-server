/*
 * Copyright (c) 2022-2023. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.webhook;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.*;

public enum WebhookTriggerType {


    onNewProductTrigger("ET-101", "Product created"),
    onNewMemberTrigger("ET-201", "Member created"),
    onCompetitionCreatedTrigger("ET-301", "Competition created"),
    onCompetitionStartedTrigger("ET-311", "Competition started"),
    onCompetitionFinishedTrigger("ET-312", "Competition finished"),
    onCompetitionCancelledTrigger("ET-313", "Competition cancelled"),
    onCompetitionRewardIssuedTrigger("ET-321", "Competition reward issued"),
    onContestCreatedTrigger("ET-401", "Contest created"),
    onContestStartedTrigger("ET-411", "Contest started"),
    onContestFinishedTrigger("ET-412", "Contest finished"),
    onContestFinalisedTrigger("ET-413", "Contest finalised"),
    onContestCancelledTrigger("ET-414", "Contest cancelled"),
    onContestRewardCreatedTrigger("ET-451", "Contest reward created"),
    onContestRewardIssuedTrigger("ET-461", "Contest reward issued"),
    onContestRewardClaimedTrigger("ET-462", "Contest reward claimed"),
    onAchievementCreatedTrigger("ET-501", "Achievement created"),
    onAchievementTriggeredTrigger("ET-511", "Achievement triggered"),
    onAchievementRewardCreatedTrigger("ET-551", "Achievement reward created"),
    onAchievementRewardIssuedTrigger("ET-561", "Achievement reward issued"),
    onAchievementRewardClaimedTrigger("ET-562", "Achievement reward claimed");

    public static final Map<WebhookTriggerType, String> ON_EVENT_TYPE_NAMES = new HashMap<>();

    static {
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onNewProductTrigger, "onNewProduct");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onNewMemberTrigger, "onNewMember");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onCompetitionCreatedTrigger, "onCompetitionCreated");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onCompetitionStartedTrigger, "onCompetitionStarted");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onCompetitionFinishedTrigger, "onCompetitionFinished");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onCompetitionCancelledTrigger, "onCompetitionCancelled");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onCompetitionRewardIssuedTrigger, "onCompetitionRewardIssued");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onContestCreatedTrigger, "onContestCreated");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onContestStartedTrigger, "onContestStarted");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onContestFinishedTrigger, "onContestFinished");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onContestFinalisedTrigger, "onContestFinalised");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onContestCancelledTrigger, "onContestCancelled");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onContestRewardCreatedTrigger, "onContestRewardCreated");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onContestRewardIssuedTrigger, "onContestRewardIssued");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onContestRewardClaimedTrigger, "onContestRewardClaimed");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onAchievementCreatedTrigger, "onAchievementCreated");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onAchievementTriggeredTrigger, "onAchievementTriggered");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onAchievementRewardCreatedTrigger, "onAchievementRewardCreated");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onAchievementRewardIssuedTrigger, "onAchievementRewardIssued");
        ON_EVENT_TYPE_NAMES.put(WebhookTriggerType.onAchievementRewardClaimedTrigger, "onAchievementRewardClaimed");
    }

    private final String triggerName;
    private final String value;

    WebhookTriggerType(String value, String triggerName) {
        this.value = value;
        this.triggerName = triggerName;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonValue
    public String getTriggerName() {
        return triggerName;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
