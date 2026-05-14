package oops.abstraction;

interface Notifications{
	
	void sendMessage();
}

class EmailNotification implements Notifications{
	
	public void sendMessage() {
		System.out.println("Sending email.");
	}
}

class SMSNotification implements Notifications{
	
	public void sendMessage() {
		System.out.println("Sending SMS.");
	}
}

public class Example3OfAbstractionUsingInterface {

	public static void main(String[] args) {
		EmailNotification e1 = new EmailNotification();
		SMSNotification s1 = new SMSNotification();
		
		e1.sendMessage();
		s1.sendMessage();
	}

}
