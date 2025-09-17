package com.servlets.attributes;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class S1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1> This is get method of my servlet <h1>");

        String n1 = request.getParameter("n1");
        String n2 = request.getParameter("n2");

        int nn1 = Integer.parseInt(n1);
        int nn2 = Integer.parseInt(n2);

        //add
        int s = nn1 + nn2;

        //attribute
        request.setAttribute("sum", s);

        //request dispatcher
        RequestDispatcher rd = request.getRequestDispatcher("S2");
        rd.forward(request, response);

    }

}
