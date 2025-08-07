package JDBC;
import java.sql.*;


public class DBConnect {

	public static void main(String[] args) {
		try {
			//Load JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/siri", "root", "Siri@112002");
			
			System.out.println("Connected Successsfully");
			con.close();
		 }
		catch (Exception e)
		{
		e.printStackTrace();
				
		// TODO Auto-generated method stub
		}
	}
}
