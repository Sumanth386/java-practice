package basics;

public class NumberCheck {

	public static void main(String[] args) {
		int number = -12;
		
		if(number > 0) {
			System.out.println(number + " is positive");
		}
		
		else if(number < 0) {
			System.out.println(number + " is negative");
		}
		
		else {
			System.out.println("Zero");
		}

		if(number % 2 == 0) {
			System.out.println(number + " is even");
		}
		else {
			System.out.println(number + " is odd");
		}
	}

}
