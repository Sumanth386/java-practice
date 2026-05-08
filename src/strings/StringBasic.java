package strings;

public class StringBasic {

	public static void main(String[] args) {
		String str = "Java";
		
		System.out.println("String = " + str);	// printing String
		
		System.out.println("Length of String: " + str.length()); // length of String
		
		System.out.println("First character of String: " + str.charAt(0)); // first character of String
		
		System.out.println("Last character of String: " + str.charAt(str.length() - 1)); // last character of String
		
		// printing all the characters of String
		System.out.println("String character: ");
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		
		// printing String in reverse
		System.out.print("\nPrinting String in reverse: ");
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
