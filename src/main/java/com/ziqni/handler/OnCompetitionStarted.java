package com.ziqni.handler;

import com.ziqni.api.model.CompetitionCreated;
import com.ziqni.api.model.CompetitionStarted;
import com.ziqni.api.model.NewMember;
import com.ziqni.api.model.WebhookRequestBody;
import org.springframework.stereotype.Component;

@Component
public class OnCompetitionStarted {

    public void handle(WebhookRequestBody body)
    {
         new CompetitionStarted().competitionId(body.getCompetitionId())
                 .accountId(body.getAccountId())
                 .constraints(body.getConstraints())
                 .spaceName(body.getSpaceName())
                 .competitionName(body.getMemberRefId())
                 .metadata(body.getMetadata()).objectType(body.getObjectType());

    }
}
