package com.example.flight;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BookingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String destination = request.getParameter("destination");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Booking Confirmed!</h2>");
        out.println("<p>Passenger Name: " + name + "</p>");
        out.println("<p>Destination: " + destination + "</p>");
    }
}
