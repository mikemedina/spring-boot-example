package com.example.projects.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication  // This enables all of Spring's magic
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);  // This is where Spring launches it's "context"
    }

}
