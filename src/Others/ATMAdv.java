package Others;
import java.util.Scanner;
	class InvalidPinException extends Exception 
	{
	    public InvalidPinException(String message) 
	    {
	        super(message);
	    }
	}
	class InsufficientBalanceException extends Exception
	{
	    public InsufficientBalanceException(String message)
	    {
	        super(message);
	    }
	}
	class ATMUser
	{
	    int accountNumber;
	    int pin;
	    double balance;

	    ATMUser(int accountNumber, int pin, double balance)
	    {
	        this.accountNumber = accountNumber;
	        this.pin = pin;
	        this.balance = balance;
	    }
	}

	public class ATMAdv
	{
	    static ATMUser[] users = {
	        new ATMUser(1234, 1122, 10000),
	        new ATMUser(5678, 2233, 20000),
	        new ATMUser(9012, 3344, 30000)
	 };

	 public static void main(String[] args)
	 {
	        Scanner sc = new Scanner(System.in);
	        ATMUser currentUser = null;
	        int attempts = 0;

	        try 
	        {
	            while (attempts < 3 && currentUser == null) 
	            {
	                System.out.print("Enter account number: ");
	                int enteredAcc = sc.nextInt();

	                System.out.print("Enter PIN: ");
	                int enteredPin = sc.nextInt();

	                for (ATMUser user : users)
	                {
	                    if (user.accountNumber == enteredAcc)
	                    {
	                        if (user.pin == enteredPin) 
	                        {
	                            currentUser = user;
	                            break;
	                        } else 
	                        {
	                            throw new InvalidPinException("Invalid PIN entered");
	                        }
	                    }
	                }

	                if (currentUser == null) 
	                {
	                    System.out.println("Account not found or wrong PIN");
	                    attempts++;
	                }
	            }

	            if (currentUser == null)
	            {
	                System.out.println("Too many failed attempts");
	                return;
	            }

	            System.out.println("Welcome, Account No: " + currentUser.accountNumber);
	            System.out.println("1.Check Balance \n2.Deposit\n3.Withdraw");
	            System.out.print("Choose option 1 2 3: ");
	            int option = sc.nextInt();

	            if (option == 1)
	            {
	                System.out.println("Your balance: rupees " +  currentUser.balance);
	            }

	            if (option == 2)
	            {
	                System.out.print("Enter amount to deposit: ");
	                double amount = sc.nextDouble();
	                if (amount > 0) 
	                {
	                    currentUser.balance += amount;
	                    System.out.println("Deposit successful. New Balance: rupees" + currentUser.balance);
	                } 
	                else 
	                {
	                    System.out.println("Invalid deposit amount.");
	                }
	            }

	            if (option == 3)
	            {
	                System.out.print("Enter amount to withdraw: ");
	                double amount = sc.nextDouble();
	                if (amount <= currentUser.balance) 
	                {
	                    currentUser.balance -= amount;
	                    System.out.println("Withdrawal successful.Remaining Balance: rupees" + currentUser.balance);
	                }
	                else
	                {
	                    throw new InsufficientBalanceException("Not enough balance to withdraw rupees" + amount);
	                }
	            }

	        } catch (InvalidPinException ipe) 
	        {
	            System.out.println("Exception: " + ipe.getMessage());
	        } catch (InsufficientBalanceException ibe) 
	        {
	            System.out.println("Exception: " + ibe.getMessage());
	        } catch (Exception e)
	        {
	            System.out.println("General Error: " + e.getMessage());
	        } finally 
	        {
	            System.out.println("Thank you for using the ATM.");
	        }
	        sc.close();
	    }
}

		// TODO Auto-generated method stub
