package multithreading;

class EvenThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			if( i % 2 == 0) {
				System.out.println("Even Thread: " + i);
				
				try {
					Thread.sleep(1000);
				}
				
				catch(InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}
}

class OddThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				System.out.println("Odd Thread: " + i);
				
				try {
					Thread.sleep(1000);
				}
				
				catch(InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}
}

public class EvenOddThreadingDemo {

	public static void main(String[] args) {
		EvenThread t1 = new EvenThread();
		OddThread t2 = new OddThread();
		
		t1.start();
		t2.start();
	}

}
