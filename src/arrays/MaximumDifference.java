package arrays;

public class MaximumDifference {

	public static void main(String[] args) {
		int[] arr = {2, 3, 10, 6, 4, 8, 1};
		
		int minSoFar = arr[0];
		int maxDiff = 0;
		
		for(int i = 1; i < arr.length; i++) {
			int diff = arr[i] - minSoFar;
			
			if(diff > maxDiff) {
				maxDiff = diff;
			}
			
			if(arr[i] < minSoFar) {
				minSoFar = arr[i];
			}
		}
		
		System.out.println("Maximum difference: " + maxDiff);
	}

}
