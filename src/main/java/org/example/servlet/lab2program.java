package org.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class lab2program extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        if ("admin".equals(username) && "1234".equals(password)) {
            out.println("<h1>Login Successful!</h1>");
        } else {
            out.println("<h1>Invalid Username or Password</h1>");
        }
    }
}