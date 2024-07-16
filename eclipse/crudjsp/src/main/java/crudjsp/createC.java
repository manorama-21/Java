package crudjsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class createC extends HttpServlet{
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/nsti", "root", "");
			String name=req.getParameter("name");
			String email=req.getParameter("email");
			String location=req.getParameter("location");
			
		String query = "insert into details values(?, ?, ?)";
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, location);
		
		int inserted = ps.executeUpdate();
		if(inserted>0) {
			pw.println("inserted");
		}else {
			pw.println("Not inserted");
		}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}

	

}
