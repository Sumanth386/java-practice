package arrays;

import java.util.Scanner;

public class AverageOfArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array:");
		int size = sc.nextInt();
		
		if(size <= 0) {
			System.out.println("Invalid size");
			return;
		}
		
		int[] arr = new int[size];
		
		System.out.println("Enter the Array elements: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		double avg = (double)sum / arr.length; 
				
		System.out.println("Average of Array elements: " + avg);
		
		sc.close();
	}

}
