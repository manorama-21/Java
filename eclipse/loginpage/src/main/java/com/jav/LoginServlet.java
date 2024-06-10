package com.jav;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served At: ").append(request.getContextPath());

		
	}
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	response.setContentType("text/jsp");

	PrintWriter out = response.getWriter();
	String username =request.getParameter("username");
	String email =request.getParameter("email");
	String password =request.getParameter("password");	

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","");
			PreparedStatement st = conn.prepareStatement("insert into nsti values(?,?,?)");
			st.setString(1, username);
			st.setString(2, email);
			st.setString(3, password);
			st.executeUpdate();
			

				System.out.println("Successfully Login");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
	}

}
