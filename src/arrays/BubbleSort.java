package arrays;
// bubble sort using pushing the largest element to the end
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {4, 1, 7, 9, 3};
		System.out.print("Array after sorting: ");
		print(arr);
		
		int n = arr.length;
		boolean swapped;
		
		for(int i = 0; i < n - 1; i++) {
			swapped = false;

			for(int j = 0; j < n - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					
					swapped = true;
				}
			}
			
			if(!swapped) {
				break; // already sorted
			}
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
