package com.servlets;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

//creates servlet : by extend GenericServlet


public class SecondServlet extends GenericServlet {

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("This is servlet using generic servlet");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1> this is my second servlet using generic servlet <h1>");
        out.println("<h1>Today's Date and Time is" +new Date().toString()+"</h1>");
    }
}
