package arrays;

import java.util.Scanner;

public class PrintOnlyEvenNumbers {

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
		
		System.out.print("Even elements: ");
		for (int num : arr) {
		    if (num % 2 == 0)
		        System.out.print(num + " ");
		}
		
		sc.close();
	}

}
