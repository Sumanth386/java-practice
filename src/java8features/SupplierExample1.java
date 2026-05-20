/*	Supplier<T> is functional interface present in java.util.Function
 * 
 * It takes no input and return input
 * 
 * Syntax: Supplier<T> name = ()-> value;
 * 
 * Abstract method: T get();
 * 
 * */

package java8features;

import java.util.function.Supplier;

public class SupplierExample1 {

	public static void main(String[] args) {
		Supplier<String> s = ()-> "Blessings";
		System.out.println(s.get());
	}

}
