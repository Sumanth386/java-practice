package collections;

import java.util.ArrayList;

public class ArrayListLargestElement {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(34);
		numbers.add(45);
		numbers.add(18);
		numbers.add(33);
		numbers.add(264);
		numbers.add(96);
		
		int largest = numbers.get(0);
		
		for(int number : numbers) {
			if(number > largest) {
				largest = number;
			}
		}
		
		System.out.println("Largest Number: " + largest);
	}

}
