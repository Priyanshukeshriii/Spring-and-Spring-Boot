package Controller;
import Model.Model;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Register") 
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        String name = request.getParameter("uname");
        String phone = request.getParameter("uphone");
        String email = request.getParameter("uemail");
        String address = request.getParameter("uaddress");

        Model model = new Model();
        model.setName(name);
        model.setEmail(email);
        model.setPhone(phone);
        model.setAddress(address);

        HttpSession session = request.getSession();
        session.setAttribute("name" , name);

        int row = model.register();
        if(row != 0){
            response.sendRedirect("Success.jsp");
        }else {
            response.sendRedirect("Failure.jsp");
        }

    }
    

}