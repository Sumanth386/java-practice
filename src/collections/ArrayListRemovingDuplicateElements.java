package collections;

import java.util.ArrayList;

public class ArrayListRemovingDuplicateElements {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Steve Rogers");
		names.add("Tony Stark");
		names.add("Thor");
		names.add("Banner");
		names.add("Natasha");
		names.add("Tony Stark");
		names.add("Natasha");
		
		System.out.println("Original ArrayList: " + names);
		
		ArrayList<String> names2 = new ArrayList<>();
		for(String name : names) {
			if(!names2.contains(name)) {
				names2.add(name);
			}
		}
		
		System.out.println("Unique Names: " + names2);
	}

}
