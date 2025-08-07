package JDBC;
import java.sql.*;
//import java.sql.Date;

public class PatientManagement {

	public static void main(String[] args) {
		 try {	          
	            Class.forName("com.mysql.cj.jdbc.Driver");
	           
	            Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/management", "root", "Siri@112002");
	            
	            /*Statement stmt=con.createStatement();
	            
	            String sql="CREATE TABLE IF NOT EXISTS patientsinfo("+"id INT PRIMARY KEY AUTO_INCREMENT,"
						+ "name VARCHAR(100),"+"age INT,"+"disease VARCHAR(100),"+"admission_date VARCHAR(100),"+"doctor VARCHAR(100))";
	            
	            stmt.executeUpdate(sql);
	            
	            System.out.println("Created Successfully");
	           */
	            String query = "INSERT INTO patientsinfo(name, age, disease, admission_date, doctor) VALUES (?, ?, ?, ?, ?)";
	            PreparedStatement pstmt = con.prepareStatement(query);
	            
	            String[][] patientsinfo = {
	                {"Siri", "23", "Fever", "2025-08-01", "Dr.Spandana"},
	                {"Karunya", "24", "Infection", "2025-08-02", "Dr.Mahesh"},
	                {"Kavya", "25", "Asthma", "2025-08-03", "Dr.Spandana"}
	            };	           
	            for (String[] p : patientsinfo) {
	                pstmt.setString(1, p[0]); 
	                pstmt.setInt(2, Integer.parseInt(p[1])); 
	                pstmt.setString(3, p[2]); 
	                pstmt.setString(4, p[3]); 
	                pstmt.setString(5, p[4]); 
	                pstmt.executeUpdate();
	            }	       
	            System.out.println("All patients registered successfully.");
	            
	            String sql="DELETE FROM patientsinfo WHERE name=?";	    		
	    		PreparedStatement pstmt1=con.prepareStatement(sql);	     
	    		pstmt1.setString(1, "Siri");
	    		System.out.println("Deleted");
	    		
	            con.close();
	        } 
		 	catch (Exception e) 
		 	{
		 		e.printStackTrace();
		 	}
	}
}

