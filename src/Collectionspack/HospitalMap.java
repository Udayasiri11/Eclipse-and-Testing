package Collectionspack;
import java.util.HashMap;
	class PatientHM {
		private int id;
	    private String name;
	    private int age;
	    private String disease;

	    public PatientHM(int id, String name, int age, String disease) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.disease = disease;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }
	    public int getAge() {
	        return age;
	    }

	    public String getDisease() {
	        return disease;
	    }
	    public String toString() {
	        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Disease: " + disease;
	    }
	    
	    //Overriding
		/*
		 * public boolean equals(Object obj) { if (this == obj) return true; if (obj ==
		 * null || getClass() != obj.getClass()) return false; PatientHM patient =
		 * (PatientHM) obj; return id == patient.id && age == patient.age && (name !=
		 * null ? name.equals(patient.name) : patient.name == null) && (disease != null
		 * ? disease.equals(patient.disease) : patient.disease == null);
		 * 
		 * }
		 */
	}
	public class HospitalMap {       

	public static void main(String[] args) {
		 HashMap<Integer, PatientHM> patientMap = new HashMap<>();

	       
	        patientMap.put(101, new PatientHM(101, "Siri", 25, "Fever"));
	        patientMap.put(102, new PatientHM(102, "Manju", 27, "Cold"));
	        patientMap.put(103, new PatientHM(103, "Karunya", 28, "Diabetes"));
	        patientMap.put(100, new PatientHM(100, "Sri", 41, "Cough"));
	        patientMap.put(99, new PatientHM(99, "Sri", 33, "Cough"));
	     
	        System.out.println("All Registered Patients:");
	        for (Integer id : patientMap.keySet()) {
	            System.out.println(patientMap.get(id));
	        }
	      
	        System.out.println("\nIs patient with ID 102 present " + patientMap.containsKey(102));

	     
	        System.out.println("Is a specific patient object present?");
	        System.out.println(patientMap.containsValue(new PatientHM(103, "Karunya", 40, "Diabetes")));  
	  
	        PatientHM p = patientMap.get(101);
	        System.out.println("\nDetails of patient with ID 101:");
	        System.out.println(p);
	      
	        patientMap.remove(102);
	        System.out.println("\nAfter removing patient with ID 102:");
	        for (Integer id : patientMap.keySet()) {
	            System.out.println(patientMap.get(id));
	        }
	       
	        System.out.println("\nNumber of patients: " + patientMap.size());

	        System.out.println("Is patient list empty? " + patientMap.isEmpty());

	        patientMap.clear();
	        
	        System.out.println("After clearing all patients, size: " + patientMap.size());
	    }

}
	// TODO Auto-generated method stub
		

