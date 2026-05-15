package collections;

import java.util.HashMap;

public class HashMapStudentMarks {

	public static void main(String[] args) {
		
		HashMap<String, Integer> students = new HashMap<>();
		
		students.put("Sumanth", 100);
		students.put("Jack", 80);
		students.put("Sumanth", 90);
		students.put("Rutherford", 95);
		students.put("Hardik", 60);
		students.put("Tilak", 85);
		students.put("Rohit", 100);
		
		for(String key : students.keySet()) {
			System.out.println(key + " -> " + students.get(key));
		}
	}

}
