package wipro;

public class Arraysum {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40};
		int total = 0;
		for (int num : numbers) {
		    total += num;
		}
		System.out.println("Total: " + total);
	}

}
