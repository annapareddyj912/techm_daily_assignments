<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Simple Calculator</title>
</head>
<body>
    <h2>Simple Calculator</h2>
    <form action="calculator.jsp" method="post">
        <label for="num1">Number 1:</label>
        <input type="number" id="num1" name="num1" required><br><br>

        <label for="num2">Number 2:</label>
        <input type="number" id="num2" name="num2" required><br><br>

        <label for="operation">Operation:</label>
        <select id="operation" name="operation" required>
            <option value="add">Addition</option>
            <option value="subtract">Subtraction</option>
            <option value="multiply">Multiplication</option>
            <option value="divide">Division</option>
        </select><br><br>

        <input type="submit" value="Calculate">
    </form>

    <%
        // Retrieve input parameters
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String operation = request.getParameter("operation");
        Double result = null;

        // Check if input parameters are present
        if (num1Str != null && num2Str != null && operation != null) {
            try {
                double num1 = Double.parseDouble(num1Str);
                double num2 = Double.parseDouble(num2Str);

                // Perform the selected operation
                switch (operation) {
                    case "add":
                        result = num1 + num2;
                        break;
                    case "subtract":
                        result = num1 - num2;
                        break;
                    case "multiply":
                        result = num1 * num2;
                        break;
                    case "divide":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            out.println("<p style='color:red;'>Error: Division by zero is not allowed.</p>");
                        }
                        break;
                }
            } catch (NumberFormatException e) {
                out.println("<p style='color:red;'>Error: Invalid number format.</p>");
            }
        }

        // Display the result if available
        if (result != null) {
            out.println("<h3>Result: " + result + "</h3>");
        }
    %>
</body>
</html>
