package oops.abstraction;

abstract class Employee{
	
	abstract void work();
}

class Developer extends Employee{
	
	void work() {
		System.out.println("Developer writes code.");
	}
}

public class AbstractionExample2 {

	public static void main(String[] args) {
		Developer dev = new Developer();
		dev.work();
	}

}
