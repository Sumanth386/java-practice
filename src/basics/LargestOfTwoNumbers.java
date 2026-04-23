package basics;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		int number1 = 45;
		int number2 = 45;
		
		if(number1 > number2) {
			System.out.println(number1 + " is larger than " + number2);
		}
		
		else if(number1 == number2) {
			System.out.println("Both numbers are same.");
		}
		
		else {
			System.out.println(number2 + " is larger than " + number1);
		}
	}

}
