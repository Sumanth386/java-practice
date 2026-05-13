package oops.encapsulation;

class BankAccount{
	private long accountNumber;
	private double balance;
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public void setBalance(double balance) {
		if(balance >= 0) {
			this.balance = balance;
		}
		
		else {
			System.out.println("Ivalid balance");
		}
	}
	
	public double getBalance() {
		return balance;
	}
}

public class BankAccountEncapsulation {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		
		ba.setAccountNumber(1234535);
		System.out.println(ba.getAccountNumber());
		
		ba.setBalance(8800000.050);
		System.out.println(ba.getBalance());
	}

}
