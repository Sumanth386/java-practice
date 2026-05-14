package oops.association;

// child object cannot exist without parent object(strong relationship)

class Engine{
	
	void start() {
		System.out.println("Engine starts");
	}
}

class Bike{
	
	private Engine engine;
	
	Bike(){
		engine = new Engine();
	}
	
	void startBike() {
		engine.start();
		System.out.println("Bike starts");
	}
}

public class CompositionExample {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.startBike();
	}

}
