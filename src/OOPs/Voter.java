package OOPs;

public class Voter {
		    public static void main(String[] args) {
		        Voterex voter = new Voterex();
		        voter.setVoterId("123456");
		        voter.setAge(21);
		        voter.setHasVoted(false); 

		        
		        if (voter.isEligible()) {
		            System.out.println("Voter ID: " + voter.getVoterId());
		            System.out.println("Eligible to vote.");
		            voter.setHasVoted(true);
		            System.out.println("Voting done");
		        }
		        if (voter.getAge() < 18) 
		        {
		                System.out.println("Underage");
		        } 
		        else if (voter.getHasVoted()) 
		        {
		                System.out.println("Already voted");
		        }
		    }
}



		// TODO Auto-generated method stub}
