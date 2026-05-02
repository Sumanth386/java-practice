package methods;

import java.util.Scanner;

public class PerfectNumber {

	public static boolean isPerfect(int number) {
		int sum = 0;
		
		if(number <= 1){
			return false;
		}
		
		for(int i = 1; i <= number / 2; i++) {
			if(number % i == 0) {
				sum = sum + i;
			}
		}
		
		return sum == number;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();

		System.out.println(isPerfect(number));
		
		sc.close();
	}

}
