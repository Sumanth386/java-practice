package oops.objectclassmethods;

// without overriding toString() and equals() of Object class
class Student{
	
	String name = "Sumanth";
}

public class Example1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1);			// oops.objectclassmethods.Student@24d46ca6 -> packagename.className.hashcode
		System.out.println(s1.equals(s2)); 		// false
	}

}
