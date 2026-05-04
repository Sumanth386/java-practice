package arrays;

import java.util.Scanner;

public class ReversingAnyPartOfArray {

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
		
		System.out.print("Enter the Starting point to reverse from: ");
		int start = sc.nextInt();
		System.out.print("Enter the end point till where to reverse: ");
		int end = sc.nextInt();
		
		if(start < 0 || end >= arr.length || start > end) {
			System.out.println("Invalid range");
			return;
		}
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		
		System.out.println();
		System.out.print("Array after reversing elements: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}

}
