package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriting
{

	public static void main(String[] args)
	{
		 try 
		 {
	            FileWriter writer = new FileWriter("test.txt");
	            writer.write("Hello");
	            writer.close();
	            System.out.println("Text written");
	     }
		 catch (IOException e) 
		 {
	            System.out.println("Error: " + e.getMessage());
		 }
		 }
}
		// TODO Auto-generated method stub

