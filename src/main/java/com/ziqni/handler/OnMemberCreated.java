package com.ziqni.handler;

import com.ziqni.api.model.NewMember;
import com.ziqni.api.model.WebhookRequestBody;
import org.springframework.stereotype.Component;

@Component
public class OnMemberCreated {

    public void handle(WebhookRequestBody body)
    {
         new NewMember().memberId(body.getMemberId())
                 .accountId(body.getAccountId())
                 .constraints(body.getConstraints())
                 .memberRefId(body.getMemberRefId()).metadata(body.getMetadata()).objectType(body.getObjectType());

    }
}
