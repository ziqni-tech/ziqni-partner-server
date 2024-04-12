package com.ziqni.configuration;

import com.ziqni.util.ApiFactoryUtil;
import com.ziqni.admin.sdk.ZiqniAdminApiFactory;
import com.ziqni.admin.sdk.configuration.AdminApiClientConfigBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdminConfiguration {

    @Bean
    public ZiqniAdminApiFactory ziqniAdminApiFactory() throws Exception
    {
        ApiFactoryUtil.initApiClientFactory(AdminApiClientConfigBuilder.build());
        return ApiFactoryUtil.factory;
    }
}
