package demo.jav;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/jsp");

		PrintWriter out = response.getWriter();
		String firstname =request.getParameter("firstname");
		String lastname =request.getParameter("lastname");
		String username =request.getParameter("username");
		String email =request.getParameter("email");
		String password =request.getParameter("password");	
		String address =request.getParameter("address");	
		String contact =request.getParameter("contact");	

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","");
				PreparedStatement st = conn.prepareStatement("insert into details values(?,?,?,?,?,?,?)");
				st.setString(1, firstname);
				st.setString(2, lastname);
				st.setString(3, username);
				st.setString(4, email);
				st.setString(5, password);
				st.setString(6, address);
				st.setString(7, contact);
				st.executeUpdate();
				

					System.out.println("Successfully Registered");
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
				
			}
	}

}
