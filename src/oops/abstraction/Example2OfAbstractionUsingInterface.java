package oops.abstraction;

interface Payment{
	
	void pay();
}

class UPI implements Payment{
	
	public void pay() {
		System.out.println("Payment through UPI");
	}
}

class CreditCard implements Payment{
	
	public void pay() {
		System.out.println("Payment using credit card");
	}
}

public class Example2OfAbstractionUsingInterface {

	public static void main(String[] args) {
		UPI u1 = new UPI();
		CreditCard c1 = new CreditCard();
		
		u1.pay();
		c1.pay();
	}

}
