package arrays;

// pair of elements whose sum equals to target
public class PairOfElementsSum {

	public static void main(String[] args) {
		int[] arr = {1, 7, 11, 15, 2};
		int target = 9;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == target) {
					System.out.println(arr[i] + " + " + arr[j] + " = " + target);
				}
			}
		}
	}

}
