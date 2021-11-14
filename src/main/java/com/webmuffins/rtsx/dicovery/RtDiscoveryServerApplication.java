package com.webmuffins.rtsx.dicovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RtDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RtDiscoveryServerApplication.class, args);
    }

}
