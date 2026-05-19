package java8features;

interface Calculator{
	void add(int a, int b);
}

public class LambdaExample2 {

	public static void main(String[] args) {
		
		/*class MyCalculator implements Calculator{
			
			@Override
			public void add(int a, int b) {
				System.out.println(a + b);
			}
		}
		*/
		
		Calculator c = (a, b)-> System.out.println(a + b);
		
		c.add(10, 20);
	}

}
