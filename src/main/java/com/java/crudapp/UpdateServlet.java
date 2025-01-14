package com.java.crudapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/update-servlet")
public class UpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sName=request.getParameter("sName");
        String pName=request.getParameter("pName");
        String newName = request.getParameter("newName");
        String newPName = request.getParameter("newPName");
        String newPhoneNo = request.getParameter("newPhoneNo");
        int newClass= Integer.parseInt(request.getParameter("newClass"));
        Student student= new Student(0,newName,newPName,newClass,newPhoneNo);
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.updateStudent(student,sName,pName);

        //print html page
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>Student Data Updated Successfully  </p>");
        out.println("</body></html>");
    }
}
