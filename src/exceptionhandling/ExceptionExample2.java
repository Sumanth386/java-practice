package exceptionhandling;

public class ExceptionExample2 {

	public static void main(String[] args) {
		try {
			int num = 10 / 0;
		}
		
		catch(ArithmeticException e) {
			System.out.println("Message: " + e.getMessage());
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Finally block executed");
		}
	}

}
