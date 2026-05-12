package oops;
// Class and Object(Example 1)
public class Employee {

	int id;
	String name;
	double salary;
	
	void display() {
		System.out.println("Employee ID: " + id);
		System.out.println("Employee name: " + name);
		System.out.println("Employee salary: " + salary);
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.id = 301;
		emp1.name = "Amar";
		emp1.salary = 80000.00;
		
		emp1.display();
		System.out.println();
		
		emp2.id = 303;
		emp2.name = "Anusha";
		emp2.salary = 60000.50;
		
		emp2.display();
	}

}
