package strings;

import java.util.Scanner;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		str = str.trim();  // removes leading and trailing spaces 
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == ' ') {
				count++;
			}
		}
		
		int words = count + 1;
		
		System.out.println("Number of words in " + str + " = " + words);
		
		sc.close();
	}

}
