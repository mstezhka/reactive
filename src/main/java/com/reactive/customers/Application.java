package com.reactive.customers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;

@Configuration
@ComponentScan(basePackages = "com.reactive.customers")
@SpringBootApplication
@EnableWebFlux
public class Application {
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
