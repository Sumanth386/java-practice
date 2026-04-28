package methods;

public class StudentMarks {
	
	static int calculateTotal(int m1, int m2, int m3){
		return m1 + m2 + m3;
	}
	
	static void printResult(int total){
		System.out.println("Total: " + total);
	}
	
	public static void main(String[] args) {
		int total = calculateTotal(88, 66, 33);
		printResult(total);
	}

}
