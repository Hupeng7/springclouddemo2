package com.example.eurekaclient1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hup
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClient1Application {

    public static void main(String[] args) {
        /**
         * SpringApplication.run(EurekaClient1Application.class, args);
         */
        new SpringApplicationBuilder(EurekaClient1Application.class).web(true).run(args);
    }

}
