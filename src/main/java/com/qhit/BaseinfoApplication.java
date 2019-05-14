package com.qhit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BaseinfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseinfoApplication.class, args);
    }

}
