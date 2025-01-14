package com.java.crudapp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CreateServlet", value = "/create-servlet")
public class CreateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sName = request.getParameter("uName");
        String pName = request.getParameter("pName");
        String phoneNo = request.getParameter("uPhone");
        int sClass= Integer.parseInt(request.getParameter("uClass"));
        Student student= new Student(0,sName,pName,sClass,phoneNo);

        StudentDAO studentDAO = new StudentDAO();
        studentDAO.addStudent(student);
        //print html page
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>Student Data Added Successfully  </p>");

        out.println("</body></html>");

    }
}
