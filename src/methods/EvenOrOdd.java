package methods;

public class EvenOrOdd {

	static void checkEvenOrOdd(int num) {
		if(num % 2 == 0) {
			System.out.println(num + " is even.");
		}
		else {
			System.out.println(num + " is odd.");
		}
	}
	
	public static void main(String[] args) {
		checkEvenOrOdd(38);
		checkEvenOrOdd(45);
	}

}
