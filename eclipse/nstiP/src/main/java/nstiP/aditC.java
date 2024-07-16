package nstiP;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class aditC extends HttpServlet{
	public void service(HttpServletRequest req,  HttpServletResponse res) throws IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String location=req.getParameter("location");
		/* System.out.println(name); */
		
		PrintWriter pw=res.getWriter();
		pw.println(name + "registered");
		
		
	}

}
