package com.pedrorijo91;

import java.util.*;

public class App {
    public static void main( String[] args ) {
        ServiceLoader<MyService> serviceLoader = ServiceLoader.load(MyService.class);

        Map<String, MyService> services = new HashMap<>();
        for (MyService service : serviceLoader) {
            System.out.println("I've found a service called '" + service.getName() + "' !");
            services.put(service.getName(), service);
        }

        System.out.println("Found " + services.size() + " services!");
    }
}
