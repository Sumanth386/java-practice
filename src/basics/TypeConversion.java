package basics;

public class TypeConversion {

	public static void main(String[] args) {
		int num = 100;
		double converted = num; // implicit conversion
		
		double price = 89.99;
		int intPrice = (int)price; // explicit conversion
		
		long num2 = 23229831; 
		int intNum2 = (int)num2; // explicit conversion
		
		float num3 = 8.232768f;
		int intNum3 = (int)num3;	// explicit conversion
		
		System.out.println("int to double: " + converted);
		System.out.println("double to int: " + intPrice);
		System.out.println("long to int: " + intNum2);
		System.out.println("float to int: " + intNum3);
		
	}

}
