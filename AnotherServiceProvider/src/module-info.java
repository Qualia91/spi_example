
module com.so_example.another_service_provider {
    requires com.so_example.service_api;
    requires java.desktop;

    provides com.so_example.service_api.ServiceApi with com.so_example.another_service_provider.ServiceImpl;

}