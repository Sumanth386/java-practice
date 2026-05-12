package oops;

public class StudentConstructor {
	
	int id;
	String name;
	
	// Non-parameterized Constructor
	StudentConstructor(){
		System.out.println("Constructor called");
	}

	public static void main(String[] args) {
		StudentConstructor stud = new StudentConstructor();
	}

}
