package crudjsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class deleteC extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		/* pw.println("deleted"); */
		String email=req.getParameter("email");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/nsti", "root", " ");
			String query ="delete from details where email = ?";
			PreparedStatement st=conn.prepareStatement(query);
			st.setString(1, email);
			int deleted=st.executeUpdate(query);
			if(deleted>0) {
				pw.println("deleted");
				
			}else {pw.print("not deleted");
			
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}