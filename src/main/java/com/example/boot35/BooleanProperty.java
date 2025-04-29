package com.example.boot35;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBooleanProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Moritz Halbritter
 */
@Configuration(proxyBeanMethods = false)
class BooleanProperty {
    @Bean
    @ConditionalOnBooleanProperty(name = "my.boolean.property")
    String myBooleanProperty() {
        System.out.println("BooleanProperty.myBooleanProperty");
        return "true";
    }
}
