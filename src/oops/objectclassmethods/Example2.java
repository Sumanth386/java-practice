package oops.objectclassmethods;

// Using toString() and equals() by overriding both

class Students{
	
	String name;
	int age;
	
	Students(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " " + age;
	}
	
	@Override
	public boolean equals(Object obj) {

	    if(this == obj)
	        return true;

	    if(obj == null || getClass() != obj.getClass())
	        return false;

	    Students s = (Students) obj;

	    return this.name.equals(s.name) && this.age == s.age;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}

public class Example2 {

	public static void main(String[] args) {
		
		Students s1 = new Students("Usha", 25);
		Students s2 = new Students("Usha", 25);
		
		System.out.println(s1);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
