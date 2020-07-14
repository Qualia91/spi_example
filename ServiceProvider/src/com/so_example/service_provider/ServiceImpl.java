package com.so_example.service_provider;

import com.so_example.service_api.ServiceApi;

import javax.swing.*;

public class ServiceImpl implements ServiceApi {


    @Override
    public void showMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}
