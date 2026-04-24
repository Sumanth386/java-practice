package loops;

public class ReversingNumber {

	public static void main(String[] args) {
		int number = 1234;
		int reverse = 0;
		
		while(number != 0) {
			int digit = number % 10;				// last digit
			number = number / 10;					// remove digit
			reverse = reverse * 10 + digit;
		}
		
		System.out.println("Reversed number: " + reverse);
	}

}
