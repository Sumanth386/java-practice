package methods;

import java.util.Scanner;

public class SumUpToN {

	static int sum(int n) {
		/*int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		return sum;*/
		
		return n * (n + 1) / 2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		System.out.println("Sum = " + sum(number));
		
		sc.close();
	}

}
