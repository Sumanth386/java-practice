package methods;

import java.util.Scanner;

public class CountingDigits {

	static int countDigits(int number) {
		int count = 0;
		
		if(number == 0) {
			count = 1;
		}
		
		else {
			number = Math.abs(number);
			while(number != 0) {
				count++;
				number = number / 10;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		System.out.println("Digits = " + countDigits(number));
		
		sc.close();
	}

}
