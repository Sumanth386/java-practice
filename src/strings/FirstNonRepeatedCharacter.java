package strings;

import java.util.Scanner;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = 0;
			
			for(int j = 0; j < str.length(); j++) {
				if(ch == str.charAt(j)) {
					count++;
				}
			}
			
			if(count == 1) {
				System.out.println("First non-repeated character: " + ch);
				break;
			}
		}
		
		sc.close();
	}

}
