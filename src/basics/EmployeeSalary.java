package basics;

public class EmployeeSalary {

	public static void main(String[] args) {
		String employee = "Sumanth";
		int basic_salary = 80000;
		int bonus = 8000;
		
		int total_salary = (basic_salary + bonus);
		
		System.out.println("Employee name: " + employee);
		System.out.println("Basic salary: " + basic_salary);
		System.out.println("Bonus: " + bonus);
		System.out.println("Employee total salary: " + total_salary);
	}

}
