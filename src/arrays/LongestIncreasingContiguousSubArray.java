package arrays;

public class LongestIncreasingContiguousSubArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 2, 3, 4, 5};
		
		int currentLength = 1;
		int maxLength = 1;
		
		int endIndex = 0;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[i - 1]) {
				currentLength++;
			}
			else {
				currentLength = 1;
			}
			
			if(currentLength > maxLength) {
				maxLength = currentLength;
				endIndex = i; // update end position
			}
		}
		
		int startIndex = endIndex - maxLength + 1;
		
		System.out.println("Longest increasing subarray: ");
		
		for(int i = startIndex; i <= endIndex; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
