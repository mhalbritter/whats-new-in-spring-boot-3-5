package com.example.boot35;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Moritz Halbritter
 */
@ConfigurationProperties(prefix = "my")
public record MyProperties(String name, String employer) {
    void print() {
        System.out.println("Name = " + this.name);
        System.out.println("Employer = " + this.employer);
    }
}
