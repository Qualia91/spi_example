package com.so_example.service;

import com.so_example.service_api.ServiceApi;
import org.junit.Test;

import java.util.List;


// need to run with this to make it put the modules on the module path
// -p D:\Software\Programming\projects\Java\spi_example\Service\out\production\Service;D:\Software\Programming\projects\Java\spi_example\Service\out\production\AnotherServiceProvider;D:\Software\Programming\projects\Java\spi_example\Service\out\production\ServiceApi;D:\Software\Programming\projects\Java\spi_example\Service\out\production\ServiceProvider;
public class ServiceTest {

	@Test
	public void SPITest() {

		List<ServiceApi> serviceApis = ServiceApi.getInstances();
		for (ServiceApi serviceApi : serviceApis) {
			serviceApi.showMessage(serviceApi.getClass().getName());
		}
	}

}