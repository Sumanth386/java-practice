package loops;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 2; i <= 20; i += 2) {
			sum += i;
		}
		
		System.out.println("Sum of Even numbers from between 1 to 20 is: " + sum);
	}

}
