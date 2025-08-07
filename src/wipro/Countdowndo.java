package wipro;
import java.util.Scanner;

public class Countdowndo {

	public static void main(String[] args) {
		int count = 5;
		do {
		    System.out.println("Countdown: " + count);
		    count--;
		} while (count > 0);
		int marks;
		Scanner sc = new Scanner(System.in);
		do {
		    System.out.print("Enter marks (0-100): ");
		    marks = sc.nextInt();
		} while (marks < 0 || marks > 100);
		System.out.println("Valid marks: " + marks);

		// TODO Auto-generated method stub

	}

}
