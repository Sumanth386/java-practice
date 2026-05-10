package strings;

import java.util.Scanner;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		// to pick a character
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = 0;
			
			// to count the occurences
			for(int j = 0; j < str.length(); j++) {
				if(ch == str.charAt(j)) {
					count++;
				}
			}
			
			if(count > 1) {
				System.out.println("First repeated character: " + ch);
				break;
			}
		}
		
		sc.close();
	}

}
