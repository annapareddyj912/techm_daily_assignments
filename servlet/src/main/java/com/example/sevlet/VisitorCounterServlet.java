package com.example.sevlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/counter")
public class VisitorCounterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Static variable to hold the visitor count
    private static int visitorCount = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Increment the visitor count
        visitorCount++;

        // Set the visitor count as a request attribute
        request.setAttribute("visitorCount", visitorCount);

        // Forward the request to the JSP page
        request.getRequestDispatcher("counter.jsp").forward(request, response);
    }
}
