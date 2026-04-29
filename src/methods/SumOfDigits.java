package methods;

import java.util.Scanner;

public class SumOfDigits {
	
	static int sumOfDigits(int n){
		n = Math.abs(n);
		
		int sum = 0;
		
		while(n > 0) {
			int digit = n % 10;
			sum += digit;
			n = n / 10;
		}
		
		return sum;
	}
	
	static int countDigits(int n) {
		n = Math.abs(n);
		if(n == 0) {
			return 1;
		}
		
		int count = 0;
		
		while(n > 0) {
			count++;
			n = n / 10;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find the sum of its digits: ");
		int n = sc.nextInt();
		
		System.out.println("Sum of digits: " + sumOfDigits(n));
		System.out.println("Number of digits: " + countDigits(n));
		
		sc.close();
	}

}
