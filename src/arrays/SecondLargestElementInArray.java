package arrays;

import java.util.Scanner;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the Array elements:");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			
			else if(arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		
		if(secondLargest == Integer.MIN_VALUE) {
			System.out.println("There is no second largest element");
		}else {
			System.out.println("Largest: " + largest);
			System.out.println("Second largest: " + secondLargest);
		}
	}

}
