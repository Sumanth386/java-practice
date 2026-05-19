package multithreading;

class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Child Thread: " + i);
		}
	}
}

public class RunnableExample {

	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		
		Thread t1 = new Thread(r1);
		
		t1.start();
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Main Thread: " + i);
		}
	}

}
