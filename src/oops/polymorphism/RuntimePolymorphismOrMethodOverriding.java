package oops.polymorphism;

class Person{
	
	void talks() {
		System.out.println("Person talks informally inside his house.");
	}
}

class Employee extends Person{
	
	@Override
	void talks() {
		System.out.println("Same person as an Employee will talk in a professional way at the office.");
	}
}

public class RuntimePolymorphismOrMethodOverriding {

	public static void main(String[] args) {
		Person p = new Employee();
		p.talks();
	}

}
