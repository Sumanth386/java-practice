package java8features;

interface EvenCheck{
	boolean isEven(int number);
}

public class LambdaExample4 {

	public static void main(String[] args) {
		EvenCheck e1 = (number)-> {
			return number % 2 == 0;
		};
		
		System.out.println(e1.isEven(71));
	}

}
