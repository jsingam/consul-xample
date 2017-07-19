package com.singam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Jeyanthasingam on 7/8/2017.
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.singam", "controller", "service"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}

