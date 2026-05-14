package oops.abstraction;

interface Vehicle{
	
	void start();
}

class Bike implements Vehicle{
	
	public void start() {
		System.out.println("Bike starts.");
	}
}

public class ExampleOfAbstractionUsingInterface {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.start();
	}

}
