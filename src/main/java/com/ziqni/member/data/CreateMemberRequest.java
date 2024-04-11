package com.ziqni.member.data;

import com.ziqni.common.Metadata;
import jdk.jfr.DataAmount;
import lombok.Data;

import java.util.List;

@Data
public class CreateMemberRequest {

    private Metadata metadata;
    private String objectType;
    private List<String> constraints;
    private String accountId;
    private String spaceName;
    private String productId;
    private String productRefId;
    private String productName;

}
