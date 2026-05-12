package oops;
// Constructor Chaining
public class Teacher {

	int id;
	String name;
	
	Teacher(){
		this(701);
		
		System.out.println("Default Constructor");
	}
	
	Teacher(int id){
		this(id, "Sumanth");
		
		System.out.println("One Parameter Constructor");
	}
	
	Teacher(int id, String name){
		this.id = id;
		this.name = name;
		
		System.out.println("Two parameter constructor");
	}
	
	public static void main(String[] args) {
		Teacher t = new Teacher();
	}

}
