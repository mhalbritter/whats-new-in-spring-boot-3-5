package com.example.boot35;

import org.springframework.core.task.TaskDecorator;
import org.springframework.stereotype.Component;

/**
 * @author Moritz Halbritter
 */
@Component
class MyTaskDecorator implements TaskDecorator {
    @Override
    public Runnable decorate(Runnable runnable) {
        return () -> {
            System.out.println("Before run");
            runnable.run();
            System.out.println("After run");
        };
    }
}
