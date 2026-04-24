package loops;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number = 121;
		int temp = number;
		int reverse = 0;
		
		while(temp != 0) {
			int digit = temp % 10;
			reverse = reverse * 10 + digit; 
			temp = temp / 10;
		}
		
		if(reverse == number) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not a palindrome number.");
		}
	}

}
