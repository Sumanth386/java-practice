package strings;

import java.util.Scanner;

public class CountingDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch >= '0' && ch <= '9') {
				count++;
			}
		}
		
		System.out.println("Number of digits in \"" + str + "\" = " + count);
		
		sc.close();
	}

}
