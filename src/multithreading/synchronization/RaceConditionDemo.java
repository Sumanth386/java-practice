/*	Race Condition happens when:

Multiple threads access and modify shared data simultaneously.*/

package multithreading.synchronization;

class Counter1{
	int count = 0;
	
	public void increment() {
		count++;
	}
}

class MyThread1 extends Thread{
	Counter1 counter;
	
	public MyThread1(Counter1 counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			counter.increment();
		}
	}
}

public class RaceConditionDemo {

	public static void main(String[] args)
            throws InterruptedException {

        Counter counter = new Counter();

        MyThread t1 = new MyThread(counter);

        MyThread t2 = new MyThread(counter);

        t1.start();

        t2.start();

        t1.join();

        t2.join();

        System.out.println("Final Count: "
                + counter.count);
	}

}
