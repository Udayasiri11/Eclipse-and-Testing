package OOPs;

public abstract class Notification {
	   public abstract void send(String message);
	}
	class EmailNotification extends Notification {
	    public void send(String message) {
	        System.out.println("Email: " + message);
	    }
	}
	class SMSNotification extends Notification {
	    public void send(String message) {
	        System.out.println("Message: " + message);
	    }
	}
	class InstaNotification extends Notification {
	    public void send(String message) {
	        System.out.println("Instagram: " + message);
	    }
		// TODO Auto-generated method stub
}
