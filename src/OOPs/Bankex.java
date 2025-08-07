package OOPs;

public class Bankex {
	private double bal=30000;
	public void setDeposit(int deposit)
	{
		bal +=deposit;
		System.out.println("Total balance: "+ bal);
	}
	public void Setwithdrawal(int with) {
		if(bal>with)
		{
			bal -= with;
			System.out.println("After withdrawal: " + bal);
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		
	}


		// TODO Auto-generated method stub



}
