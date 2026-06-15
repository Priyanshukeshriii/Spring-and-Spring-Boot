package com.Servlet_03;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet_03_1")
public class Servlet_03_1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        HttpSession session = request.getSession(false);
        String name=(String) session.getAttribute("name");
        String phone=(String) session.getAttribute("phone");

        writer.println("Open Servlet_3_1 : " + name + " and phone no is "+phone);
        System.out.println("This is the Second  Servlet");
        writer.println("Close Servlet_3_1");
    }


}