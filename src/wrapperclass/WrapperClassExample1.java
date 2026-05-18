package wrapperclass;

public class WrapperClassExample1 {

	public static void main(String[] args) {
		int num = 10;
		
		// Boxing: converting primitive data type to object
		Integer obj = Integer.valueOf(num);
		
		System.out.println(num);
		System.out.println(obj);
	}

}
