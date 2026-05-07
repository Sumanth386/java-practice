package arrays;

import java.util.Scanner;

public class CountingOccurences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the Array elements:");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the target element: ");
		int target = sc.nextInt();
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				count++;
			}
		}
		
		System.out.println(target + " appears " + count + " times");
		
		sc.close();
	}


}
