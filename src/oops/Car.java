package oops;
// Class and Object(Example 2)
public class Car {

	String brand;
	String color;
	double speed;
	
	void displayCarInfo() {
		System.out.println("Car's Brand: " + brand);
		System.out.println("Car's color: " + color);
		System.out.println("Car's speed: " + speed);
	}
	
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.brand = "BMW";
		car1.color = "Black";
		car1.speed = 200.00;
		
		car1.displayCarInfo();
		System.out.println();
		
		car2.brand = "Porsche";
		car2.color = "Red";
		car2.speed = 300.00;
		
		car2.displayCarInfo();
	}

}
