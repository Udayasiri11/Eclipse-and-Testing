package Collectionspack;
import java.util.HashSet;
import java.util.Set;
public class Hashset 
{

	public static void main(String[] args)
	{
		//Set<String> fruits=new HashSet<>();
		HashSet<String> patients=new HashSet<>();
		patients.add("kaaru");
		patients.add("chaaru");
		patients.add("kaaru");
		if(patients.contains("kaaru"))
		{
			System.out.println("Kaaru is registered");
		}
		patients.remove("chaaru");
		for(String name : patients)
		{
			System.out.println(name);
		}
		// TODO Auto-generated method stub

	}

}
