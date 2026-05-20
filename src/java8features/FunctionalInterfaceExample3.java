package java8features;

@FunctionalInterface
interface Multiplications{
	int multiply(int a, int b);
}

public class FunctionalInterfaceExample3 {

	public static void main(String[] args) {
		Multiplications m = (a, b)-> {
			return a * b;
		};
		
		System.out.println("Result: " + m.multiply(5, 4));
	}

}
