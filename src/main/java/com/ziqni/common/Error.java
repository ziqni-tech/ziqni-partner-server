package com.ziqni.common;

import lombok.Data;

import java.util.List;

@Data
public class Error{
    private int errorCode;
    private String message;
    private List<String> detail;
}