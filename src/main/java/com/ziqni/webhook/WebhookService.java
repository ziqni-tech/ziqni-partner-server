package com.ziqni.webhook;

import com.ziqni.api.model.WebhookRequestBody;
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
            onMemberCreated.handle(body);
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onNewProductTrigger))) {
            onProductCreated.handle(body);
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onCompetitionCreatedTrigger))) {
            onCompetitionCreated.handle(body);
        }
        if (xOnEvent.equals(ON_EVENT_TYPE_NAMES.get(WebhookTriggerType.onCompetitionStartedTrigger))) {
            onCompetitionStarted.handle(body);
        }
        return null;
    }

}
