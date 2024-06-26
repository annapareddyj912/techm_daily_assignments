package com.example.sevlet;

import com.example.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Collection to store student details
    private List<Student> studentList = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form parameters
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String grade = request.getParameter("grade");

        // Create a new student object and set its properties
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setGrade(grade);

        // Add the student to the list
        studentList.add(student);

        // Set the student list in the request attribute
        request.setAttribute("studentList", studentList);

        // Forward the request to the display JSP page
        request.getRequestDispatcher("displayStudent.jsp").forward(request, response);
    }
}
