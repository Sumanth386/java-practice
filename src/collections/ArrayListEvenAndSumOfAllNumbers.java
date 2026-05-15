package collections;

import java.util.ArrayList;
public class ArrayListEvenAndSumOfAllNumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(34);
		numbers.add(17);
		numbers.add(65);
		numbers.add(89);
		numbers.add(70);
		numbers.add(11);
		
		System.out.print("Even Numbers: ");
		
		for(int i = 0; i < numbers.size(); i++) {
			int number = numbers.get(i);
			
			if(number % 2 == 0) {
				System.out.print(number + " ");
			}
		}
		
		System.out.println();
		
		int sum = 0;
		
		for(int number : numbers) {
			sum += number;
		}
		
		System.out.println("Sum: " + sum);
	}

}
