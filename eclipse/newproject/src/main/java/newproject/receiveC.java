package newproject;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class receiveC extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res){
		// TODO Auto-generated method stub
     PrintWriter pw=res.getWriter();
     
     
     pw.print("");
	}

}
