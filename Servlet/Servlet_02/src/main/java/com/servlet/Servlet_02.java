package com.servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet_02") 
public class Servlet_02 extends HttpServlet {
    public Servlet_02(){
        System.out.println("Servlet Obj is created internally.");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String name = request.getParameter("uname");
        String phone = request.getParameter("uphone");
        String email = request.getParameter("uemail");
        PrintWriter writer = response.getWriter();
        writer.println("Hello " + name);
        writer.println("Your phone no : " + phone);
        writer.println("your email is: " + email);
        writer.close();
    }
    

}