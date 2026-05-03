package arrays;

import java.util.Scanner;

public class ReversingArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array: ");
		int size = sc.nextInt();
		
		if(size <= 0) {
			System.out.println("Invalid size");
			return;
		}
		
		int[] arr = new int[size];
		System.out.println("Enter the Array elements:");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// Printing Array elements in reverse
		System.out.print("Reversed Array elements: ");
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}

}
