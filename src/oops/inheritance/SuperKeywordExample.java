package oops.inheritance;

class Bag{
	
	String color = "White";
	
	Bag(){
		System.out.println("Bag constructor");
	}
	
}

class Book extends Bag{
	
	String color = "Blue";
	
	Book(){
		// Parent Constructor call
		super();
		System.out.println("Book constructor");
	}
	
	void printColor() {
		// Accessing parent variable using super keyword
		System.out.println(super.color);
		System.out.println(color);
	}
}

public class SuperKeywordExample {

	public static void main(String[] args) {
		Book b = new Book();
		b.printColor();
	}

}
