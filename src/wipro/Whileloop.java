package wipro;

public class Whileloop {

	public static void main(String[] args) {
		int heartRate=120;
		while(heartRate>100)
		{
			System.out.println("Heart rate is high:"+ heartRate+"bpm.Monitoring...");
			heartRate=-5;
		}
		System.out.println("Heart rate is now normal");
		// TODO Auto-generated method stub

	}

}
