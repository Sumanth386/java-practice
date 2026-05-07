package arrays;

import java.util.Scanner;

public class CountEvenAndOddEnhancedForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the Array elements:");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int countEven = 0;
		int countOdd = 0;
		
		for(int num : arr) {
			if(num % 2 == 0) {
				countEven++;
			}
			else {
				countOdd++;
			}
		}
		 
		System.out.println("Number of even elements: " + countEven);
		System.out.println("Number of odd elements: " + countOdd);
		
		sc.close();
	}

}
