package com.scity;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        // TO DO: Implement your registration logic here
        // For example, you can insert the user data into a database
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scity", "root", "");
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO users (username, password, email) VALUES (?, ?, ?)");
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, email);
            pstmt.executeUpdate();
            conn.close();
            response.sendRedirect("userlogin.jsp"); // Redirect to the login page
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("something wrong");
        }
    }
}
