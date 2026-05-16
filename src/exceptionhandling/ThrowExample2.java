package exceptionhandling;

public class ThrowExample2 {

	public static void main(String[] args) {
		try {
			int marks = 30;
			
			if(marks < 35) {
				throw new Exception("Failed");
			}
			
			System.out.println("Passed");
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
