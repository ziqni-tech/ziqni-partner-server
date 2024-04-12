package com.ziqni.token;

import com.ziqni.admin.sdk.ZiqniAdminApiFactory;
import com.ziqni.admin.sdk.model.*;
import com.ziqni.model.TokenRequest;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class TokenService {


    private final ZiqniAdminApiFactory ziqniAdminApiFactory;

    public TokenService(ZiqniAdminApiFactory ziqniAdminApiFactory) {
        this.ziqniAdminApiFactory = ziqniAdminApiFactory;
    }

    public CompletableFuture<TokenResponse> getToken(TokenRequest tokenRequest) {

        return  memberExistsElseCreate(tokenRequest.getPlayerId()).thenCompose(r->
                          ziqniAdminApiFactory.getMemberTokenApi().createMemberToken(getMemberTokenRequest(tokenRequest))
                  );
    }

    private CompletableFuture<String> memberExistsElseCreate(String playerId) {
        return ziqniAdminApiFactory.getMembersApi().getMembersByRefId(List.of(playerId),1,0).thenCompose(memberResponse ->
                {
                    if(CollectionUtils.isEmpty(memberResponse.getResults())) {
                        return ziqniAdminApiFactory.getMembersApi().createMembers(List.of(new CreateMemberRequest().memberRefId(playerId).name(playerId)))
                                .thenApply(modelApiResponse -> {
                                    // Handle the response here
                                    return playerId;
                                });
                    }
                    else
                        return CompletableFuture.completedFuture(playerId);
                });
    }
    public MemberTokenRequest getMemberTokenRequest(TokenRequest tokenRequest) {
        return new MemberTokenRequest()
                .member(tokenRequest.getPlayerId())
                .apiKey("get the API key from properties file")
                .resource("g-api")
                .isReferenceId(true)
                .expires(60_000)
                .currencyKey(tokenRequest.getCurrencyCode());

    }
}
