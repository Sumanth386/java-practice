package oops.inheritance;

class Animals{
	
	void sound() {
		System.out.println("Animals makes sound");
	}
}

class Dogs extends Animals{
	
	@Override
	void sound() {
		System.out.println("Dogs barks");
	}
}

public class MethodOverridingExample {

	public static void main(String[] args) {
		Dogs d = new Dogs();
		d.sound();
	}

}
