package OOPs;

public class Patient {

	public static void main(String[] args) {
		        Patientex patient1 = new Patientex();
		        patient1.setId(101);
		        patient1.setName("Siri");
		        patient1.setAge(23);
		        patient1.setDisease("Fever");
		        System.out.println("Patient ID     : " + patient1.getId());
		        System.out.println("Patient Name   : " + patient1.getName());
		        System.out.println("Patient Age    : " + patient1.getAge());
		        System.out.println("Health Issue   : " + patient1.getDisease());
		    }
}

