package arrays;

public class RightRotation {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5,};
		
		System.out.print("Original Array: ");
		print(arr);
		
		// Store last element
		int last = arr[arr.length - 1];
		
		// shift elements right
		for(int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		
		// place last element at first
		arr[0] = last;
		
		System.out.print("After Right rotation by 1: ");
		print(arr);
	}
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
