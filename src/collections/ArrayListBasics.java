package collections;

import java.util.ArrayList;

public class ArrayListBasics {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Wilson Fisk");
		names.add("Peter Parker");
		names.add("Daredevil");
		names.add("Bullseye");
		names.add("Jessica Jones");
		
		System.out.println(names);
		
		System.out.println(names.get(2));
		
		names.remove(0);
		
		System.out.println(names);
		
		System.out.println("Size: " + names.size());
		
		System.out.println(names.contains("Jessica Jones"));
		
		// looping through ArrayList
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}

}
