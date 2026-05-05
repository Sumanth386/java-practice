package arrays;

public class LeftRotation {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.print("Original Array: ");
		print(arr);
		
		// store first element
		int first = arr[0];
		
		// shift left
		for(int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		
		// place first at last
		arr[arr.length - 1] = first;
		
		System.out.print("After left rotation by 1: ");
		print(arr);
	}
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
