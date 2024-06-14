package com.jav;

import java.io.IOException;
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
	String email =request.getParameter("email");
	String password = request.getParameter("password");
	
	if(userDao.isValidUSer(email, password)) {
		HttpSession session =request.getSession();
		session.setAttribute("email", email);
		response.sendRedirect(" ");
		
	}else {
		response.sendRedirect("login.jsp");
		System.err.println(" Error");
	}
	}

}
