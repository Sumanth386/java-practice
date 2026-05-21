package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchStudentData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3307/jdbc_learning?useSSL=false&serverTimezone=UTC";
			String userName = "root";
			String password = "Shivba@3";
			
			Connection connection = DriverManager.getConnection(url, userName, password);
			
			Statement statement = connection.createStatement();
			
			String query = "SELECT * FROM students";
			
			ResultSet resultSet = statement.executeQuery(query);
			
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				int marks = resultSet.getInt("marks");
				
				System.out.println(id + " " + name + " " + marks);
			}
			
			connection.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
