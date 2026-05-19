package multithreading;

class NumberThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Number Thread: " + i);
			
			try {
				Thread.sleep(1000);
			}
			
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class AlphabetThread extends Thread{
	
	@Override
	public void run() {
		for(char ch = 'a'; ch <= 'e'; ch++) {
			System.out.println("Alphabet Thread: " + ch);
			
			try {
				Thread.sleep(1000);
			}
			
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class CountDownThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 5; i >= 1; i--) {
			System.out.println("Countdown Thread: " + i);
			
			try {
				Thread.sleep(1000);
			}
			
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class MutliThreadDemo {

	public static void main(String[] args) {
		NumberThread t1 = new NumberThread();
		AlphabetThread t2 = new AlphabetThread();
		CountDownThread t3 = new CountDownThread();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
