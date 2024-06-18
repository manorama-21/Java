package com.jav;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/jsp");
		PrintWriter outPrintWriter = response.getWriter();
		
		String firstname = request.getParameter("firstName");
		String lastname = request.getParameter("lastName");
		String username = request.getParameter("userName");
		String contact = request.getParameter("contact");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adit-student", "root", "");
			
			PreparedStatement ps =conn.prepareStatement("insert into nsti values(?,?,?,?,?,?)");
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, username);
			ps.setString(4, contact);
			ps.setString(5, email);
			ps.setString(6, password);
			
			
			int i = ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Successfully Registered");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Some Error, Please Try Again");
		}
		System.out.close();
		
	}

}
