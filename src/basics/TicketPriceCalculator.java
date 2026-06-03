package basics;

import java.util.Scanner;

public class TicketPriceCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		if(age <= 12) {
			System.out.println("Please pay 100");
		}
		
		else if(age <= 17) {
			System.out.println("Please pay 150");
		}
		
		else if(age <= 60) {
			System.out.println("Please pay 200");
		}
		
		else {
			System.out.println("Please pay 100.");
		}
		
		sc.close();
	}

}
