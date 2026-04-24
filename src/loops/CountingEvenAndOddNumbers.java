package loops;

public class CountingEvenAndOddNumbers {

	public static void main(String[] args) {
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i = 1; i <= 50; i++) {
			if(i % 2 == 0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		
		System.out.println("Total number of even numbers: " + evenCount);
		System.out.println("Total number of odd numbers: " + oddCount);
	}

}
