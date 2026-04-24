package loops;

public class CountingDigits {

	public static void main(String[] args) {
		int number = 693949;
		int temp = number;
		int digit = 0;
		
		while(temp != 0) {
			temp = temp / 10;
			digit++;
		}
		
		System.out.println("Number of digits in " + number + " is: " + digit);
	}

}
