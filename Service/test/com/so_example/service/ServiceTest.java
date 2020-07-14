package com.so_example.service;

import com.so_example.service_api.ServiceApi;
import org.junit.Test;

import java.util.List;

public class ServiceTest {

	@Test
	public void SPITest() {

		List<ServiceApi> serviceApis = ServiceApi.getInstances();
		for (ServiceApi serviceApi : serviceApis) {
			serviceApi.showMessage(serviceApi.getClass().getName());
		}
	}

}