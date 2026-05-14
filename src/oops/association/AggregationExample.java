package oops.association;
/* In Aggregation(weak relationship) child object can exist independently of parent object*/

class Employee{
	
	String name;
	
	Employee(String name){
		this.name = name;
	}
}

class Department{
	
	String deptName;
	Employee emp;
	
	Department(String deptName, Employee emp){
		this.deptName = deptName;
		this.emp = emp;
	}
	
	void display() {
		System.out.println(deptName);
		System.out.println(emp.name);
	}
}

public class AggregationExample {

	public static void main(String[] args) {
		Employee e1 = new Employee("Ganesha");
		Department d1 = new Department("HR", e1);
		
		d1.display();
	}

}
