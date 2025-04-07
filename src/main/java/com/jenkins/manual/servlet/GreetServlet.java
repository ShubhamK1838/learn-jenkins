package com.jenkins.manual.servlet;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;






@WebServlet("/hello")
public class GreetServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Hello World!</h1>");
        out.println("<h2>Hello World!</h2>");
        out.println("<h3>Hello World!</h3>");
        out.println("<h4>Hello World!</h4>");
        out.println("<h5>Hello World!</h5>");

        out.close();

    }
}
