package com.ziqni.webhook;

import com.ziqni.api.model.WebhookRequestBody;
import com.ziqni.api.services.WebhooksApiDelegate;
import com.ziqni.handler.OnMemberCreated;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import static com.ziqni.webhook.WebhookTriggerType.ON_EVENT_TYPE_NAMES;

@Service
@RequiredArgsConstructor
public class WebhookService implements WebhooksApiDelegate {

    private final OnMemberCreated onMemberCreated;

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

        return null;
    }

}
