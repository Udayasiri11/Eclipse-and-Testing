package Collectionspack;
import java.util.HashSet;
import java.util.Scanner;
public class PatientRegistration {
	public static void main(String[] args) {
		 HashSet<Integer> patientIds = new HashSet<>();
	        Scanner scanner = new Scanner(System.in);
	        boolean running = true;
	        while (running) {
	            System.out.println("\nHospital Patient Registration System");
	            System.out.println("1. Register Patient");
	            System.out.println("2. View Registered Patients");
	            System.out.println("3. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Patient ID to register: ");
	                    int id = scanner.nextInt();
	                    if (patientIds.contains(id)) {
	                        System.out.println("Patient ID already registered!");
	                    } else {
	                        patientIds.add(id);
	                        System.out.println("Patient registered successfully!");
	                    }
	                    break;
	                case 2:
	                    System.out.println("Registered Patient IDs:");
	                    for (int pid : patientIds) {
	                        System.out.println("Patient ID: " + pid);
	                    }
	                    break;
	                case 3:
	                    running = false;
	                    System.out.println("Exiting system. Goodbye!");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }

	        scanner.close();
	    }
	}

