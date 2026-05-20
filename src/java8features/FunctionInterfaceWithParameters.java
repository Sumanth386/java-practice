package java8features;

@FunctionalInterface
interface Subtraction{
	int sub(int a, int b);
}

public class FunctionInterfaceWithParameters {

	public static void main(String[] args) {
		Subtraction s = (a, b)-> {
			return a - b;
		};
		
		System.out.println(s.sub(30, 8));
	}

}
