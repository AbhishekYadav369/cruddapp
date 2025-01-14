package com.java.crudapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/delete-servlet")
public class DeleteServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String sName=request.getParameter("sName");
        String pName=request.getParameter("pName");
        StudentDAO studentDAO=new StudentDAO();
        studentDAO.deleteStudent(sName,pName);
        //print html page
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>Student Data Deleted Successfully  </p>");
        out.println("</body></html>");
    }
}
