package arrays;

import java.util.Scanner;

public class ReversingFirstHalfOfArray {

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
		
		System.out.print("Original Array: ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int n = arr.length;
		int mid = n / 2;
		for(int i = 0; i < mid / 2 ; i++) {
			int temp = arr[i];
			arr[i] = arr[mid - i - 1];
			arr[mid - i - 1] = temp;
		}
		
		System.out.print("Reversed Half Array: ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}

}
