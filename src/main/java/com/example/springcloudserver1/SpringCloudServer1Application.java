package com.example.springcloudserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServer1Application.class, args);
    }

}
