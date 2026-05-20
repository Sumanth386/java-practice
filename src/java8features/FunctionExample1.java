/* Function<T, R> is a built-in functional interface present in java.util.function.
 * It takes input, process it and returns output
 * 
 * Syntax: Function<T, R> name = (input) -> output
 * 
 * abstract method: R apply(T t);
 * */

package java8features;

import java.util.function.Function;
// converting number to its square
public class FunctionExample1 {

	public static void main(String[] args) {
		Function<Integer, Integer> square = number -> number * number;
		
		System.out.println(square.apply(5));
	}
}
