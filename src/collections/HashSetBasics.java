package collections;

import java.util.HashSet;

public class HashSetBasics {

	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<>();
		
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Pineapple");
		fruits.add("Orange");
		
		for(String fruit : fruits) {
			System.out.print(fruit + " ");
		}
		
		System.out.println();
		
		fruits.remove("Pineapple");
		
		System.out.println("Contains Mango: " + fruits.contains("Mango"));
		
		System.out.println("Size: " + fruits.size());
		
		for(String fruit : fruits) {
			System.out.print(fruit + " ");
		}
	}

}
