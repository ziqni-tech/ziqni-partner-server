package com.ziqni.token;

import com.ziqni.admin.sdk.model.TokenResponse;
import com.ziqni.model.TokenRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("get-token")
@RequiredArgsConstructor
public class TokenController {

    private final TokenService tokenService;
    @PostMapping
    public CompletableFuture<TokenResponse> getToken(@RequestBody TokenRequest tokenRequest) {

        return tokenService.getToken(tokenRequest);
    }

}
