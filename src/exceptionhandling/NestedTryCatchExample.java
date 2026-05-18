package exceptionhandling;

public class NestedTryCatchExample {

	public static void main(String[] args) {
		try {
			System.out.println("Out try block");
			
			try {
				int result = 10 / 0;
				System.out.println(result);
			}
			
			catch(ArithmeticException e) {
				System.out.println("Inner catch: cannot divide by zero");
			}
			
			int arr[] = {1, 2, 3};
			System.out.println(arr[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Outer catch: Invalid array index");
		}
		
		System.out.println("Program continues...");
		
	}

}
