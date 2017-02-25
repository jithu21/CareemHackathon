package com.careem.hack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by apple on 2/24/17.
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {"com.careem.repository"})
@EntityScan(basePackages = {"com.careem.models"})
@ComponentScan("com.careem")
public class SpringBootJpaSpringDataApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaSpringDataApplication.class, args);
    }
}
