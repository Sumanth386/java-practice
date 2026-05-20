package java8features;

import java.util.function.Predicate;
// Check String length
public class PredicateExample2 {

	public static void main(String[] args) {
		Predicate<String> p = str -> str.length() > 5;
		
		System.out.println(p.test("Java"));
		System.out.println(p.test("Sumanth"));
	}

}
