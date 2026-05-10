package strings;

import java.util.Scanner;

public class CountingOccurencesOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		
		String[] words = str.split(" ");
		
		System.out.print("Enter a word to search: ");
		String target = sc.nextLine();
		
		int count = 0;
		
		for(int i = 0; i < words.length; i++) {
			if(words[i].equals(target)) {
				count++;
			}
		}
		
		System.out.println("Occurences = " + count);
		
		sc.close();
	}

}
