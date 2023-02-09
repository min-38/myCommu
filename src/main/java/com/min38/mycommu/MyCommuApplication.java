package com.min38.mycommu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class MyCommuApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCommuApplication.class, args);
    }

}
