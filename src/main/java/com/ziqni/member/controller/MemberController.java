package com.ziqni.member.controller;

import com.ziqni.common.AbstractApiInvoker;
import com.ziqni.common.Response;
import com.ziqni.member.data.CreateMemberRequest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new-member")
public class MemberController extends AbstractApiInvoker {


    public static final String ZIQNI_WEBHOOK_URL = "https://your.server.com/ziqni/webhook";

    @PostMapping
    public Response save(@RequestBody CreateMemberRequest createMemberRequest) {
        final var headers = getRequestHeaders();

        final var requestEntity = new HttpEntity<>(createMemberRequest, headers);
        return restTemplate.exchange(
                ZIQNI_WEBHOOK_URL, HttpMethod.POST, requestEntity, Response.class).getBody();

    }
}
