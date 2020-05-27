package com.pluralsight.conferencedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EntityScan("com.pluralsight.conferencedemo.models")
@EnableJpaRepositories("com.pluralsight.conferencedemo.repositories")
@SpringBootApplication
public class ConferenceDemoApplication {

    public static void main(String[] args) {
        System.out.println("Starting Spring Boot Application.");
        SpringApplication.run(ConferenceDemoApplication.class, args);
    }

}
