package exceptionhandling;

public class ATM {

	static void withdraw(long balance, long amount) throws InsufficientBalanceException, MinimumBalanceException{
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance");
		}
		
		long remainingBalance = balance - amount;
		
		if(remainingBalance < 1000) {
			throw new MinimumBalanceException("Minimum balance should be 1000");
		}
		
		System.out.println("Withdrawal successful");
		System.out.println("Remaining balance: " + (balance - amount));
		System.out.println("Transaction completed");
	}
	
	public static void main(String[] args) {
		long balance = 100;
		long amount = 5000;
		
		try {
			withdraw(balance, amount);
		}
		
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		
		catch(MinimumBalanceException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program continues...");
	}

}
