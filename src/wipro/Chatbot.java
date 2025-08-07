package wipro;
import java.util.Scanner;
public class Chatbot {

	public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        System.out.println("Chatbot: Hello lets talk or Type bye to exit.");
		        while (true) {
		            System.out.print("You: ");
		            String message = input.nextLine();
		            if (message.equals("bye")) {
		                System.out.println("Chatbot: Goodbye! Have a great day!");
		                break;
		            }
		            if (message.equals("hi")) {
		                System.out.println("Chatbot: Hello there!");
		            } else if (message.equals("how are you")) {
		                System.out.println("Chatbot:I am fine");
		            } else if (message.equals("what is your name")) {
		                System.out.println("Chatbot: I am ChatBot");
		            } else if (message.equals("help")) {
		                System.out.println("Chatbot: You can try saying 'hi', 'how are you', or 'what is your name'");
		            } else {
		                System.out.println("Chatbot: Sorry, I didn't understand that.");
		            }
		        }
		        input.close();
		    }
}
		
