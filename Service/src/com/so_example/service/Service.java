package com.so_example.service;

import com.so_example.service_api.ServiceApi;
import java.util.List;

public class Service {

    public static void main(String[] args) {

        List<ServiceApi> serviceApis = ServiceApi.getInstances();
        for (ServiceApi serviceApi : serviceApis) {
            serviceApi.showMessage(serviceApi.getClass().getName());
        }

    }
}
