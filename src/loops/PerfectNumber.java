package loops;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= number / 2; i++) {
			if(number % i == 0) {
				sum += i;
			}
		}
		
		if(sum == number) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not a perfect number");
		}
		
		sc.close();
	}

}
