package java8features;


/* without lambda expression

interface Greeting{
	void sayHello();
}

public class MyGreeting implements Greeting{
	
	@Override
	public void sayHello() {
		System.out.println("Hello.");
	}
}
*/

// with lambda expression
interface Greeting{
	void sayHello();
}

public class MyGreeting {

	public static void main(String[] args) {
		
		Greeting g = () -> {
			System.out.println("Hello");
		};
		
		g.sayHello();
	}

}

