package com.ziqni.util;

import com.ziqni.admin.sdk.ZiqniAdminApiFactory;
import com.ziqni.admin.sdk.configuration.AdminApiClientConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiFactoryUtil {

    private static final Logger logger = LoggerFactory.getLogger(ApiFactoryUtil.class);

    public static ZiqniAdminApiFactory factory;

    public static void initApiClientFactory(AdminApiClientConfiguration configuration) throws Exception {
        if(ApiFactoryUtil.factory != null)
            return;

        ApiFactoryUtil.factory = new ZiqniAdminApiFactory(configuration);
        ApiFactoryUtil.factory.initialise();

        if(configuration.isWebsocket()) {
            while (ApiFactoryUtil.factory.getStreamingClient() == null) {
                Thread.sleep(500);
                logger.info("Waiting for the streaming client to initialize");
            }

            final var started = ApiFactoryUtil.factory.getStreamingClient().start();
            while (!ApiFactoryUtil.factory.getStreamingClient().isConnected()) {
                Thread.sleep(500);
                logger.info("Waiting for the streaming client start");
            }
        }
    }

}
