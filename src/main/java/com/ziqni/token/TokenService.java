package com.ziqni.token;

import com.ziqni.admin.sdk.ZiqniAdminApiFactory;
import com.ziqni.admin.sdk.model.*;
import com.ziqni.model.TokenRequest;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@Service
public class TokenService {

    private final ZiqniAdminApiFactory ziqniAdminApiFactory;
    @Value("${admin.client.auth.api.key}")
    private String apiKey;

    public TokenService(ZiqniAdminApiFactory ziqniAdminApiFactory) {
        this.ziqniAdminApiFactory = ziqniAdminApiFactory;
    }

    /**
     * Get the token
     *
     * @param tokenRequest The token request
     * @return The completable future
     */
    public CompletableFuture<TokenResponse> getToken(TokenRequest tokenRequest) {

        final var memberRefId = tokenRequest.getPlayerId();

        return memberExistsElseCreate(memberRefId, tokenRequest).thenCompose(unused ->

                ziqniAdminApiFactory.getMemberTokenApi().createMemberToken(prepareMemberTokenRequest(memberRefId, tokenRequest)));
    }

    /**
     * Check if the member exists else create the member
     *
     * @param memberRefId  The member reference id
     * @param tokenRequest The token request
     * @return The completable future
     */
    private CompletableFuture<Void> memberExistsElseCreate(String memberRefId, TokenRequest tokenRequest) {

        return ziqniAdminApiFactory.getMembersApi().getMembersByRefId(List.of(memberRefId), 1, 0).thenCompose(memberResponse ->
        {
            if (CollectionUtils.isEmpty(memberResponse.getResults())) {
                return ziqniAdminApiFactory.getMembersApi().createMembers(List.of(prepareCreateMemberRequest(memberRefId, tokenRequest)))
                        .thenAccept(modelApiResponse -> {
                            // Handle the response here
                        });
            } else
                return CompletableFuture.completedFuture(null);
        });
    }

    /**
     * Make the member reference id
     *
     * @param tokenRequest The token request
     * @return The member reference id
     */
    private static String makeMemberRefId(TokenRequest tokenRequest) {
        return tokenRequest.getOperatorId() + "_" + tokenRequest.getPlayerId();
    }

    /**
     * Prepare the create member request
     *
     * @param memberRefId  The member reference id
     * @param tokenRequest The token request
     * @return The create member request
     */
    public CreateMemberRequest prepareCreateMemberRequest(String memberRefId, TokenRequest tokenRequest) {

        final Map<String, Object> customFields = Map.of(
                "operatorId", tokenRequest.getOperatorId(),
                "playerId", tokenRequest.getPlayerId()
        );

        return new CreateMemberRequest()
                .memberRefId(memberRefId)
                .name(tokenRequest.getPlayerId())
                .memberType(MemberType.INDIVIDUAL)
                //.tags(List.of("player")) // These are user segments like, Casual, Hardcore, AchievementHunter, etc
                .timeZoneOffset("UTC") // <<< Default is UTC. Three-letter time zone ID. https://docs.oracle.com/javase/7/docs/api/java/util/TimeZone.html#getAvailableIDs%28%29
                .customFields(customFields);
    }

    /**
     * Prepare the member token request
     *
     * @param memberRefId  The member reference id
     * @param tokenRequest The token request
     * @return The member token request
     */
    public MemberTokenRequest prepareMemberTokenRequest(String memberRefId, TokenRequest tokenRequest) {
        return new MemberTokenRequest()
                .member(memberRefId)
                .apiKey(apiKey)
                .resource("ziqni-gapi")
                .isReferenceId(true)
                .expires(60_000)
                .currencyKey(tokenRequest.getCurrencyCode());

    }
}
