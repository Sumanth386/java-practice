package oops.inheritance;

class Mother{
	
	void love() {
		System.out.println("Mother shows her unconditional love to her children...");
	}
}

class Child extends Mother{
	
	@Override
	void love() {
		System.out.println("Children also love their mother unconditionally...");
	}
}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		Mother m = new Child();
		m.love();
	}

}
