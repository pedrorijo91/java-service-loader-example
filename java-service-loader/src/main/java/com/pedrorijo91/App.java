package com.pedrorijo91;

import java.util.*;

public class App {
    public static void main( String[] args ) {
        ServiceLoader<MyService> serviceLoader = ServiceLoader.load(MyService.class);

        List<MyService> services = new ArrayList<>();
        for (MyService service : serviceLoader) {
            System.out.println("I've found a service called '" + service.getName() + "' !");
            services.add(service);
        }

        System.out.print("Found " + services.size() + " services!");

    }
}
