package com.so_example.another_service_provider;

import com.so_example.service_api.ServiceApi;

public class ServiceImpl implements ServiceApi {


    @Override
    public void showMessage(String msg) {
        System.out.println(msg);
    }
}

