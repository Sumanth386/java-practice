package strings;

import java.util.HashSet;
import java.util.Scanner;

// input: abcabcbb  	output: longest length: 3
public class LongestSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		HashSet<Character> set = new HashSet<>();
		
		int maxLength = 0;
		int left = 0;
		
		for(int right = 0; right < str.length(); right++) {
			while(set.contains(str.charAt(right))) {
				set.remove(str.charAt(left));
				left++;
			}
			
			set.add(str.charAt(right));
			
			maxLength = Math.max(maxLength, right - left + 1);
		}
		
		System.out.println("Longest length: " + maxLength);
		
		sc.close();
	}

}
