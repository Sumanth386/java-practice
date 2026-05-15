package collections;

import java.util.HashMap;

public class HashMapBasics {

	public static void main(String[] args) {
		
		HashMap<Integer, String> employees = new HashMap<>();
		
		employees.put(101, "Narasimha");
		employees.put(102, "Impana");
		employees.put(103, "Tejaswi");
		employees.put(104, "Prajwala");
		employees.put(105, "Nandini");
		
		System.out.println(employees);
		
		System.out.println("Employee having 102: " + employees.get(102));
		
		System.out.println("Contains key 103: " + employees.containsKey(103));
		
		System.out.println("Contains Prajwala: " + employees.containsValue("Prajwala"));
		
		for(Integer key : employees.keySet()) {
			System.out.println(key + " -> " + employees.get(key));
		}
	}

}
