package loops;

import java.util.Scanner;

public class LargestDigitInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int max = 0;
		
		while(n != 0) {
			int digit = n % 10;
			
			if(digit > max) {
				max = digit;
			}
			
			n = n / 10;
		}
		
		System.out.println("Largest digit is: " + max);
		
		sc.close();
	}

}
