/*	Predicate<T> is a built-in functional interface present in java.util.Function
 * 	
 * It is mainly used for:
							condition checking
							filtering
							returning boolean values
 	
 	Syntax: Predicate<T> name = (input) -> condition;
 	
 	It contains one abstract method: boolean test(T t);
 */

package java8features;

import java.util.function.Predicate;
// Checks number is even or not
public class PredicateExample1 {

	public static void main(String[] args) {
		Predicate<Integer> p = number -> number % 2 == 0;
		
		System.out.println(p.test(10));
		System.out.println(p.test(7));
	}

}
