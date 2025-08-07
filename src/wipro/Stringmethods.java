package wipro;

public class Stringmethods {
	
	
    public static void main(String[] args) {
        String str = "Hi siri How are you";

        System.out.println("Length is " + str.length()); 
        System.out.println("Char at index 6 " + str.charAt(6)); 
        System.out.println("Substring from 2 is " + str.substring(2)); 
        System.out.println("Substring from 2 to 6 is " + str.substring(2, 7)); 
      
        System.out.println("Index of S: " + str.indexOf('S')); 
        System.out.println("Index of Siri: " + str.indexOf("Siri")); 
        System.out.println("Last Index of w: " + str.lastIndexOf("w")); 
        System.out.println("Contains Siri: " + str.contains("Siri")); 
        System.out.println("Starts With   Hi: " + str.startsWith("  Hi")); 
        System.out.println("Ends With Siri  ': " + str.endsWith("Siri  "));
        System.out.println("To Lower Case: " + str.toLowerCase()); 
        System.out.println("To Upper Case: " + str.toUpperCase());
        System.out.println("Replace 'w' with 'W': " + str.replace('a', 'A')); 
        System.out.println("Replace 'Siri' with 'Udaya': " + str.replace("Java", "Python"));
        System.out.println("Replace All 'i' with 'I': " + str.replaceAll("o", "O"));

        String csv = "apple,banana,grape";
        String[] fruits = csv.split(","); 
        System.out.println("Fruits Split:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        String joined = String.join(",", fruits);
        System.out.println("Joined Fruits: " + joined);
    }
}//18 methods

