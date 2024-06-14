<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.model.Student" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Display Student Information</title>
</head>
<body>
    <h2>Student Information</h2>
    <%
        List<Student> studentList = (List<Student>) request.getAttribute("studentList");
        if (studentList != null && !studentList.isEmpty()) {
            for (Student student : studentList) {
    %>
                <p>Name: <%= student.getName() %></p>
                <p>Age: <%= student.getAge() %></p>
                <p>Grade: <%= student.getGrade() %></p>
                <hr>
    <%
            }
        } else {
    %>
            <p>No student information available.</p>
    <%
        }
    %>
</body>
</html>
