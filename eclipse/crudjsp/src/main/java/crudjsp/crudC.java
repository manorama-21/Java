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
import jakarta.servlet.jsp.JspWriter;

@WebServlet("/crud")
public class crudC extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		String action= req.getParameter("action");
		String email= req.getParameter("email");
		
		if(action.equals("update")) {
			pw.println("updated");
		}else {
			//pw.println("deleted");
			deleteData(res,email);
		}
		
		
}

	private void deleteData(HttpServletResponse res, String email) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/nsti", "root", " ");
			
			String query="delete from details where email =?";
			PreparedStatement st= conn.prepareStatement(query);
			st.setString(1, email);
			int deleted=st.executeUpdate();
			if (deleted>0) {
				pw.println("deleted successfully");
			}else {
				pw.print("not deleted");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
