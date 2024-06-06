
import java.sql.*;
public class conn {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 
		 //---------------mysql database connection------------//
//		 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost","root","");
//		 System.out.println("Connected Established: " + conn);
		 
		 
		 
		
		 //-----------------show databases---------------------//
		 
//		 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost","root","");
//		 Statement st = conn.createStatement();
//		 ResultSet rs = st.executeQuery("show databases");
//		 System.out.println("Databases are: " + rs);
//		 while(rs.next()) {
//			 System.out.println(rs.getString(1));
//		 }

		 
		
		//---------------create new database------------------//
		 
//		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost","root","");
//		System.out.println("successfuly connected" + conn);
//		Statement st = conn.createStatement();
//		st.executeUpdate("Create database aditttt");
//		
//		System.out.println("Database created");
		 
		 
		 
	
		//------------------create table----------------------//
		 
//		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/aditttt","root","");
//		String sql ="create table nsti(id int,name varchar(30),address varchar(50),mail varchar(45)primary key)";
//		Statement st = conn.createStatement();
//		st.executeUpdate(sql);
//		System.out.println("Table created");
		 
		 
		 
		
		
		//----------------------insert data--------------------//
		 
//		 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/aditttt","root","");
//		 String query ="insert into nsti values(03,'Trapti','Etawah','trapti@abc.com')";
//		 Statement st = conn.createStatement();
//		 st.executeUpdate(query);
//		 System.out.println("Data inserted");
		 
		 
		 
		 
		 
		 
		//----------------------insert multi  data---------------//
		 
//		 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/aditttt","root","");
//		 String query ="insert into nsti values (05,'Sakshi','Allapur','sak@abc.com'),(06,'Anjali','Mudera','anajli@abc.com')";
//		 Statement st = conn.createStatement();
//		 st.executeUpdate(query);
//		 System.out.println("Data inserted");
		 
		 
		 
		 
		 
		 //--------------------show details--------------------//
		 
//		 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/aditttt","root","");
//		 String query ="select * from nsti";
//		 Statement st = conn.createStatement();
//		 ResultSet res = st.executeQuery(query);
//		 
//		 while(res.next()) {
//			 System.out.println(res.getString("id") + "-" + res.getString("name") + "-" + res.getString("address") + "-" + res.getString("mail"));
//		 }
		 
		 
		 
		 
		 //----------------------show select data detail---------//
		 
//		 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/aditttt","root","");
//		 String query ="select * from nsti where id = '3'";
//		 Statement st = conn.createStatement();
//		 ResultSet res = st.executeQuery(query);
//		 
//		 while(res.next()) {
//			 System.out.println(res.getString("id") + "-" + res.getString("name") + "-" + res.getString("address") + "-" + res.getString("mail"));
//		 }
		 
		 
		 
		 
		 //--------------------data update-------------------------//
		 
//		 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/aditttt","root","");
//		 String query ="update nsti set name = 'Kuku' where name = 'Peehu'"; 
//		 Statement st = conn.createStatement();
//		 st.executeUpdate(query);
//		 System.out.println("Data Updated");
		 
		 
		
		 
		 //--------------------delete data through id-------------//
		 
//		 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/aditttt","root","");
//		 String query ="Delete from nsti where id = '4' " ;
//		 Statement st = conn.createStatement();
//		 st.executeUpdate(query);
//		 System.out.println("Data deleted");
		 
		 
		 
		 
		 //--------------------delete table----------------------//
		 
//		 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/aditttt","root","");
//		 String query ="Drop Table student " ;
//		 Statement st = conn.createStatement();
//		 st.executeUpdate(query);
//		 System.out.println("Table Deleted");
		 
		 
		 
		 
		 //------------------add new column----------------------//
		 
//		 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/aditttt","root","");
//		 String query ="Alter table nsti add column age int" ;
//		 Statement st = conn.createStatement();
//		 st.executeUpdate(query);
//		 System.out.println("New column added");
		 
		 
		 //------------------delete column-----------------------//
		 
		 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/aditttt","root","");
		 String query ="Alter table nsti drop age" ;
		 Statement st = conn.createStatement();
		 st.executeUpdate(query);
		 System.out.println("Column deleted");
		 
		
	}

}
