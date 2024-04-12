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
    public final static String GAPI_RESOURCE_NAME = "ziqni-gapi";
    public final String apiKey="eyJhbGciOiJIUzUxMiJ9.eyJhcGlfa2V5X2lkIjoiY3pGdlBZc0JMdHRtZFNkYlpQRGMiLCJtZW1iZXJfcmVmZXJlbmNlX2lkIjoiWEFQSSIsImFjY291bnRfaWQiOiJMVWhyRjNFQml6ejl5MV9XWmJhQSIsInNwYWNlX25hbWUiOiJteXNwYWNlNSIsIm5hbWUiOiJYQVBJIiwibWVtYmVyX3R5cGUiOiJYQVBJIiwibWVtYmVyX2lkIjoiVGVzdFVzZXJJZCIsInJlc291cmNlX2FjY2VzcyI6eyJ6aXFuaS1hYXBpIjp7InJvbGVzIjpbIlZpZXdBY2NvdW50U2V0dGluZ3MiLCJWaWV3QWNoaWV2ZW1lbnQiLCJWaWV3QWN0aW9ucyIsIlZpZXdBd2FyZHMiLCJWaWV3Q29tcGV0aXRpb25zIiwiVmlld0NvbnRlc3QiLCJWaWV3Q3VzdG9tRmllbGRzIiwiVmlld0V2ZW50cyIsIlZpZXdMYW5ndWFnZSIsIlZpZXdNZW1iZXJzIiwiVmlld01lc3NhZ2VzIiwiVmlld09iamVjdHMiLCJWaWV3UHJvZHVjdHMiLCJWaWV3UmV3YXJkcyIsIlZpZXdSZXdhcmRUeXBlIiwiVmlld1RyYW5zbGF0aW9ucyIsIlZpZXdSdWxlcyIsIlZpZXdTcGFjZXMiLCJWaWV3VGFncyIsIlZpZXdVT00iLCJWaWV3VXNlciJdfX0sInR5cCI6IngtYXBpLWtleSIsInN1YiI6IlRlc3RVc2VySWQiLCJqdGkiOiI0ZWY0MTZjMS02NDVmLTQ4MTktYmNjYy00NDZhODY4YmQ5MDQiLCJpYXQiOjE2OTc1NDI3OTIsImV4cCI6MTcyOTA3ODc5MiwiYXpwIjoibXlzcGFjZTUuemlxbmkuYXBwIn0.wxJnXk3ywOv9PrWIX7Gty_-8cqUqKlKL74CnGuYFnP9XVMc8BRHeoFTrGHKJhnYqPNaZdeY1jFiYCRFVLpPGiQ";

    public TokenService(ZiqniAdminApiFactory ziqniAdminApiFactory) {
        this.ziqniAdminApiFactory = ziqniAdminApiFactory;
    }

    public CompletableFuture<TokenResponse> getToken(String memberRefId) {


      return     memberExistsElseCreate(memberRefId).thenCompose(r->
                          ziqniAdminApiFactory.getMemberTokenApi().createMemberToken(getMemberTokenRequest(memberRefId, apiKey, GAPI_RESOURCE_NAME, true,60, "USD"))
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
