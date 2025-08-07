package Others;
import java.util.Scanner;
class InvalidPinException extends Exception
{
	public InvalidPinException(String message)
	{
		super(message);
	}
}

public class ATM {
	static final int Correctpin=1122;
	static void validatepin(int enteredpin) throws InvalidPinException
	{
		if(enteredpin!= Correctpin)
		{
			throw new InvalidPinException("Invalid pin entered");
		}
	}

	public static void main(String[] args) 
	{
		Scanner p=new Scanner(System.in);
		try
		{
			System.out.print("Insert the card");
			System.out.print("Enter 4 digit pin: ");
			int pin=p.nextInt();
				validatepin(pin);
				System.out.println("pin verified");
				System.out.println("You can proceed with withdrawal");
		}
		catch(InvalidPinException e)
		{
			System.out.println("Access denied:" +e.getMessage());
		}
		finally
		{
			System.out.println("Transaction done:Take your card");
		}
		p.close();
		// TODO Auto-generated method stub	
	}

}
