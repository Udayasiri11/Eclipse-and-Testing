package Collectionspack;
import java.util.ArrayList;
import java.util.Scanner;
	class Patientone
	{
		private String name;
		private int age;
		private String disease;
		public Object id;
		public Patientone(String name,int age,String disease)
		{
			this.name=name;
			this.age=age;
			this.disease=disease;
		}
		public String getName()
		{
			return name;
		}
		public void displayDetails()
		{
			System.out.println("Name:" + name + "\nAge:" + age + "\nDisease" + disease);
		}
	}
	public class PatientManagement
	{
		public static void main(String[] args)
		{
			ArrayList<Patientone> list=new ArrayList<>();
			Scanner scanner=new Scanner(System.in);
			list.add(new Patientone("Babu",55,"BloodPressure"));
			list.add(new Patientone("Sambu",53,"Diabetes"));
			list.add(new Patientone("Swamy",55,"BloodPressure"));
			list.add(new Patientone("Bujji",50,"BloodPressure"));
			while(true)
			{
				System.out.println("\nHospital OPD Menu:");
				System.out.println("1.Add New Patient name:");
				System.out.println("2.Display all Patients");
				System.out.println("3.Search Patient by Name");
				System.out.println("4.Exit");
				System.out.println("Enter Your Choice:");
				int choice=scanner.nextInt();
				scanner.nextLine();
				switch(choice)
				{
				case 1:
					System.out.println("Enter Patient Name:");
					String name=scanner.nextLine();
					System.out.println("Enter Patient Age:");
					int age=scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter Disease");
					String disease=scanner.nextLine();
					list.add(new Patientone(name,age,disease));
					System.out.println("Patient added successfully");
					break;
				case 2:
					System.out.println("All registered Patients:");
					for(Patientone p : list)
					{
						p.displayDetails();
					}
					break;
				case 3:
					System.out.println("Enter patient name to search:");
					String searchName=scanner.nextLine();
					boolean found=false;
					for(Patientone p:list)
					{
						if(p.getName().equalsIgnoreCase(searchName))
						{
							p.displayDetails();
							found=true;
						}
					}
					if(!found)
					{
						System.out.println("No patient found with name: " + searchName);
					}
					break;
				case 4:
					System.out.println("Exiting:");
					scanner.close();
					return;
				default:System.out.println("Invalid Choice!");
				}
			}
		}
}