package methods;

import java.util.Scanner;

public class AutomorphicNumber {
	
	public static int countDigits(int number) {
		int temp = number;
		int count = 0;
		
		while(temp != 0) {
			int digit = temp % 10;
			count++;
			temp = temp / 10;
		}
		
		return count;
	}
	
	public static boolean isAutomorphic(int num) {
		int square = num * num;
		int digits = countDigits(num);
		
		int power = 1;
		for(int i = 1; i <= digits; i++) {
			power = power * 10;
		}
		
		return square % power == num;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		System.out.println(isAutomorphic(number));
		
		sc.close();
	}

}
