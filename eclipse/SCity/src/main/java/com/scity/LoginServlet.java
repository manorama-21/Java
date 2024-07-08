package com.scity;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // TO DO: Implement your login logic here
        // For example, you can query the database to check if the user exists
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scity", "root", "");
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                // User exists, create a session and redirect to the home page
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                response.sendRedirect("index.jsp");
            } else {
                // User does not exist, redirect back to the login page
                response.sendRedirect("login.jsp");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("invalid data");
        }
    }
}