package com.ziqni.webhook;

import com.ziqni.api.model.*;
import com.ziqni.api.services.WebhooksApiDelegate;
import com.ziqni.handler.OnCompetitionCreated;
import com.ziqni.handler.OnCompetitionStarted;
import com.ziqni.handler.OnMemberCreated;
import com.ziqni.handler.OnProductCreated;
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
        return null;
    }

}
