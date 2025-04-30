package com.example.boot35;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * @author Moritz Halbritter
 */
class MyServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        res.getWriter().println("MyServlet - Hello!");
    }
}
