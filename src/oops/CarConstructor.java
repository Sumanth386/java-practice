package oops;

public class CarConstructor {

	String brand;
	String color;
	double speed;
	
	CarConstructor(String b, String c, double s){
		brand = b;
		color = c;
		speed = s;
	}
	
	void displayCarDetails() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(speed);
	}
	
	public static void main(String[] args) {
		CarConstructor car1 = new CarConstructor("Tata" , "White", 200.00);
		CarConstructor car2 = new CarConstructor("Mahindra", "Black", 210.00);
		
		car1.displayCarDetails();
		
		System.out.println();
		
		car2.displayCarDetails();
	}

}
