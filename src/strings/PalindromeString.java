package strings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		
		String rev = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			rev += ch;
		}
		
		if(str.equals(rev)) {
			System.out.println("It's a String Palindrome");
		}else {
			System.out.println("It's not a String Palindrome");
		}
		
		sc.close();
	}

}
