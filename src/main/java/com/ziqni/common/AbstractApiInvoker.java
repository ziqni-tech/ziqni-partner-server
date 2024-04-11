package com.ziqni.common;

import com.ziqni.token.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import static com.ziqni.common.Utils.getHttpHeaders;

public abstract class AbstractApiInvoker {
    @Autowired
    protected TokenService tokenService;

    @Autowired
    protected RestTemplate restTemplate;

    public final HttpHeaders getRequestHeaders() {
        final String token = tokenService.getToken();
        final HttpHeaders headers = getHttpHeaders();
        headers.add(HttpHeaders.AUTHORIZATION, "Bearer " + token);
        return headers;
    }
}