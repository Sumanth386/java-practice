package exceptionhandling;
// Multiple catch blocks
public class ExceptionExample4 {

	public static void main(String[] args) {
		try {
			int[] arr = {10, 20, 30};
			
			int result = 10 / 0;
			
			System.out.println(arr[3]);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Array Index");
		}
		
		catch(Exception e) {
			System.out.println("General Exception");
		}
	}

}
