package strings;

import java.util.Scanner;

public class ToggleCaseProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z') {
				ch = (char)(ch + 32); 		// A + 32 = 65 + 32 = 97 -> 'a' 
				System.out.print(ch);
			}
			
			else if(ch >= 'a' && ch <= 'z') {
				ch = (char)(ch - 32);		// a - 32 = 97 - 32 = 65 -> 'A'
				System.out.print(ch);
			}
		}
		
		sc.close();
	}


}
