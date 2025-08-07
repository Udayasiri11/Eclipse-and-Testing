package OOPs;

public abstract class Remote {
		// TODO Auto-generated method stub
	    public abstract void turnOn();
	    public abstract void turnOff();
	}
	class TVRemote extends Remote { 
	    public void turnOn() {
	        System.out.println("is now ON");
	    }
	    public void turnOff() {
	        System.out.println("is now OFF");
	    }
	}
