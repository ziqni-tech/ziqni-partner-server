

# WebhookRequestBody

## oneOf schemas
* [AchievementCreated](AchievementCreated.md)
* [AchievementRewardClaimed](AchievementRewardClaimed.md)
* [AchievementRewardCreated](AchievementRewardCreated.md)
* [AchievementRewardIssued](AchievementRewardIssued.md)
* [AchievementTriggered](AchievementTriggered.md)
* [CompetitionCancelled](CompetitionCancelled.md)
* [CompetitionCreated](CompetitionCreated.md)
* [CompetitionFinished](CompetitionFinished.md)
* [CompetitionRewardIssued](CompetitionRewardIssued.md)
* [CompetitionStarted](CompetitionStarted.md)
* [ContestCancelled](ContestCancelled.md)
* [ContestCreated](ContestCreated.md)
* [ContestFinalised](ContestFinalised.md)
* [ContestFinished](ContestFinished.md)
* [ContestRewardClaimed](ContestRewardClaimed.md)
* [ContestRewardCreated](ContestRewardCreated.md)
* [ContestRewardIssued](ContestRewardIssued.md)
* [ContestStarted](ContestStarted.md)
* [NewMember](NewMember.md)
* [NewProduct](NewProduct.md)

## Example
```java
// Import classes:
import com.ziqni.webhook.api.model.WebhookRequestBody;
import com.ziqni.webhook.api.model.AchievementCreated;
import com.ziqni.webhook.api.model.AchievementRewardClaimed;
import com.ziqni.webhook.api.model.AchievementRewardCreated;
import com.ziqni.webhook.api.model.AchievementRewardIssued;
import com.ziqni.webhook.api.model.AchievementTriggered;
import com.ziqni.webhook.api.model.CompetitionCancelled;
import com.ziqni.webhook.api.model.CompetitionCreated;
import com.ziqni.webhook.api.model.CompetitionFinished;
import com.ziqni.webhook.api.model.CompetitionRewardIssued;
import com.ziqni.webhook.api.model.CompetitionStarted;
import com.ziqni.webhook.api.model.ContestCancelled;
import com.ziqni.webhook.api.model.ContestCreated;
import com.ziqni.webhook.api.model.ContestFinalised;
import com.ziqni.webhook.api.model.ContestFinished;
import com.ziqni.webhook.api.model.ContestRewardClaimed;
import com.ziqni.webhook.api.model.ContestRewardCreated;
import com.ziqni.webhook.api.model.ContestRewardIssued;
import com.ziqni.webhook.api.model.ContestStarted;
import com.ziqni.webhook.api.model.NewMember;
import com.ziqni.webhook.api.model.NewProduct;

public class Example {
    public static void main(String[] args) {
        WebhookRequestBody exampleWebhookRequestBody = new WebhookRequestBody();

        // create a new AchievementCreated
        AchievementCreated exampleAchievementCreated = new AchievementCreated();
        // set WebhookRequestBody to AchievementCreated
        exampleWebhookRequestBody.setActualInstance(exampleAchievementCreated);
        // to get back the AchievementCreated set earlier
        AchievementCreated testAchievementCreated = (AchievementCreated) exampleWebhookRequestBody.getActualInstance();

        // create a new AchievementRewardClaimed
        AchievementRewardClaimed exampleAchievementRewardClaimed = new AchievementRewardClaimed();
        // set WebhookRequestBody to AchievementRewardClaimed
        exampleWebhookRequestBody.setActualInstance(exampleAchievementRewardClaimed);
        // to get back the AchievementRewardClaimed set earlier
        AchievementRewardClaimed testAchievementRewardClaimed = (AchievementRewardClaimed) exampleWebhookRequestBody.getActualInstance();

        // create a new AchievementRewardCreated
        AchievementRewardCreated exampleAchievementRewardCreated = new AchievementRewardCreated();
        // set WebhookRequestBody to AchievementRewardCreated
        exampleWebhookRequestBody.setActualInstance(exampleAchievementRewardCreated);
        // to get back the AchievementRewardCreated set earlier
        AchievementRewardCreated testAchievementRewardCreated = (AchievementRewardCreated) exampleWebhookRequestBody.getActualInstance();

        // create a new AchievementRewardIssued
        AchievementRewardIssued exampleAchievementRewardIssued = new AchievementRewardIssued();
        // set WebhookRequestBody to AchievementRewardIssued
        exampleWebhookRequestBody.setActualInstance(exampleAchievementRewardIssued);
        // to get back the AchievementRewardIssued set earlier
        AchievementRewardIssued testAchievementRewardIssued = (AchievementRewardIssued) exampleWebhookRequestBody.getActualInstance();

        // create a new AchievementTriggered
        AchievementTriggered exampleAchievementTriggered = new AchievementTriggered();
        // set WebhookRequestBody to AchievementTriggered
        exampleWebhookRequestBody.setActualInstance(exampleAchievementTriggered);
        // to get back the AchievementTriggered set earlier
        AchievementTriggered testAchievementTriggered = (AchievementTriggered) exampleWebhookRequestBody.getActualInstance();

        // create a new CompetitionCancelled
        CompetitionCancelled exampleCompetitionCancelled = new CompetitionCancelled();
        // set WebhookRequestBody to CompetitionCancelled
        exampleWebhookRequestBody.setActualInstance(exampleCompetitionCancelled);
        // to get back the CompetitionCancelled set earlier
        CompetitionCancelled testCompetitionCancelled = (CompetitionCancelled) exampleWebhookRequestBody.getActualInstance();

        // create a new CompetitionCreated
        CompetitionCreated exampleCompetitionCreated = new CompetitionCreated();
        // set WebhookRequestBody to CompetitionCreated
        exampleWebhookRequestBody.setActualInstance(exampleCompetitionCreated);
        // to get back the CompetitionCreated set earlier
        CompetitionCreated testCompetitionCreated = (CompetitionCreated) exampleWebhookRequestBody.getActualInstance();

        // create a new CompetitionFinished
        CompetitionFinished exampleCompetitionFinished = new CompetitionFinished();
        // set WebhookRequestBody to CompetitionFinished
        exampleWebhookRequestBody.setActualInstance(exampleCompetitionFinished);
        // to get back the CompetitionFinished set earlier
        CompetitionFinished testCompetitionFinished = (CompetitionFinished) exampleWebhookRequestBody.getActualInstance();

        // create a new CompetitionRewardIssued
        CompetitionRewardIssued exampleCompetitionRewardIssued = new CompetitionRewardIssued();
        // set WebhookRequestBody to CompetitionRewardIssued
        exampleWebhookRequestBody.setActualInstance(exampleCompetitionRewardIssued);
        // to get back the CompetitionRewardIssued set earlier
        CompetitionRewardIssued testCompetitionRewardIssued = (CompetitionRewardIssued) exampleWebhookRequestBody.getActualInstance();

        // create a new CompetitionStarted
        CompetitionStarted exampleCompetitionStarted = new CompetitionStarted();
        // set WebhookRequestBody to CompetitionStarted
        exampleWebhookRequestBody.setActualInstance(exampleCompetitionStarted);
        // to get back the CompetitionStarted set earlier
        CompetitionStarted testCompetitionStarted = (CompetitionStarted) exampleWebhookRequestBody.getActualInstance();

        // create a new ContestCancelled
        ContestCancelled exampleContestCancelled = new ContestCancelled();
        // set WebhookRequestBody to ContestCancelled
        exampleWebhookRequestBody.setActualInstance(exampleContestCancelled);
        // to get back the ContestCancelled set earlier
        ContestCancelled testContestCancelled = (ContestCancelled) exampleWebhookRequestBody.getActualInstance();

        // create a new ContestCreated
        ContestCreated exampleContestCreated = new ContestCreated();
        // set WebhookRequestBody to ContestCreated
        exampleWebhookRequestBody.setActualInstance(exampleContestCreated);
        // to get back the ContestCreated set earlier
        ContestCreated testContestCreated = (ContestCreated) exampleWebhookRequestBody.getActualInstance();

        // create a new ContestFinalised
        ContestFinalised exampleContestFinalised = new ContestFinalised();
        // set WebhookRequestBody to ContestFinalised
        exampleWebhookRequestBody.setActualInstance(exampleContestFinalised);
        // to get back the ContestFinalised set earlier
        ContestFinalised testContestFinalised = (ContestFinalised) exampleWebhookRequestBody.getActualInstance();

        // create a new ContestFinished
        ContestFinished exampleContestFinished = new ContestFinished();
        // set WebhookRequestBody to ContestFinished
        exampleWebhookRequestBody.setActualInstance(exampleContestFinished);
        // to get back the ContestFinished set earlier
        ContestFinished testContestFinished = (ContestFinished) exampleWebhookRequestBody.getActualInstance();

        // create a new ContestRewardClaimed
        ContestRewardClaimed exampleContestRewardClaimed = new ContestRewardClaimed();
        // set WebhookRequestBody to ContestRewardClaimed
        exampleWebhookRequestBody.setActualInstance(exampleContestRewardClaimed);
        // to get back the ContestRewardClaimed set earlier
        ContestRewardClaimed testContestRewardClaimed = (ContestRewardClaimed) exampleWebhookRequestBody.getActualInstance();

        // create a new ContestRewardCreated
        ContestRewardCreated exampleContestRewardCreated = new ContestRewardCreated();
        // set WebhookRequestBody to ContestRewardCreated
        exampleWebhookRequestBody.setActualInstance(exampleContestRewardCreated);
        // to get back the ContestRewardCreated set earlier
        ContestRewardCreated testContestRewardCreated = (ContestRewardCreated) exampleWebhookRequestBody.getActualInstance();

        // create a new ContestRewardIssued
        ContestRewardIssued exampleContestRewardIssued = new ContestRewardIssued();
        // set WebhookRequestBody to ContestRewardIssued
        exampleWebhookRequestBody.setActualInstance(exampleContestRewardIssued);
        // to get back the ContestRewardIssued set earlier
        ContestRewardIssued testContestRewardIssued = (ContestRewardIssued) exampleWebhookRequestBody.getActualInstance();

        // create a new ContestStarted
        ContestStarted exampleContestStarted = new ContestStarted();
        // set WebhookRequestBody to ContestStarted
        exampleWebhookRequestBody.setActualInstance(exampleContestStarted);
        // to get back the ContestStarted set earlier
        ContestStarted testContestStarted = (ContestStarted) exampleWebhookRequestBody.getActualInstance();

        // create a new NewMember
        NewMember exampleNewMember = new NewMember();
        // set WebhookRequestBody to NewMember
        exampleWebhookRequestBody.setActualInstance(exampleNewMember);
        // to get back the NewMember set earlier
        NewMember testNewMember = (NewMember) exampleWebhookRequestBody.getActualInstance();

        // create a new NewProduct
        NewProduct exampleNewProduct = new NewProduct();
        // set WebhookRequestBody to NewProduct
        exampleWebhookRequestBody.setActualInstance(exampleNewProduct);
        // to get back the NewProduct set earlier
        NewProduct testNewProduct = (NewProduct) exampleWebhookRequestBody.getActualInstance();
    }
}
```


