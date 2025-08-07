package wipro;

public class Serverconnection {

	public static void main(String[] args) {
		boolean isConnected = false;
		int retries = 0;
		while (!isConnected && retries < 5) {
		    System.out.println("Trying to connect to server...");
		    retries++;
		    // Simulate success on 3rd try
		    if (retries == 3) {
		        isConnected = true;
		    }
		}
		System.out.println("Connected: " + isConnected);
	}

}
