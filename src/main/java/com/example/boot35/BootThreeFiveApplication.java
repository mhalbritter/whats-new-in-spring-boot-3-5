package com.example.boot35;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class BootThreeFiveApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BootThreeFiveApplication.class, args);
        context.getBean(MyService.class).doSomething();
    }

}
