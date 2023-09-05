package com.cyb.college;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cyb.college")
public class CollegeAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(CollegeAppApplication.class, args);
    }
}
