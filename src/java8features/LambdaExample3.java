package java8features;

interface Multiplication{
	int multiply(int a, int b);
}

public class LambdaExample3 {

	public static void main(String[] args) {
		Multiplication m = (a, b)-> a * b;
		
		int result = m.multiply(8, 8);
		
		System.out.println(result);
	}

}
