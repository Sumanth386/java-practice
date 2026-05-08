package strings;

import java.util.Scanner;

public class CountingUpperCaseAndLowerCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		int countLower = 0;
		int countUpper = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z') {
				countUpper++;
			}
			else if(ch >= 'a' && ch <= 'z') {
				countLower++;
			}
		}
		
		System.out.println("Number of lowercase letters in \"" + str + "\" = " + countLower);
		System.out.println("Number of uppercase letters in \"" + str + "\" = " + countUpper);
		
		sc.close();
	}

}
