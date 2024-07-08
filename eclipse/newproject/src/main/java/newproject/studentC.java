package newproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class studentC extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		 String a = req.getParameter("name"); 
			/*
			 * String b = req.getParameter("mail"); String c = req.getParameter("location");
			 */
		 double mark1 = Integer.parseInt(req.getParameter("m1"));
		 double mark2 = Integer.parseInt(req.getParameter("m2"));
		 double total =(mark1+mark2)/2;
		
		 PrintWriter pw = res.getWriter();
		pw.println("Welcome to my Application: " + " "+ a + " " + b + " " + c);
		pw.println("Percentage : " + total + "%");
	}

}
