package multithreading;

class Thread1 extends Thread{
	
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		}
		
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Thread finished");
	}
}

public class IsAliveExample {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		
		System.out.println(t1.isAlive());
		
		t1.start();
		
		System.out.println(t1.isAlive());
		
		try {
			t1.join();
		}
		
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println(t1.isAlive());
	}
	
}
