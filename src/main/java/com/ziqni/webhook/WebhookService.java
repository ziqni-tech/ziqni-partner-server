package com.ziqni.webhook;

import com.ziqni.api.model.*;
import com.ziqni.api.services.WebhooksApiDelegate;
import com.ziqni.handler.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import static com.ziqni.webhook.WebhookTriggerType.ON_EVENT_TYPE_NAMES;

@Service
@RequiredArgsConstructor
public class WebhookService implements WebhooksApiDelegate {

    private final OnMemberCreated onMemberCreated;
    private final OnProductCreated onProductCreated;
    private final OnCompetitionCreated onCompetitionCreated;
    private final OnCompetitionStarted onCompetitionStarted;
    private final OnCompetitionFinished onCompetitionFinished;
    private final OnCompetitionCancelled onCompetitionCancelled;
    private final OnCompetitionRewardIssued onCompetitionRewardIssued;
    private final OnContestFinalised onContestFinalised;
    private final OnContestFinished onContestFinished;
    private final OnContestCancelled onContestCancelled;
    private final OnContestCreated onContestCreated;
    private final OnContestRewardCreated onContestRewardCreated;
    private final OnContestRewardClaimed onContestRewardClaimed;
    private final OnContestRewardIssued onContestRewardIssued;
    private final OnAchievementRewardClaimed onAchievementRewardClaimed;

    private final OnAchievementRewardCreated onAchievementRewardCreated;
    private final OnAchievementRewardIssued onAchievementRewardIssued;
    private final OnAchievementTriggered onAchievementTriggered;


    public ResponseEntity<Void> onWebhook(String acceptEncoding,
                                          String userAgent,
                                          String xAccount,
                                          String xOnEvent,
                                          String xEvent,
                                          String xWebhookId,
                                          WebhookRequestBody body) {

        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onNewMemberTrigger))) {
            onMemberCreated.handle
                    (new NewMember().memberId(body.getMemberId())
                    .accountId(body.getAccountId())
                    .constraints(body.getConstraints())
                    .memberRefId(body.getMemberRefId()).metadata(body.getMetadata()).objectType(body.getObjectType()));
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onNewProductTrigger))) {
            onProductCreated.handle(   new NewProduct().productRefId(body.getProductRefId())
                    .accountId(body.getAccountId())
                    .productName(body.getProductName())
                    .productId(body.getProductId())
                    .spaceName(body.getSpaceName())
                    .constraints(body.getConstraints())
                    .metadata(body.getMetadata()).objectType(body.getObjectType()));
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onCompetitionCreatedTrigger))) {
            onCompetitionCreated.handle(new CompetitionCreated().competitionId(body.getCompetitionId())
                    .competitionName(body.getCompetitionName())
                    .accountId(body.getAccountId())
                    .constraints(body.getConstraints())
                    .spaceName(body.getSpaceName())
                    .metadata(body.getMetadata()).objectType(body.getObjectType()));
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onCompetitionStartedTrigger))) {
            onCompetitionStarted.handle(new CompetitionStarted().competitionId(body.getCompetitionId())
                    .accountId(body.getAccountId())
                    .constraints(body.getConstraints())
                    .spaceName(body.getSpaceName())
                    .competitionName(body.getMemberRefId())
                    .metadata(body.getMetadata()).objectType(body.getObjectType()));
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onCompetitionFinishedTrigger))) {
            onCompetitionFinished.handle(new CompetitionFinished().competitionId(body.getCompetitionId())
                    .accountId(body.getAccountId())
                    .constraints(body.getConstraints())
                    .spaceName(body.getSpaceName())
                    .competitionName(body.getMemberRefId())
                    .metadata(body.getMetadata()).objectType(body.getObjectType()));
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onCompetitionStartedTrigger))) {
            onCompetitionCancelled.handle(new CompetitionCancelled().competitionId(body.getCompetitionId())
                    .accountId(body.getAccountId())
                    .constraints(body.getConstraints())
                    .spaceName(body.getSpaceName())
                    .competitionName(body.getMemberRefId())
                    .metadata(body.getMetadata()).objectType(body.getObjectType()));
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onCompetitionRewardIssuedTrigger))) {
            onCompetitionRewardIssued.handle(new CompetitionRewardIssued().competitionId(body.getCompetitionId())
                    .accountId(body.getAccountId())
                    .constraints(body.getConstraints())
                    .spaceName(body.getSpaceName())
                    .competitionName(body.getMemberRefId())
                    .metadata(body.getMetadata()).objectType(body.getObjectType()));
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onCompetitionRewardIssuedTrigger))) {
            onCompetitionRewardIssued.handle(new CompetitionRewardIssued().competitionId(body.getCompetitionId())
                    .accountId(body.getAccountId())
                    .constraints(body.getConstraints())
                    .spaceName(body.getSpaceName())
                    .competitionName(body.getMemberRefId())
                    .metadata(body.getMetadata()).objectType(body.getObjectType()));
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onContestCancelledTrigger))) {
            onContestCancelled.handle(new ContestCancelled().contestId(body.getCompetitionId())
                    .accountId(body.getAccountId())
                    .constraints(body.getConstraints())
                    .spaceName(body.getSpaceName())
                    .contestName(body.getMemberRefId())
                    .metadata(body.getMetadata()).objectType(body.getObjectType()));
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onContestFinalisedTrigger))) {
            onContestFinalised.handle(new ContestFinalised().contestId(body.getCompetitionId())
                    .accountId(body.getAccountId())
                    .constraints(body.getConstraints())
                    .spaceName(body.getSpaceName())
                    .contestName(body.getMemberRefId())
                    .metadata(body.getMetadata()).objectType(body.getObjectType()));
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onContestFinishedTrigger))) {
            onContestFinished.handle(new ContestFinished().contestId(body.getContestId())
                    .accountId(body.getAccountId())
                    .constraints(body.getConstraints())
                    .spaceName(body.getSpaceName())
                    .contestName(body.getMemberRefId())
                    .metadata(body.getMetadata()).objectType(body.getObjectType()));
        }

        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onContestRewardClaimedTrigger))) {
            onContestRewardClaimed.handle(new ContestRewardClaimed().contestId(body.getContestId())
                    .rewardId(body.getRewardId())
                    .rewardName(body.getRewardName())
                    .rewardTypeKey(body.getRewardTypeKey())
                    .rewardTypeId(body.getRewardTypeId())
                    .contestName(body.getContestName())
                    .accountId(body.getAccountId())
                    .constraints(body.getConstraints())
                    .spaceName(body.getSpaceName())
                    .contestName(body.getMemberRefId())
                    .metadata(body.getMetadata()).objectType(body.getObjectType()));
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onContestRewardIssuedTrigger))) {
            onContestRewardIssued.handle(new ContestRewardIssued().contestId(body.getContestId())
                    .rewardId(body.getRewardId())
                    .rewardName(body.getRewardName())
                    .rewardTypeKey(body.getRewardTypeKey())
                    .rewardTypeId(body.getRewardTypeId())
                    .contestName(body.getContestName())
                    .accountId(body.getAccountId())
                    .constraints(body.getConstraints())
                    .spaceName(body.getSpaceName())
                    .contestName(body.getMemberRefId())
                    .metadata(body.getMetadata()).objectType(body.getObjectType()));
        }

        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onContestRewardCreatedTrigger))) {
            onContestRewardCreated.handle(new ContestRewardCreated().contestName(body.getContestId())
                            .rewardId(body.getRewardId())
                            .rewardName(body.getRewardName())
                            .rewardTypeKey(body.getRewardTypeKey())
                            .rewardTypeId(body.getRewardTypeId())
                            .contestName(body.getContestName())
                    .accountId(body.getAccountId())
                    .constraints(body.getConstraints())
                    .spaceName(body.getSpaceName())
                    .metadata(body.getMetadata()).objectType(body.getObjectType()));
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onAchievementRewardClaimedTrigger))) {
            onAchievementRewardClaimed.handle(new AchievementRewardClaimed().achievementId(body.getAchievementId())
                    .accountId(body.getAccountId())
                    .constraints(body.getConstraints())
                    .spaceName(body.getSpaceName())
                    .achievementName(body.getAchievementName())
                            .awardId(body.getAwardId())
                    .metadata(body.getMetadata()).objectType(body.getObjectType()));
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onAchievementRewardCreatedTrigger))) {
            onAchievementRewardCreated.handle(new AchievementRewardCreated().achievementName(body.getAchievementId())
                    .rewardId(body.getRewardId())
                    .rewardName(body.getRewardName())
                    .rewardTypeKey(body.getRewardTypeKey())
                    .rewardTypeId(body.getRewardTypeId())
                    .accountId(body.getAccountId())
                    .constraints(body.getConstraints())
                    .spaceName(body.getSpaceName())
                    .achievementName(body.getAchievementName())
                    .metadata(body.getMetadata()).objectType(body.getObjectType()));
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onAchievementRewardIssuedTrigger))) {
            onAchievementRewardIssued.handle(new AchievementRewardIssued().achievementId(body.getAchievementId())
                    .accountId(body.getAccountId())
                    .constraints(body.getConstraints())
                    .spaceName(body.getSpaceName())
                    .achievementName(body.getAchievementName())
                    .awardId(body.getAwardId())
                    .metadata(body.getMetadata()).objectType(body.getObjectType()));
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onAchievementTriggeredTrigger))) {
            onAchievementTriggered.handle(new AchievementTriggered().achievementId(body.getAchievementId())
                    .accountId(body.getAccountId())
                    .constraints(body.getConstraints())
                    .spaceName(body.getSpaceName())
                    .achievementName(body.getAchievementName())
                    .metadata(body.getMetadata()).objectType(body.getObjectType()));
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onCompetitionStartedTrigger))) {
            onContestCreated.handle(new ContestCreated().contestId(body.getContestId())
                    .accountId(body.getAccountId())
                    .constraints(body.getConstraints())
                    .spaceName(body.getSpaceName())
                    .contestName(body.getContestName())
                    .metadata(body.getMetadata()).objectType(body.getObjectType()));
        }


        return null;
    }

}
