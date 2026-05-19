package multithreading;

class MyThread1 extends Thread{
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		}
		
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Thread is running.");
	}
}

public class ThreadLifeCycleDemo {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		
		System.out.println(t1.getState());
		
		t1.start();
		
		System.out.println(t1.getState());
		
		try {
			Thread.sleep(500);
		}
		
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println(t1.getState());
	}

}
