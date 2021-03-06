package com.tech.microservices.samplenamingserver.samplenamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SampleNamingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleNamingServerApplication.class, args);
    }

}
