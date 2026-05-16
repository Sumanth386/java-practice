package exceptionhandling;
// Exception Propagation - An exception moves from one method to another method until it is handled.

public class ExceptionPropagationExample1 {

	public static void divide() {
		int result = 10 / 0;
		System.out.println(result);
	}
	
	public static void calculate() {
		divide();
	}
	
	public static void main(String[] args) {
		try {
			calculate();
		}
		
		catch(ArithmeticException e) {
			System.out.println("Exception handled in the main method.");
		}
	}

}
