package com.ziqni.handler;

import com.ziqni.api.model.CompetitionCreated;
import com.ziqni.api.model.CompetitionStarted;
import com.ziqni.api.model.NewMember;
import com.ziqni.api.model.WebhookRequestBody;
import org.springframework.stereotype.Component;

@Component
public class OnCompetitionStarted {

    public void handle(CompetitionStarted event)
    {


    }
}
