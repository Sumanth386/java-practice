package methods;

import java.util.Scanner;

public class StrongNumber {

	public static int factorial(int number) {
		int fact = 1;
		
		for(int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		
		return fact;
	}
	
	public static void printDigits(int number) {
		int temp = number;
		int digit = 0;
		
		while(temp != 0) {
			digit = temp % 10;
			System.out.println(digit);
			temp = temp / 10;
		}
	}
	
	public static boolean isStrong(int number) {
		int temp = number;
		int sum = 0;
		
		while(temp != 0) {
			int digit = temp % 10;
			sum = sum + factorial(digit);
			temp = temp / 10;
		}
		
		return sum == number;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		
		System.out.println(isStrong(number));
		
		sc.close();
	}

}
