package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {4, 1, 7, 9, 3};
		System.out.print("Array before sorting: ");
		print(arr);
		
		int n = arr.length;
		
		for(int i = 0; i < n - 1; i++) {
			int minIndex = i;
			
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		System.out.print("Array after sorting: ");
		print(arr);
	}

	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
