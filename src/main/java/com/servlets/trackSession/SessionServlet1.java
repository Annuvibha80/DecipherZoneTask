package com.servlets.trackSession;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class SessionServlet1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get name from request
        String name = request.getParameter("name");


        out.println("<h1>Hello, " + name + "</h1>");
        out.println("<p>This value was received from the form.</p>");
        out.println("<a href='SessionServlet2'>Go to Servlet 2 </a>");

    }
}