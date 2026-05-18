package wrapperclass;

public class UtiliyMethodsOfInteger {

	public static void main(String[] args) {
		String str = "123";
		
		// String -> int
		int num = Integer.parseInt(str);
		
		System.out.println(num);
		
		// int -> String
		int num1 = 500;
		String str1 = Integer.toString(num1);
		
		System.out.println(str1);
		
		// compare()
		System.out.println(Integer.compare(10, 20));
	}

}
