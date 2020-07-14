package com.so_example.service_api;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public interface ServiceApi {

    static List<ServiceApi> getInstances() {
        ServiceLoader<ServiceApi> serviceApis = ServiceLoader.load(ServiceApi.class);
        List<ServiceApi> list = new ArrayList<>();
        serviceApis.iterator().forEachRemaining(list::add);
        return list;
    }

    void showMessage(String msg);

}
