package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementInsert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url ="jdbc:mysql://localhost:3307/jdbc_learning?useSSL=false&serverTimezone=UTC";
			String username = "root";
			String password = "Shivba@3";

			Connection connection = DriverManager.getConnection(url, username, password);
			
			String query = "INSERT INTO students VALUES(?,?,?)";
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, 3);
			preparedStatement.setString(2, "Ananth");
			preparedStatement.setInt(3, 90);
			
			int rows = preparedStatement.executeUpdate();
			
			System.out.println(rows + " row inserted successfully");
			
			connection.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
