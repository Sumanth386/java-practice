package wrapperclass;

public class WrapperClassExample2 {

	public static void main(String[] args) {
		Integer obj = Integer.valueOf(50);
		
		// Unboxing: converting object to primitive
		int num = obj.intValue();
		
		System.out.println(obj);
		System.out.println(num);
	}

}
