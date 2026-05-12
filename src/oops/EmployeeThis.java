package oops;

public class EmployeeThis {

	int id;
	String name;
	double salary;
	
	EmployeeThis(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void displayEmployeeDetails() {
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee salary: " + salary);
	}
	
	public static void main(String[] args) {
		EmployeeThis emp1 = new EmployeeThis(45, "Rohit", 20000.00);
		EmployeeThis emp2 = new EmployeeThis(18, "Virat", 18000.00);
		
		emp1.displayEmployeeDetails();
		
		System.out.println();
		
		emp2.displayEmployeeDetails();
	}

}
