package java8features;

import java.util.function.Function;

// converting String to Uppercase and finding the length of a String. Also using andThen() method
public class FunctionExample2 {
	
	public static void main(String[] args) {
		Function<String, String> upper = str -> str.toUpperCase();
		Function<String, Integer> length = str -> str.length();
		
		System.out.println(upper.andThen(length).apply("sumu"));
	}

}
