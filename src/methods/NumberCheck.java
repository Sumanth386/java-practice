package methods;

public class NumberCheck {

	static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	static void showResult(int number) {
		if(isEven(number) == true) {
			System.out.println(number + " is Even");
		}
		else {
			System.out.println(number + " is Odd");
		}
	}
	
	public static void main(String[] args) {
		showResult(57);
	}

}
