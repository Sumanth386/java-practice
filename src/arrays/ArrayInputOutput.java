package arrays;

import java.util.Scanner;

public class ArrayInputOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		if(size <= 0) {
			System.out.println("Invalid size");
			return;
		}
		
		int[] arr = new int[size];
		
		// Input
		System.out.println("Enter array elements:");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// Output
		System.out.println("Array elements are:");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// Sum
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("Sum = " +sum);
		
		// Maximum
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("Largest = " + max);

		// Minimum
		int min = arr[0];
				
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
				
		System.out.println("Smallest = " + min);
				
		sc.close();
	}

}
