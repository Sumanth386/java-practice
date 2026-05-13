package oops.polymorphism;

class Calculator{
	
	int add(int a, int b) {
		return a + b;
	}
	
	int add(int a, int b, int c) {
		return a + b + c;
	}
	
	double add(double a, double b) {
		return a + b;
	}
}

public class CompileTimePolymorphimsOrMethodOverloading {
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		System.out.println(c.add(10,20));
		System.out.println(c.add(30, 40, 60));
		System.out.println(c.add(5.5, 4.5));
		
	}

}
