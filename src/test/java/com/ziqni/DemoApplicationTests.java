package com.ziqni;

import com.ziqni.admin.sdk.ZiqniAdminApiFactory;
import com.ziqni.admin.sdk.model.MemberTokenRequest;
import com.ziqni.admin.sdk.model.SpaceResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private ZiqniAdminApiFactory ziqniAdminApiFactory;
	@Test
	void contextLoads() {
	}
 @Test
	public void getSpace()
 {
	 SpaceResponse spaceResponse = ziqniAdminApiFactory.getSpacesApi().getSpacesByName("first-space", 1, 0).join();
    assertNotNull(spaceResponse);

 }

}
