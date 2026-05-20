package java8features;

@FunctionalInterface
interface Name{
	void displayName();
}

public class FunctionalInterfaceExample1 {

	public static void main(String[] args) {
		Name n = ()->System.out.println("Sumanth");
		
		n.displayName();
	}

}
