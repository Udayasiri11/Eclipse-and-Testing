package wipro;
import java.util.Scanner;

public class Passwordattempt {

	public static void main(String[] args) {
		int attempts = 0;
		String correctPassword = "admin123";
		Scanner sc = new Scanner(System.in);
		String input;
		while (attempts < 3) {
		    System.out.print("Enter password: ");
		    input = sc.nextLine();
		    if (input.equals(correctPassword)) {
		        System.out.println("Access granted");
		        break;
		    }
		    attempts++;
		}
	}

}
