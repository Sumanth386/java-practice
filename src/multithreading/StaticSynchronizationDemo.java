package multithreading;

class Display{
	public static synchronized void printNumbers(){
		for(int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
			
			try {
				Thread.sleep(1000);
			}
			
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class OurThread extends Thread{
	
	@Override
	public void run() {
		Display.printNumbers();
	}
}

public class StaticSynchronizationDemo {

	public static void main(String[] args) {
		OurThread t1 = new OurThread();
		OurThread t2 = new OurThread();
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		
		t1.start();
		t2.start();
	}

}
