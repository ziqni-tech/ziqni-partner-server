package com.ziqni.token;

import com.ziqni.admin.sdk.model.TokenResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("get-token")
@RequiredArgsConstructor
public class TokenController {

    private final TokenService tokenService;
    @PostMapping
    public CompletableFuture<TokenResponse> getToken(String memberRefId) {

        return tokenService.getToken(memberRefId);
    }

}
