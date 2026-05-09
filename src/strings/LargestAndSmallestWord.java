package strings;

import java.util.Scanner;

public class LargestAndSmallestWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		String[] words = str.split(" ");
		
		String largest = words[0];
		String smallest = words[0];
		
		for(int i = 1; i < words.length; i++) {
			if(words[i].length() > largest.length()) {
				largest = words[i];
			}
			
			if(words[i].length() < smallest.length()) {
				smallest = words[i];
			}
		}
		
		System.out.println("Largest word: " + largest);
		System.out.println("Smallest words: " + smallest);
		
		sc.close();
	}

}
