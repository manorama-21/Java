package crudjsp;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class readC extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/nsti", "root", " ");
			String query ="select * from details";
			Statement st = conn.createStatement();
			ResultSet rs=st.executeQuery(query);
			
		pw.println("<table border='1px'><tr>th>Name</th><th>Email</th><th>Location</th></tr>");
			 
		while(rs.next()) {
				 String name=rs.getString(1);
				 String email=rs.getString(2);
				 String location=rs.getString(3);
				 
				 pw.println("<tr><td>"+name+"</td><td>"+ email+"</td><td>"+ location+"</td>");
				 pw.println("<td><a href ='crud?action=update&email="+email+"'> Update</a>| <a href ='crud?action=delete  &email="+email+"'>Delete</td></tr>");
				 
			 }
		pw.println("</table>");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
	}

}
