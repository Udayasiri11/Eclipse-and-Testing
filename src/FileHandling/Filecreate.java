package FileHandling;
//import java.io.*;
import java.io.File;
import java.io.IOException;
public class Filecreate {

	public static void main(String[] args) {
		{
			try
			{
				File file=new File("test.txt");
				if(file.createNewFile())
				System.out.print("File Created: "  + file.getName());
				else
				System.out.print("File already exists");
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		 
				
			}
		}
		// TODO Auto-generated method stub

}
