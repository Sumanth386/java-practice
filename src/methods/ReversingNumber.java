package methods;

import java.util.Scanner;

public class ReversingNumber {

	static int reverseNumber(int n) {
		n = Math.abs(n);
		int sign = (n < 0) ? -1 : 1;
		
		int rev = 0;
		
		while(n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		
		System.out.println("Reversed number: " + reverseNumber(n));
		
		sc.close();
	}

}
