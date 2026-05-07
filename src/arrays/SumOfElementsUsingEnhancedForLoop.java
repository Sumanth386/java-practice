package arrays;

import java.util.Scanner;

public class SumOfElementsUsingEnhancedForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the Array elements:");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int num : arr) {
			sum += num;
		}
		
		System.out.println("Sum of elements: " + sum);
		
		sc.close();
	}

}
