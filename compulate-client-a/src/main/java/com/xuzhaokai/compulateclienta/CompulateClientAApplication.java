package com.xuzhaokai.compulateclienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CompulateClientAApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompulateClientAApplication.class, args);
    }

}
