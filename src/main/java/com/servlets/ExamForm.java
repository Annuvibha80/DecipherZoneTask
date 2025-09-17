package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ExamForm extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1> This is get method of my servlet <h1>");

        // Fetch values from the form
        String name = request.getParameter("name");
        String rollno = request.getParameter("rollno");
        String email = request.getParameter("email");
        String subject = request.getParameter("subject");
        String date = request.getParameter("date");

        String cond = request.getParameter("condition");

        if (cond != null) {
            if (cond.equals("accepted")) {
                out.println("<h2>Exam Form Details</h2>");
                out.println("<p><b>Name:</b> " + name + "</p>");
                out.println("<p><b>Roll Number:</b> " + rollno + "</p>");
                out.println("<p><b>Email:</b> " + email + "</p>");
                out.println("<p><b>Subject:</b> " + subject + "</p>");
                out.println("<p><b>Exam Date:</b> " + date + "</p>");
            } else {
                out.println("<h2>You have not accepted terms and condition</h2>");
            }
        }
        else{
        out.println("<h2>You have not accepted terms and condition</h2>");

        //get the object of request dispatcher
        RequestDispatcher rd = request.getRequestDispatcher("ExamForm.html");
        rd.include(request, response);
    }

    }
}
