package basics;

public class LargestOfFourNumbers {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 15, d = 25;
		int max = a;
		
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		if(d > max) {
			max = d;
		}
		
		System.out.println("Largest number is: " + max);
	}

}
