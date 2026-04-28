package methods;

public class SimpleCalculator {
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static int subtract(int a, int b) {
		return a - b;
	}
	
	static int multiply(int a, int b) {
		return a * b;
	}
	
	static int divide(int a, int b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10, 3));
		System.out.println(subtract(34, 8));
		System.out.println(multiply(8, 8));
		System.out.println(divide(49,7));
	}

}
