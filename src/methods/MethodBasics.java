package methods;

public class MethodBasics {
	// method without parameter and without return type
	static void showMessage() {
		System.out.println("Welcome to method practice.");
	}
	
	// method with parameter and without return type
	static void greet(String name) {
		System.out.println("Hello " + name);
	}
	
	// method with parameter and with return type
	static int square(int num) {
		return num * num;
	}
	
	public static void main(String[] args) {
		showMessage();
		greet("Sumanth");
		int result = square(3);
		System.out.println(result);
	}
}
