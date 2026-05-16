package exceptionhandling;
// Custom Exception 
public class ThrowExample3 {

	public static void main(String[] args) {
		try {
			long balance = 100;
			
			if(balance < 1000) {
				throw new InsufficientBalanceException("Insufficient balance");
			}
			
			System.out.println("Balance: " + balance);
		}
		
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}
