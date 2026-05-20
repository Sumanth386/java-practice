package java8features;

import java.util.function.Consumer;

// Consumer chaining
public class ConsumerExample2 {

	public static void main(String[] args) {
		Consumer<String> c1 = str -> System.out.println(str.toUpperCase());
		
		Consumer<String> c2 = str -> System.out.println(str.length());
		
		c1.andThen(c2).accept("Powerful");
	}

}
