package collections;

import java.util.LinkedList;

public class LinkedListStudentNames {

	public static void main(String[] args) {
		LinkedList<String> students = new LinkedList<>();
		
		students.add("Jayanth");
		students.add("Aditi");
		students.add("Akul");
		students.add("Priyanka");
		students.add("Ganesha");
		
		students.addFirst("Tilak");
		
		System.out.println(students.get(3));
		
		students.removeLast();
		
		for(String student : students) {
			System.out.print(student + " ");
		}
	}

}
