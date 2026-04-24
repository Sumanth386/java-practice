package loops;
/* Instead of loop, mathematically:
   Sum = n * (n + 1) / 2 
*/
public class SumOfNumbers {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 20; i++) {
			sum += i;
		}
		
		System.out.println("Sum = " + sum);

	}

}
