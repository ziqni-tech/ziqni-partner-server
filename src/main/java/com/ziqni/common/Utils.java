package com.ziqni.common;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.List;

public class Utils {
    public static HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        headers.add("Access-Control-Allow-Origin", "*");
        return headers;
    }
}
