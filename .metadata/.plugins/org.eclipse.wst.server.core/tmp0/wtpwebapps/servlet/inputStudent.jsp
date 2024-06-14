<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Input Student Information</title>
</head>
<body>
    <h2>Input Student Information</h2>
    <form action="student" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required><br><br>

        <label for="grade">Grade:</label>
        <input type="text" id="grade" name="grade" required><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
