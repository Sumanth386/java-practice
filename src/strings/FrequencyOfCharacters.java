package strings;

import java.util.Scanner;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		boolean[] visited = new boolean[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			
			// Skip already counted characters
			if(visited[i]) {
				continue;
			}
			
			int count = 1;
			
			for(int j = i + 1; j < str.length(); j++) {
				
				// Compare characters
				if(str.charAt(i) == str.charAt(j)) {
					count++;
					
					// Mark duplicate character as visited
					visited[j] = true;
				}
			}
			
			System.out.println(str.charAt(i) + " = " + count);
		}
		
		sc.close();
	}
}