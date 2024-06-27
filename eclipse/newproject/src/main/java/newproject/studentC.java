package newproject;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class studentC extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		String a = req.getParameter("name");
		String b = req.getParameter("mail");
		String c = req.getParameter("location");
		
		System.out.println(a + " - " + b + " - " + c);
	}
	

}
