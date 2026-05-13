package oops.encapsulation;

class Account{
	private long accountNumber;
	private String accountHolderName;
	private double balance;
	
	// Constructor
	Account(long accountNumber, String accountHolderName, double balance){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		
		if(balance >= 0) {
			this.balance = balance;
		}
		
		else {
			this.balance = 0;
			System.out.println("Invalid initial balance, balance set to 0.");
		}
	}
	
	// getter methods
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	// Deposit method
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			
			System.out.println(amount + " deposited successfully.");
			System.out.println("Available balance: " + balance);
		}
		
		else {
			System.out.println("Invalid deposit amount.");
		}
	}
	
	// Withdraw method
	public void withdraw(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid withdraw amount");
		}
		
		else if(amount > balance) {
			System.out.println("Insufficient balance");
		}
		
		else {
			balance -= amount;
			
			System.out.println(amount + " withdrawn successfully.");
			System.out.println("Available balance: " + balance);
		}
	}
	
	// display Account details
	public void displayAccountDetails() {
		System.out.println("\n------- Account Details -------");
		
		System.out.println("Account number : " + accountNumber);
		System.out.println("Account holder : " + accountHolderName);
		System.out.println("Balance        : " + balance);
	}
}

public class ATMExample {

	public static void main(String[] args) {
		Account user1 = new Account(12345678901L, "Sumanth", 5000);
		
		user1.displayAccountDetails();
		
		System.out.println();
		
		user1.deposit(2000);
		
		System.out.println();
		
		user1.withdraw(3000);
		
		System.out.println();
		
		user1.withdraw(10000);
		
		System.out.println();
		
		user1.deposit(-1000);
		
		System.out.println();
		
		user1.displayAccountDetails();
	}

}
