package com.example.boot35;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Moritz Halbritter
 */
@Component
class MyExceptionLogger implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyExceptionLogger.class);

    @Override
    public void run(String... args) {
        LOGGER.error("Boom", new RuntimeException("Boom", new RuntimeException("Cause", new RuntimeException("Root cause"))));
    }
}
