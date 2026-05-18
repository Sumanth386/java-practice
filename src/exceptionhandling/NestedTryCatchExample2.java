package exceptionhandling;

public class NestedTryCatchExample2 {

	public static void main(String[] args) {
		try {
			System.out.println("Outer try");
			
			try {
				int result = 30 / 0;
				System.out.println(result);
			}
			
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			
			finally {
				System.out.println("Inner finally block");
			}
			
			int arr[] = { 10, 20, 30 };
			System.out.println(arr[8]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Outer finally block");
		}
	}

}
