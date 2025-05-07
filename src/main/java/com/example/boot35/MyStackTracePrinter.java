package com.example.boot35;

import java.io.IOException;

import org.springframework.boot.logging.StackTracePrinter;

/**
 * @author Moritz Halbritter
 */
class MyStackTracePrinter implements StackTracePrinter {

    @Override
    public void printStackTrace(Throwable throwable, Appendable out) throws IOException {
        out.append("My stack trace:\n");
    }
}
