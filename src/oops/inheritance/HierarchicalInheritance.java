package oops.inheritance;

class Person{
	void display() {
		System.out.println("Person is walking");
	}
}

class Student extends Person{
	void study() {
		System.out.println("Student is studying");
	}
}

class Teacher extends Person{
	void teach() {
		System.out.println("Teacher is teaching");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.display();
		s.study();
		
		System.out.println();
		
		Teacher t = new Teacher();
		
		t.display();
		t.teach();
	}

}
