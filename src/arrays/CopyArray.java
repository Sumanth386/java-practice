package arrays;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array:");
		int size = sc.nextInt();
		
		if(size <= 0) {
			System.out.println("Invalid size");
			return;
		}
		
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		
		// Input
		System.out.println("Enter the Array elements:");
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		// Copy
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		// Output Array1
		System.out.print("Original Array: ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}		
		System.out.println();
		
		// Output Array2
		System.out.print("Copied Array: ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		arr1[0] = 999;
		
		System.out.println();
		System.out.print("Array1 after modifying: ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		System.out.print("Array2 remains same: ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		sc.close();
	}

}
