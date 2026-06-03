package basics;

import java.util.Scanner;

public class LoginSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username: ");
		String username = sc.nextLine();
		
		System.out.println("Enter password: ");
		String password = sc.nextLine();
		
		if(username.equals("sumanth")) {
			if(password.equals("java123")) {
				System.out.println("Login successfull.");
			}
			else {
				System.out.println("Wrong password!");
			}
		}
		
		else {
			System.out.println("User not found.");
		}
		
		sc.close();
	}

}
