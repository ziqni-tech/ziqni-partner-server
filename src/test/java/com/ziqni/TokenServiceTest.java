package com.ziqni;

import com.ziqni.admin.sdk.model.TokenResponse;
import com.ziqni.model.TokenRequest;
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
        TokenResponse tokenResponse = tokenService.getToken(new TokenRequest().setOperatorId("123").setPlayerId("456").setCurrencyCode("USD")).join();
        assertNotNull(tokenResponse);
    }
}
