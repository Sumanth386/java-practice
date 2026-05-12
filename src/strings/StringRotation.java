package strings;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first String: ");
		String str1 = sc.nextLine();
		
		System.out.print("Enter the second String: ");
		String str2 = sc.nextLine();
		
		if(str1.length() == str2.length() && (str1 + str2).contains(str2)) {
			System.out.println("Rotation of each other");
		}
		
		else {
			System.out.println("Not rotation");
		}
		
		sc.close();
	}

}
