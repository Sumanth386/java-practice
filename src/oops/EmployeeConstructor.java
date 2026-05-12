package oops;

public class EmployeeConstructor {

	int id;
	String name;
	double salary;
	
	EmployeeConstructor(int i, String n, double s){
		id = i;
		name = n;
		salary = s;
	}
	
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		EmployeeConstructor emp1 = new EmployeeConstructor(111, "Alexander", 40000.00);
		EmployeeConstructor emp2 = new EmployeeConstructor(112, "Ryan", 50000.00);
		
		emp1.display();
		
		System.out.println();
		
		emp2.display();
	}

}
