package com.example.boot35;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author Moritz Halbritter
 */
@Configuration(proxyBeanMethods = false)
class MySlowInitBeanConfiguration {
    @Lazy
    @Bean(bootstrap = Bean.Bootstrap.BACKGROUND)
    MySlowInitBean mySlowInitBean() {
        return new MySlowInitBean();
    }
}
