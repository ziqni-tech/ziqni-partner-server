package com.ziqni.token;

import com.ziqni.admin.sdk.ZiqniAdminApiFactory;
import com.ziqni.admin.sdk.model.*;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Service
public class TokenService {


    private final ZiqniAdminApiFactory ziqniAdminApiFactory;

    public TokenService(ZiqniAdminApiFactory ziqniAdminApiFactory) {
        this.ziqniAdminApiFactory = ziqniAdminApiFactory;
    }

    public CompletableFuture<TokenResponse> getToken(MemberTokenRequest memberTokenRequest) {


      return     memberExistsElseCreate(memberTokenRequest.getMember()).thenCompose(r->
                          ziqniAdminApiFactory.getMemberTokenApi().createMemberToken(memberTokenRequest)
                  );

    }

    private CompletableFuture<String> memberExistsElseCreate(String memberRefId) {
        return ziqniAdminApiFactory.getMembersApi().getMembersByRefId(List.of(memberRefId),1,0).thenCompose(memberResponse ->
                {
                    if(CollectionUtils.isEmpty(memberResponse.getResults()))
                        ziqniAdminApiFactory.getMembersApi().createMembers(List.of(new CreateMemberRequest().memberRefId(memberRefId).name(memberRefId)));

                   return CompletableFuture.completedFuture(memberRefId);
                }
                );
    }
    public MemberTokenRequest getMemberTokenRequest(String member, String apiKey, String resource, boolean isReferenceId, int expires, String currencyKey) {
        return new MemberTokenRequest()
                .member(member)
                .apiKey(apiKey)
                .resource(resource)
                .isReferenceId(isReferenceId)
                .expires(expires)
                .currencyKey(currencyKey);

    }
}
