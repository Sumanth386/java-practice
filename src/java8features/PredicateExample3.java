package java8features;

import java.util.function.Predicate;

// Check voting eligibility
public class PredicateExample3 {

	public static void main(String[] args) {
		Predicate<Integer> eligibility = age -> age >= 18;
		
		if(eligibility.test(20)) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("Not eligible to vote");
		}
	}

}
