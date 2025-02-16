package com.dulcesdejesus.dulces_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.dulcesdejesus"})
@EnableJpaRepositories("com.dulcesdejesus.repositorios")
@EntityScan("com.dulcesdejesus.modelos") 
public class DulcesWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(DulcesWebApplication.class, args);
    }
}