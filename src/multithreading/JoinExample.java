package multithreading;

class DownloadThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Downloading File..." + (i * 20) + "%");
			
			try {
				Thread.sleep(1000);
			}
			
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		
		System.out.println("Download completed");
	}
}

public class JoinExample {

	public static void main(String[] args) {
		DownloadThread t1 = new DownloadThread();
		
		t1.start();
		
		try {
			t1.join();
		}
		
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Now you can open the file");
	}

}
