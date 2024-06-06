package jav;
import java.sql.*;


public class conn {
	public static void main(String[] args) throws ClassNotFoundException{
		 Class.forName("com.mysql.cj.jdbc.Driver");

		 try {
			DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("connected successfully");
	 }
}
