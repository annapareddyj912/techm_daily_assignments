package com.example.sevlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the username and password from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Hardcoded credentials for validation
        if ("admin".equals(username) && "password".equals(password)) {
            // If login is successful, forward to the welcome JSP page
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
        } else {
            // If login fails, display an error message
            response.setContentType("text/html");
            response.getWriter().println("<html><body><h3>Invalid username or password. Please try again.</h3></body></html>");
            request.getRequestDispatcher("login.html").include(request, response);
        }
    }
}
