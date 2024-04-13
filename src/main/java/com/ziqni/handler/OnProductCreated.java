package com.ziqni.handler;

import com.ziqni.api.model.NewProduct;
import com.ziqni.api.model.WebhookRequestBody;
import org.springframework.stereotype.Component;

@Component
public class OnProductCreated {

    public void handle(WebhookRequestBody body)
    {
      new NewProduct().productRefId(body.getProductRefId())
              .accountId(body.getAccountId())
              .productName(body.getProductName())
              .productId(body.getProductId())
              .spaceName(body.getSpaceName())
              .constraints(body.getConstraints())
              .metadata(body.getMetadata()).objectType(body.getObjectType());

    }
}
