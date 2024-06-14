package com.example.springbootprogrammatic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SimpleSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleSpringBootApplication.class, args);
    }

    @RestController
    static class GreetingController {

        @GetMapping("/greet")
        public String greet() {
            return "Hello, welcome to Spring Boot!";
        }
    }
}
