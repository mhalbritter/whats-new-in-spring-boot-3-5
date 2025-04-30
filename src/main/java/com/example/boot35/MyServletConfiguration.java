package com.example.boot35;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Moritz Halbritter
 */
@Configuration(proxyBeanMethods = false)
class MyServletConfiguration {

    @Bean
    ServletRegistrationBean<MyServlet> myServlet() {
        ServletRegistrationBean<MyServlet> registration = new ServletRegistrationBean<>(new MyServlet());
        registration.addUrlMappings("/myservlet/*");
        registration.setAsyncSupported(false);
        registration.setName("myServlet");
        return registration;
    }

//    @Bean
//    @ServletRegistration(name = "myServlet", asyncSupported = false, urlMappings = "/myservlet/*")
//    MyServlet myServlet() {
//        return new MyServlet();
//    }
}
