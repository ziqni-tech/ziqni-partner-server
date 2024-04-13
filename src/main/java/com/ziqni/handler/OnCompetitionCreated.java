package com.ziqni.handler;

import com.ziqni.admin.sdk.model.Competition;
import com.ziqni.api.model.CompetitionCreated;
import com.ziqni.api.model.NewMember;
import com.ziqni.api.model.WebhookRequestBody;
import org.springframework.stereotype.Component;
import com.ziqni.api.model.*;

@Component
public class OnCompetitionCreated {

    public void handle(CompetitionCreated event)
    {
        ;

    }
}
