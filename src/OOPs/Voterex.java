package OOPs;

public class Voterex {
	    private String voterId;
	    private int age;
	    private boolean hasVoted;
	    public String getVoterId() {
	        return voterId;
	    }
	    public void setVoterId(String voterId) {
	        this.voterId = voterId;
	    }

	    public int getAge() {
	        return age;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }
	    public boolean getHasVoted() {
	        return hasVoted;
	    }
	    public void setHasVoted(boolean hasVoted) {
	        this.hasVoted = hasVoted;
	    }
	    public boolean isEligible() {
	        return age >= 18 && !hasVoted;
	    }
}
