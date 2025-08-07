package Collectionspack;
import java.util.*;
class Patient {
	 String id;
	    String name;
	    Patient(String id, String name) {
	        this.id = id;
	        this.name = name;
	    }
	    public String toString() {
	        return  id + name;
	    }
}
public class AdvancedHospital
	{
	public static void main(String[] args)
	{
		LinkedList<Patient> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do 
        {
            System.out.println("\n Hospital Queue Menu");
            System.out.println("1. Admit Normal Patient");
            System.out.println("2. Admit Emergency Patient");
            System.out.println("3. View All Patients");
            System.out.println("4. View First and Last Patient");    
            System.out.println("5. Treat Patient");
            System.out.println("6. Cancel Appointment by ID");
            System.out.println("7. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) 
            {
                case 1:
                case 2:
                    System.out.print("Enter patient ID: ");
                    String id = sc.nextLine();
                    boolean exists = false;
                    for (Patient p : queue) 
                    {
                        if (p.id.equals(id))
                        {
                            exists = true;
                            break;
                        }
                    }
                    if (exists)
                    {
                        System.out.println("Patient with this ID already exists.");
                    } else 
                    {
                        System.out.print("Enter patient name: ");
                        String name = sc.nextLine();
                        Patient newPatient = new Patient(id, name);
                        if (choice == 2) 
                        {
                            queue.addFirst(newPatient);
                            System.out.println("Emergency Admitted: " + newPatient);
                        } 
                    }
                    break;
                case 3:
                    if (queue.isEmpty())
                    {
                        System.out.println("Queue is empty.");
                    } else
                    {
                        System.out.println("Patient Queue:");
                        for (Patient p : queue) {
                            System.out.println(" - " + p);
                        }
                    }
                    break;
                case 4:
                    System.out.println(queue.isEmpty() ? "No patients." : "First: " + queue.getFirst());
                    System.out.println(queue.isEmpty() ? "No patients." : "Last: " + queue.getLast());
                case 5:
                    if (queue.isEmpty()) 
                    {
                        System.out.println("No patients to treat.");
                    } else
                    {
                        System.out.println("Treated: " + queue.removeFirst());
                    }
                    break;
                case 6:
                    System.out.print("Enter patient ID to cancel: ");
                    String cancelId = sc.nextLine();
                    boolean removed = queue.removeIf(p -> p.id.equals(cancelId));
                    System.out.println(removed ? "Appointment cancelled." : " No patient found with that ID.");
                    break;
                case 7:
                    System.out.println("Exiting.");
                    break;
                default:
                	System.out.println("❗ Invalid choice.");
            }
        } while (choice != 0);
        sc.close();
	}
}


		// TODO Auto-generated method stub
