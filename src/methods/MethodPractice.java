package methods;

import java.util.Scanner;

public class MethodPractice {

	public static boolean isPrime(int number) {
		if(number <= 1) {
			return false;
		}
		
		for(int i = 2; i <= number - 1; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int countDigits(int number) {
		int temp = Math.abs(number);
		int count = 0;
		
		if(temp == 0) {
			return 1;
		}
		
		while(temp != 0) {
			count++;
			temp = temp / 10;
		}
		
		return count;
	}
	
	public static int reverseNumber(int number) {
		int sign = (number < 0 ? -1 : 1);
		int rev = 0;
		int temp = Math.abs(number);
		
		while(temp != 0) {
			int digit = temp % 10;
			rev = rev * 10 + digit;
			temp = temp / 10;
		}
		
		return rev * sign;
	}
	
	public static boolean isPalindrome(int number) {
		return reverseNumber(number) == number;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		System.out.println("Digits: " + countDigits(number));
		System.out.println("Reversed: " + reverseNumber(number));
		System.out.println("Palindrome: " + isPalindrome(number));
		System.out.println("Prime: " + isPrime(number));
		
		sc.close();
	}

}
