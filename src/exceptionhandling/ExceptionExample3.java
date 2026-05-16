package exceptionhandling;

public class ExceptionExample3 {

	public static void main(String[] args) {
		try {
			int[] arr = {10, 20, 30};
			System.out.println(arr[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Array Index");
		}
	}

}
