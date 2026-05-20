package java8features;

import java.util.function.Supplier;

// return random number
public class SupplierExample2 {

	public static void main(String[] args) {
		Supplier<Double> random = ()-> Math.random();
		
		System.out.println(random.get());
	}

}
