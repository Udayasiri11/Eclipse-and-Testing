package wipro;

public class Vowelsinstring {

	public static void main(String[] args) {
		char[] letters = {'a', 'b', 'e', 'i', 'o', 'u'};
		for (char ch : letters) {
		    if ("aeiou".indexOf(ch) != -1) {
		        System.out.println("Vowel: " + ch);
		    }
		}
	}

}
