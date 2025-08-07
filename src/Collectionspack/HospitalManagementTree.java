package Collectionspack;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;
class PatientHMTree {
	private int id;
    private String name;
    private int age;
    private String disease;

    public PatientHMTree(int id, String name, int age, String disease) {
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
}
    

public class HospitalManagementTree {

	public static void main(String[] args) {
		TreeMap<Integer, PatientHMTree> patientMap = new TreeMap<>();
        patientMap.put(101, new PatientHMTree(101, "Siri", 25, "Fever"));
        patientMap.put(102, new PatientHMTree(102, "Manju", 30, "Cold"));
        patientMap.put(105, new PatientHMTree(105, "Karunya", 40, "Diabetes"));
        patientMap.put(100, new PatientHMTree(100, "Sri", 41, "Cough"));
        patientMap.put(99, new PatientHMTree(99, "Sri", 33, "Cough"));
        patientMap.put(98, new PatientHMTree(98, "Sri", 32, "Cough"));
        
        System.out.println("Sorted Patient List:");//method 1 for sorting
        for(Map.Entry<Integer, PatientHMTree>entry: patientMap.entrySet())
        {
        System.out.println("ID:" + entry.getKey() + "->" + entry.getValue());
        }
        
        System.out.println("\nAll Registered Patients:");
        for (Integer id : patientMap.keySet()) {//method 2 for showing all registered patients
            System.out.println(patientMap.get(id));
        }
        
        System.out.println("\nDescending Patient List:");//method 3 for descending
        NavigableMap<Integer, PatientHMTree> descMap=patientMap.descendingMap();
        for(Entry<Integer, PatientHMTree> entry: descMap.entrySet())
        {
        System.out.println("ID: " + entry.getKey() + "->" + entry.getValue());
        }
        
        System.out.println("\nIs patient with ID 102 present " + patientMap.containsKey(102));//method 4 for checking value is present or not
        
        //System.out.println(patientMap.containsValue(new PatientHM(103, "Karunya", 40, "Diabetes")));  
  
        PatientHMTree p = patientMap.get(101);//method 5 to get the details of that key
        System.out.println("\nDetails of patient with ID 101:");
        System.out.println(p);
        
        System.out.println("\nCeiling key for 104: " + patientMap.ceilingKey(104));//method 6 equal or greatest greater number
        
        System.out.println("\nFloor key for 104: " + patientMap.floorKey(104));//method 7 equal or greatest lesser number
        
        System.out.println("\nHigher key for 101: " + patientMap.higherKey(101));//method 8 only next greater no equal
        
        System.out.println("\nLower key for 101: " + patientMap.lowerKey(101));//method 9 only previous lesser no equal
        
        System.out.println("\nHead map: " + patientMap.headMap(100));//method 10 for all lesser map details 
        
        System.out.println("\nTail map: " + patientMap.tailMap(100));//method 11 for all greater map details
      
        patientMap.remove(102);//method 12 for removing 
        System.out.println("\nAfter removing patient with ID 102:");
        for (Integer id : patientMap.keySet()) {
            System.out.println(patientMap.get(id));
        }
       
        System.out.println("\nNumber of patients: " + patientMap.size());//method 13 for size of map

        System.out.println("\nIs patient list empty? " + patientMap.isEmpty());//method 14 for checking
        
        System.out.println("\nFirst patient ID: " + patientMap.firstKey());//method 15 for first key
        
        System.out.println("\nLast patient ID: " + patientMap.lastKey());//method 16 last key
        
        System.out.println("\nBefore clearing all patients, size: " + patientMap.size());

        patientMap.clear();//method 17 for clearing the map
        
        System.out.println("\nAfter clearing all patients, size: " + patientMap.size());
    	}
}

// TODO Auto-generated method stub
	


