package JDBC;
import java.sql.*;
public class DBCreate 
{

	public static void main(String[] args) {
		try {
			//Load JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL", "root", "Siri@112002");
			
			//Statement stmt=con.createStatement();
			//String sql="CREATE TABLE IF NOT EXISTS patient("+"id INT PRIMARY KEY AUTO_INCREMENT,"
					//+ "name VARCHAR(100),"+"age INT,"+"disease VARCHAR(100))";
			
			
			//String sql="INSERT INTO patient(name, age, disease) VALUES(?, ?, ?)";
			
			String sql="UPDATE patient SET name=? WHERE name=?";
			//String sql="DELETE FROM patient WHERE name=?";

			PreparedStatement pstmt=con.prepareStatement(sql);
			
			//String[][] data=
				//{
						//{"Anshita", "22", "Fever"},
						//{"Sri Laxmi", "23", "Cold"},
						//{"Ashwarya", "22", "headche"},
						//{"Manjeera", "22", "Pain"}
				//};
					//for(String[] row : data)
				//{
					//pstmt.setString(1, "Renu");
					//pstmt.setString(2, "30");
					//pstmt.setString(3, "Cold");					
					//int rowsInserted=pstmt.executeUpdate();
					//if(rowsInserted>0)
					//{
					//int rows=pstmt.executeUpdate();
						//pstmt.setString(1, row[0]);
						//pstmt.setInt(2, Integer.parseInt(row[1]));
						//pstmt.setString(3, row[2]);
						pstmt.setString(1, "Sai Manjeera");
						pstmt.setString(2, "Manjeera");
						int rows=pstmt.executeUpdate();
						//pstmt.executeUpdate();
	
				System.out.println(" All patients inserted successfully");	
				con.close();
	    }
	catch (Exception e)
	{
	e.printStackTrace();
			
	}
}
}
			
