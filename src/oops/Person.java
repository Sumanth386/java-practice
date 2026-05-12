package oops;
// Constructor Overloading
public class Person {
	
	int age;
	String name;
	
	Person(){
		System.out.println("Default constructor");
	}
	
	Person(int age){
		this.age = age;
	}
	
	Person(int age, String name){
		this.age = age;
		this.name = name;
	}

	void display() {
		System.out.println(age);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person(25);
		Person p3 = new Person(25, "Ananth");
		
		p1.display();
		
		System.out.println();
		
		p2.display();
		
		System.out.println();
		
		p3.display();
	}

}
