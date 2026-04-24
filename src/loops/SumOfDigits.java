package loops;

public class SumOfDigits {

	public static void main(String[] args) {
		int number = 343212;
		int temp = number;
		int sum = 0;
		
		while(temp != 0) {
			int digit = temp % 10;
			sum += digit;
			temp = temp / 10;
		}
		
		System.out.println("Sum of digits of " + number + ": " + sum);
	}

}
