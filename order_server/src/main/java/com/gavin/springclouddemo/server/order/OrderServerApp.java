package com.gavin.springclouddemo.server.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gavin on 2018/10/10.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class OrderServerApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderServerApp.class, args);
    }
}