package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateStudentData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url ="jdbc:mysql://localhost:3307/jdbc_learning?useSSL=false&serverTimezone=UTC";
			String username = "root";
			String password = "Shivba@3";

			Connection connection = DriverManager.getConnection(url, username, password);
			
			String query = "UPDATE students SET marks = ? WHERE id = ?";
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, 95);
			preparedStatement.setInt(2, 3);
			
			int rows = preparedStatement.executeUpdate();
			
			System.out.println(rows + " row updated successfully.");
			
			connection.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
