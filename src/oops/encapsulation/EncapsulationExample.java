package oops.encapsulation;

class Student{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

public class EncapsulationExample {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.setName("Sumanth");
		
		System.out.println(s.getName());
	}

}
