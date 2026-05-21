package jdbc.jdbcproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class StudentManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n===== Student Management System =====");
			
			System.out.println("1. Add Student");
			System.out.println("2. View Student");
			System.out.println("3. Update Student");
			System.out.println("4. Delete Student");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				addStudent(sc);
				break;
				
			case 2:
				viewStudents();
				break;
				
			case 3:
				updateStudent(sc);
				break;
				
			case 4:
				deleteStudent(sc);
				break;
				
			case 5:
				System.out.println("Exiting...");
				System.exit(0);
				
			default:
				System.out.println("Invalid choice");
			}
		}
	}
	
	// Add Student
	public static void addStudent(Scanner sc) {
		try {
			Connection connection = DBConnection.getConnection();
			
			String query = "INSERT INTO students VALUES(?,?,?)";
			
			PreparedStatement ps = connection.prepareStatement(query);
			
			System.out.println("Enter ID: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter Name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter Marks: ");
			int marks = sc.nextInt();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, marks);
			
			int rows = ps.executeUpdate();
			
			System.out.println(rows + " student added.");
			
			connection.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// View Students
	public static void viewStudents() {
		try{
			Connection connection = DBConnection.getConnection();
			
			String query = "SELECT * FROM students";
			
			PreparedStatement ps = connection.prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			
			System.out.println("\nID\tNAME\tMARKS");
			
			while(rs.next()) {
				System.out.println(
						rs.getInt("id") + "\t" +
						rs.getString("name") + "\t" + 
						rs.getInt("marks"));
			}
			
			connection.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void updateStudent(Scanner sc) {
		try {
			Connection connection = DBConnection.getConnection();
			
			String query = "UPDATE students SET marks = ? WHERE id = ?";
			
			PreparedStatement ps = connection.prepareStatement(query);
			
			System.out.println("Enter Student ID: ");
			int id = sc.nextInt();
			
			System.out.println("Enter new marks: ");
			int marks = sc.nextInt();
			
			ps.setInt(1, marks);
			ps.setInt(2, id);
			
			int rows = ps.executeUpdate();
			
			System.out.println(rows + " row updated successfully");
			
			connection.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// Delete Student
	public static void deleteStudent(Scanner sc) {
		try {
			Connection connection = DBConnection.getConnection();
			
			String query = "DELETE FROM students WHERE id = ?";
			
			PreparedStatement ps = connection.prepareStatement(query);
			
			System.out.println("Enter Student ID: ");
			int id = sc.nextInt();
			
			ps.setInt(1, id);
			
			int rows = ps.executeUpdate();
			
			System.out.println(rows + " student deleted.");
			
			connection.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
