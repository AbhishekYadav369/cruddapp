package com.java.crudapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
@WebServlet(value="/read-servlet")
public class ReadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sName=request.getParameter("sName");
        String pName=request.getParameter("pName");
        StudentDAO studentDAO=new StudentDAO();
        try {
            ResultSet resultSet=studentDAO.readStudent(sName,pName);
            //print output
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<p>Student Data Read Successfully  </p>");
            out.println("</body></html>");

        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }

    }
}
