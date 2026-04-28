package bankapp;

public class BankAccount {
	String accountHolder;
	int balance;
	
	void deposit(int amount) {
		if(amount > 0) {
			balance = balance + amount;
		    System.out.println("Amount deposited: " + amount);
		    System.out.println("Updated balance: " + balance);
		}
		else {
			System.out.println("Invalid deposit amount");
		}
	}
	
	void withdraw(int amount) {
		if(amount > 0) {
			if(amount <= balance) {
				balance = balance - amount;
				System.out.println("Withdrawn: " + amount);
				System.out.println("Remaining amount: " + balance);
			}
			else {
				System.out.println("Insufficient balance");
			}
		}
		else {
			System.out.println("Invalid withdrawal amount");
		}
	}
	
	void checkBalance() {
		System.out.println("Current balance: " + balance);
	}
}
