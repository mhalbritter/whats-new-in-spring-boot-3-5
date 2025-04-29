package com.example.boot35;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author Moritz Halbritter
 */
@Service
class MyService {
    @Async
    void doSomething() {
        System.out.println("MyService.doSomething");
    }
}
