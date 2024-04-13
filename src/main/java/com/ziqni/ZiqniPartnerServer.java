package com.ziqni;

import com.google.common.eventbus.Subscribe;
import com.ziqni.admin.sdk.ZiqniAdminApiFactory;
import com.ziqni.admin.sdk.context.WSClientConnected;
import com.ziqni.admin.sdk.context.WSClientConnecting;
import com.ziqni.admin.sdk.context.WSClientDisconnected;
import com.ziqni.admin.sdk.context.WSClientSevereFailure;
import com.ziqni.concurrent.ZiqniThreadFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.OffsetDateTime;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class ZiqniPartnerServer {


	private final ZiqniAdminApiFactory ziqniAdminApiFactory;

	private final AtomicBoolean waitingForReconnect = new AtomicBoolean(false);
	public static final ScheduledThreadPoolExecutor ReconnectScheduledExecutor = newSingleThreadScheduledExecutor("ziqni-reconnect");
	public static void main(String[] args) {
		SpringApplication.run(ZiqniPartnerServer.class, args);
	}


	//////// ADMIN API CLIENT EVENTBUS ////////
	@Subscribe
	public void onWSClientConnected(WSClientConnected change) {

	}

	@Subscribe
	public void onWSClientConnecting(WSClientConnecting change) {
	}

	@Subscribe
	public void onWSClientDisconnected(WSClientDisconnected change) {
		if (!waitingForReconnect.get()) { // Have we been told to reconnect?
			waitingForReconnect.set(true); // Make a note to say we are already trying to reconnect

			scheduleReconnectWatcher();
		}
	}

	@Subscribe
	public void onWSClientSevereFailure(WSClientSevereFailure change) {
		log.info("WSClientSevereFailure");
	}

	private void scheduleReconnectWatcher() {
		waitingForReconnect.set(true);
		ReconnectScheduledExecutor.schedule(() -> {
			if (this.ziqniAdminApiFactory.getStreamingClient().isConnected()) {
				waitingForReconnect.set(false);

			} else {
				try {
					this.ziqniAdminApiFactory.getStreamingClient().start();
				} catch (Throwable throwable) {
					log.error("Failed to start the streaming client. scheduling a retry at {} [{}]", OffsetDateTime.now().plusSeconds(30), throwable.getMessage());
				}
				scheduleReconnectWatcher();
			}
		}, 30, TimeUnit.SECONDS);
	}
	public static ScheduledThreadPoolExecutor newSingleThreadScheduledExecutor(final String executorNamePrefix){
		final var ziqniThreadFactory = new ZiqniThreadFactory(executorNamePrefix);
		return new ScheduledThreadPoolExecutor(1, ziqniThreadFactory);
	}

}
