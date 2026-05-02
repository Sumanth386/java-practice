package methods;

import java.util.Scanner;

public class PalindromeNumber {

	public static int reverse(int number) {
		int temp = number;
		int rev = 0;
		
		while(temp != 0) {
			int digit = temp % 10;
			rev = rev * 10 + digit;
			temp = temp / 10;
		}
		
		return rev;
	}
	
	public static boolean isPalindrome(int number) {
		if(number < 0) {
			return false;
		}
		
		int reversed = reverse(number);
		return reversed == number;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		System.out.println("Palindrome = " + isPalindrome(number));
		
		sc.close();
	}

}
