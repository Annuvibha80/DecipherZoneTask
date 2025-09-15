package com.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

//Creates servlet using implementing servlet


public class FirstServlet implements Servlet {

    //Life cycle emthods

    ServletConfig conf;
    public void init(ServletConfig conf){
        this.conf = conf;
        System.out.println("Creating object ");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
    {
        System.out.println("Servicing ");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1> this is my output from servlet method: <h1>");
        out.println("<h1>Today's Date and Time is" +new Date().toString()+"</h1>");
    }

    @Override
    public void destroy() {
        System.out.println("Going to destroy servlet object : ");
    }

    //Non-life cycle methods

    @Override
    public ServletConfig getServletConfig() {
        return this.conf;
    }

    public String getServletInfo(){
        return "This servlet is created by Annuvibha";
    }
}
