package oops;

// Simple example of Class and Object
public class Student {

	int id;
	String name;
	
	void display() {
		System.out.println(id);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.id = 101;
		s1.name = "Sumanth";
		
		s1.display();
	}

}
