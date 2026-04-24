package loops;

// check the divisibility from 2 to n - 1
public class PrimeNumber {

	public static void main(String[] args) {
		int number = 17;
		boolean isPrime = true;
		
		for(int i = 2; i < number; i++) {
			if(number % 2 == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(number < 1) {
			isPrime = false;
		}
		
		if(isPrime) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}

}
