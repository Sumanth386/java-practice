package basics;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int number1 = 18;
		int number2 = 180;
		int number3 = 10;
		
		if(number1 >= number2 && number1 >= number3) {
			System.out.println(number1 + " is largest");
		}
		else if(number2 >= number1 && number2 >= number3) {
			System.out.println(number2 + " is largest");
		}
		else {
			System.out.println(number3 + " is largest");
		}
	}

}
