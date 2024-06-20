package com.jav;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/jsp");
		PrintWriter outPrintWriter = response.getWriter();
		
		
		String email =request.getParameter("email");
		String password = request.getParameter("password");
	
		if(LoginPage.validate(email,password)) {
			RequestDispatcher rd = request.getRequestDispatcher("success");
			rd.include(request, response);
		}else {
			System.out.println("Try again. Please type valid emal or password");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
		
boolean status;
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adit-student", "root", "");
			
			PreparedStatement ps = conn.prepareStatement("select * from nsti where email = ? and password = ?");
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return;

	}

	}

}
