package com.servlets;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class MyForm extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2> Welcome to Register Servlet <h2>");

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String course = request.getParameter("course");

        String cond = request.getParameter("condition");

        if (cond != null) {
            if (cond.equals("checked")) {
                out.println("<h2> Name : " + name + "<h2>");
                out.println("<h2> Password : " + password + "<h2>");
                out.println("<h2> Email : " + email + "<h2>");
                out.println("<h2> Gender : " + gender + "<h2>");
                out.println("<h2> Course : " + course + "<h2>");

                RequestDispatcher rd = request.getRequestDispatcher("SuccessServlet");
                rd.forward(request, response);

            } else {
                out.println("<h2>You have not accepted terms and condition</h2>");
            }
        }
        else{
                out.println("<h2>You have not accepted terms and condition</h2>");

                //get the object of request dispatcher
                RequestDispatcher rd = request.getRequestDispatcher("MyForm.html");
                rd.include(request, response);
            }
        }
    }


