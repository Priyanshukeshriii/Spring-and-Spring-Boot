package com.Servlet_03;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet_03")
public class Servlet_03 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("Open Servlet_3");

        String name = request.getParameter("uname");
        String phone = request.getParameter("uphone");

        HttpSession session = request.getSession();
        session.setAttribute("name" , name);
        session.setAttribute("phone" , phone);

        System.out.println("This is the before first Servlet");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Servlet_03_1");

        requestDispatcher.forward(request,response);
//        requestDispatcher.include(request, response);

        System.out.println("This is the after first Servlet");

        writer.println("close Servlet_3");
    }


}