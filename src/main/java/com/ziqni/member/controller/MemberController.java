package com.ziqni.member.controller;

import com.ziqni.common.AbstractApiInvoker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new-member")
public class MemberController extends AbstractApiInvoker {


    public static final String ZIQNI_WEBHOOK_URL = "https://your.server.com/ziqni/webhook";
//
//    @PostMapping
//    public Response save(@RequestBody NewMember newMember) {
//        final var headers = getRequestHeaders();
//
//        final var requestEntity = new HttpEntity<>(newMember, headers);
//        return restTemplate.exchange(
//                ZIQNI_WEBHOOK_URL, HttpMethod.POST, requestEntity, Response.class).getBody();
//
//    }
}
