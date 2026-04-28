package methods;

public class BankExample {
	
	static int getBalance() {
		return 5000;
	}
	
	static void showMessage(int balance) {
		System.out.println("Your balance is: " + balance);
	}
	
	public static void main(String[] args) {
		getBalance();
		showMessage(getBalance());
	}

}
