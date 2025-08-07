package OOPs;

public class Notificationex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Notification email = new EmailNotification();
		        Notification sms = new SMSNotification();
		        Notification insta = new InstaNotification();
		        email.send("Your email verification link.");
		        sms.send("Your OTP is 123456.");
		        insta.send("You have a new follower.");
	}

}

