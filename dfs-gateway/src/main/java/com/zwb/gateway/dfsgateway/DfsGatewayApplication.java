package com.zwb.gateway.dfsgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DfsGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DfsGatewayApplication.class, args);
    }

}
