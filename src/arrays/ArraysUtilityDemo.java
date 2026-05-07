package arrays;

import java.util.Arrays;

public class ArraysUtilityDemo {

	public static void main(String[] args) {
		int[] arr = {50, 10, 30, 20, 40};
		
		System.out.println("Original Array:");
		System.out.println(Arrays.toString(arr));
		
		// Sorting the Array
		Arrays.sort(arr);
		System.out.println("\nAfter sorting");
		System.out.println(Arrays.toString(arr));
		
		// Binary search (works on sorted Array)
		int index = Arrays.binarySearch(arr, 30);
		System.out.println("\nBinary search for 30:");
		System.out.println("Index = " + index);
		
		// Fill Array (overwrites all values)
		int[] filledArr = new int[5];
		Arrays.fill(filledArr, 3);
		
		System.out.println("\nAfter fill:");
		System.out.println(Arrays.toString(filledArr));
		
		// Compare Arrays
		int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {3, 2, 1};
        
        System.out.println("\nCompare Arrays:");
        System.out.println("arr1 == arr2 ? " + Arrays.equals(arr1, arr2));
        System.out.println("arr1 == arr3 ? " + Arrays.equals(arr1, arr3));
		
	}

}
