package loops;

import java.util.Scanner;

public class SmallestDigitInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int min = 9;
		
		while(n != 0) {
			int digit = n % 10;
			
			if(digit < min) {
				min = digit;
			}
			
			n = n / 10;
		}
		
		System.out.println("Smallest digit is: " + min);
		
		sc.close();
	}

}
