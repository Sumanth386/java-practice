package oops.polymorphism;

interface Payment{
	
	void pay();
}

class UPI implements Payment{
	
	public void pay() {
		System.out.println("UPI Payment.");
	}
}

class CreditCard implements Payment{
	
	public void pay() {
		System.out.println("Credit card payment.");
	}
}

public class RuntimePolymorphismUsingInterface {

	public static void main(String[] args) {
		Payment p;
		
		p = new UPI();
		p.pay();
		
		p = new CreditCard();
		p.pay();
	}

}
