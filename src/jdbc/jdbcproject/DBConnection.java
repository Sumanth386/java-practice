package jdbc.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getConnection(){
		Connection connection = null;
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3307/studentdatabase?useSSL=false&serverTimezone=UTC";
			String userName = "root";
			String password = "Shivba@3";
			
			connection = DriverManager.getConnection(url, userName, password);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}

}
