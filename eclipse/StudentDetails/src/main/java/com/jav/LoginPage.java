package com.jav;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginPage {

	public static boolean validate(String email, String password) {
		// TODO Auto-generated method stub
		
		boolean status = false;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adit-student", "root", "");
			
			PreparedStatement ps = conn.prepareStatement("select * from nsti where email = ? and password = ?");
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return status;

	}

}
