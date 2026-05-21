package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteStudentData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url ="jdbc:mysql://localhost:3307/jdbc_learning?useSSL=false&serverTimezone=UTC";
			String username = "root";
			String password = "Shivba@3";

			Connection connection = DriverManager.getConnection(url, username, password);
			
			String query = "DELETE FROM students WHERE id = ?";
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, 2);
			
			int rows = preparedStatement.executeUpdate();
			
			System.out.println(rows + " row deleted successfully");
			
			connection.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
