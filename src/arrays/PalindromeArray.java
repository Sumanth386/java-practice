package arrays;

import java.util.Scanner;

public class PalindromeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
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
		
		int n = arr.length;
		int start = 0;
		int end = n - 1;
		
		boolean isPalindrome = true;
		while(start < end) {
			if(arr[start] != arr[end]) {
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}
		
		if(isPalindrome) {
			System.out.println("Palindrome Array");
		}else {
			System.out.println("Not a Palindrome Array");
		}
		
		sc.close();
	}

}
