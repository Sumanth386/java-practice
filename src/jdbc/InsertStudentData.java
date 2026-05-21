package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudentData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3307/jdbc_learning?useSSL=false&serverTimezone=UTC";
			
			String username = "root";
			
			String password = "Shivba@3";
			
			Connection connection = DriverManager.getConnection(url, username, password);
			
			Statement statement = connection.createStatement();
			
			String query = "INSERT INTO students VALUES(1, 'Sumanth', 95)";
			
			int rows = statement.executeUpdate(query);
			
			System.out.println(rows + " row inserted successfully");
			
			connection.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
