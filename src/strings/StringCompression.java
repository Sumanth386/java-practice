package strings;

import java.util.Scanner;

public class StringCompression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = 1;
			
			// current character equals next character continue counting
			while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}
			
			System.out.print(ch);
			System.out.print(count);
		}
		
		sc.close();
	}
}
