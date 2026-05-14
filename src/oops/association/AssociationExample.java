package oops.association;
/* Association means, "one object is connected to another object" and it is of 2 types:
 * 		Aggregation
 * 		Composition 
 * */
class Laptop{
	
	String brand;
	
	Laptop(String brand){
		this.brand = brand;
	}
}

// Student HAS-A Laptop
class Student{
	
	String name;
	Laptop laptop;
	
	Student(String name, Laptop laptop){
		this.name = name;
		this.laptop = laptop;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(laptop.brand);
	}
}

public class AssociationExample {

	public static void main(String[] args) {
		Laptop l1 = new Laptop("Lenovo");
		Student s1 = new Student("Sumanth", l1);
		
		s1.display();
	}

}
