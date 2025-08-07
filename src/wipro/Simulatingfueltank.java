package wipro;

public class Simulatingfueltank {

	public static void main(String[] args) {
		int fuel = 10;
		while (fuel > 0) {
		    System.out.println("Driving... Fuel left: " + fuel);
		    fuel--;
		}
		System.out.println("Out of fuel!");
	}

}
