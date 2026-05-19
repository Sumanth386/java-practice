package java8features;

/*	A lambda expression is:a shorter way to write anonymous functions.
 
  	syntax: (parameters) -> {
    			// body
			}
*/
public class LambdaExample {

	public static void main(String[] args) {
		/*Runnable r = ()-> {
			System.out.println("Thread is running.");
		};
		
		Thread t1 = new Thread(r);
		t1.start(); */
		
		Thread t1 = new Thread(()->{
			System.out.println("Thread is running.");
		});
		
		t1.start();
	}

}
