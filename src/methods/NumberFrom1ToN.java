package methods;

import java.util.Scanner;

public class NumberFrom1ToN {

	static void printNumbers(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		printNumbers(n);
		
		sc.close();
	}

}
