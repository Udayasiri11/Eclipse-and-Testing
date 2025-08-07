package wipro;

public class Stringbuffer {

	public static void main(String[] args) {
		StringBuffer receipt=new StringBuffer();
		receipt.append("Supermart receipt: \n");
		receipt.append("Customer name:Udaya siri \n");
		receipt.append("Product cost \n");
		receipt.append("Wheatflour 150 \n");
		receipt.append("Rice 500 \n");
		receipt.append("Tomato 30 \n");
		receipt.append("Mirchi 15 \n");
		receipt.append("Cinnamon 5 \n");
		receipt.append("Turmeric 10 \n");
		receipt.append("Oil 1500 \n");
		receipt.append("Total cost:2500 \n");
		System.out.println(receipt);
	}

}
