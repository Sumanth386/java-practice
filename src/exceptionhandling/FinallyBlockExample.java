package exceptionhandling;

public class FinallyBlockExample {

	static int test() {
		try {
			int result = 10 / 0;
			return result;
		}
		
		finally {
			System.out.println("finally block always executes");
		}
	}
	public static void main(String[] args) {
		test();
		
		System.out.println("Program continues...");
	}

}
