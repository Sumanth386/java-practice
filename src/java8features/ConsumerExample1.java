/* Consumer<T> is a built-in functional interface present in java.util.Function
 * It takes some input, performs operation and returns nothing
 * 
 * Syntax: Consumer<T> name = (input) -> {
 * 			// operation			
 * 		   };
 * 
 * Abstract method: void accept(T t);
 * */

package java8features;

import java.util.function.Consumer;
// Print a name
public class ConsumerExample1 {

	public static void main(String[] args) {
		Consumer<String> c = name -> System.out.println(name);
		c.accept("Sumanth");
	}

}
