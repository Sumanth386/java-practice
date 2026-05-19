/*	Synchronization allows:
	Only one thread at a time to access critical code.*/

package multithreading.synchronization;

class Counter{
	int count = 0;
	
	public synchronized void increment() {
		count++;
	}
}

class MyThread extends Thread{
	Counter counter;
	
	public MyThread(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			counter.increment();
		}
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) throws InterruptedException{
		Counter counter = new Counter();
		
		MyThread t1 = new MyThread(counter);
		
		MyThread t2 = new MyThread(counter);
		
		t1.start();
		
		t2.start();
		
		t1.join();
		
		t2.join();
		
		System.out.println("Final count: " + counter.count);
	}

}
