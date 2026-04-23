package basics;

public class PositiveNegative {

	public static void main(String[] args) {
		int number = -71;
		
		if(number > 0) {
			System.out.println(number + " is positive.");
		}
		else if(number < 0) {
			System.out.println(number + " is negative.");
		}
		else {
			System.out.println("zero");
		}
	}

}
