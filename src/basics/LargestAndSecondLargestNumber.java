package basics;

public class LargestAndSecondLargestNumber {

	public static void main(String[] args) {
		int a = 10; 
		int b = 32;
		int c = 6;
		int d = 23;
		
		int max = a;
		int secondMax = a;

		// for b
		if(b > max) {
		    secondMax = max;
		    max = b;
		} else if(b > secondMax && b != max) {
		    secondMax = b;
		}

		// for c
		if(c > max) {
		    secondMax = max;
		    max = c;
		} else if(c > secondMax && c != max) {
		    secondMax = c;
		}

		// for d
		if(d > max) {
		    secondMax = max;
		    max = d;
		} else if(d > secondMax && d != max) {
		    secondMax = d;
		}

		System.out.println("Largest: " + max);
		System.out.println("Second Largest: " + secondMax);
	}

}
