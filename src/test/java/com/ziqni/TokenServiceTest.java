package com.ziqni;

import com.ziqni.admin.sdk.model.MemberTokenRequest;
import com.ziqni.admin.sdk.model.TokenResponse;
import com.ziqni.token.TokenService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class TokenServiceTest {
    @Autowired
    TokenService tokenService;

    @Test
    public void getTokenTest(){
        TokenResponse tokenResponse = tokenService.getToken(getMemberTokenRequest("","", "gapi", true,60, "USD")).join();
        assertNotNull(tokenResponse);
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
