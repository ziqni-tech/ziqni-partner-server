package com.ziqni.handler;

import com.ziqni.admin.sdk.model.Competition;
import com.ziqni.api.model.CompetitionCreated;
import com.ziqni.api.model.NewMember;
import com.ziqni.api.model.WebhookRequestBody;
import org.springframework.stereotype.Component;

@Component
public class OnCompetitionCreated {

    public void handle(WebhookRequestBody body)
    {
         new CompetitionCreated().competitionId(body.getCompetitionId())
                 .competitionName(body.getCompetitionName())
                 .accountId(body.getAccountId())
                 .constraints(body.getConstraints())
                 .spaceName(body.getSpaceName())
                 .metadata(body.getMetadata()).objectType(body.getObjectType());

    }
}
