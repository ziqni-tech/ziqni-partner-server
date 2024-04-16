package com.ziqni.webhook.handler;

import com.ziqni.api.model.NewProduct;
import com.ziqni.api.model.WebhookRequestBody;
import org.springframework.stereotype.Component;

@Component
public class OnProductCreated {

    public void handle(NewProduct event)
    {


    }
}
