package java8features;

@FunctionalInterface
interface EvenOrOddCheck{
	boolean even(int number);
}

public class FunctionalInterfaceForEvenOrOdd {

	public static void main(String[] args) {
		EvenOrOddCheck eo = (number)-> number % 2 == 0;
		
		int num = 34;
		
		if(eo.even(num) == true) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}
