package com.example.boot35;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableConfigurationProperties(MyProperties.class)
public class BootThreeFiveApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BootThreeFiveApplication.class, args);
        context.getBean(MyService.class).doSomething();
        context.getBean(MyProperties.class).print();
    }

}
