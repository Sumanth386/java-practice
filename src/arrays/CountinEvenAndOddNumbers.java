package arrays;

import java.util.Scanner;

public class CountinEvenAndOddNumbers {

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
		
		int evenCount = 0;
		int oddCount = 0;

		String evenStr = "";
		String oddStr = "";

		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] % 2 == 0) {
		        evenCount++;
		        evenStr += arr[i] + " ";
		    } else {
		        oddCount++;
		        oddStr += arr[i] + " ";
		    }
		}

		System.out.println("Even elements: " + evenStr);
		System.out.println("Odd elements: " + oddStr);
		System.out.println("Even count: " + evenCount);
		System.out.println("Odd count: " + oddCount);
		
		sc.close();
	}

}
