package arrays;

public class RightRotateByK {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		System.out.print("Original Array: ");
		print(arr);
		
		int k = 2;
		k = k % arr.length;
		
		for(int i = 0; i < k; i++) {
			rightRotateByOne(arr);
		}
		
		System.out.print("Array after right rotation by " + k + ": ");
		print(arr);
	}
	
	public static void rightRotateByOne(int[] arr) {
		int last = arr[arr.length - 1];
		
		for(int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		
		arr[0] = last;
	}
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
