package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectionDemo {

	public static void main(String[] args) {
		try {
			// Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Database URL
			String url = "jdbc:mysql://localhost:3307/jdbc_learning?useSSL=false&serverTimezone=UTC";
			
			// Username
			String username = "root";
			
			// Password
			String password = "Shivba@3";
			
			// Create Connection
			Connection connection = DriverManager.getConnection(url, username, password);
			
			System.out.println("Connection successful");
			
			// Close Connection
			connection.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
