package PatientProject;

public class PatientImp implements PatientSer{
    private Patient[] patients = new Patient[20];
    public void registerPatient(Patient patient) {
        int id = patient.getId();
        if (id >= 0 && id < patients.length) {
            patients[id] = patient;
            System.out.println("Patient " + patient.getName() + " registered.");
        } else {
            System.out.println("Invalid patient ID.");
        }
    }
    public void showdetails(int patientId) {
        if (patientId >= 0 && patientId < patients.length) {
            Patient p = patients[patientId];
            if (p != null) {
                System.out.println("ID: " + p.getId());
                System.out.println("Name: " + p.getName());
                System.out.println("Age: " + p.getAge());
                System.out.println("Illness: " + p.getProblem());
            } else {
                System.out.println("Patient not found");
            }
        } else {
            System.out.println("Invalid patient ID.");
        }
    }
	@Override
	public void registerpatient(Patient patient) {
		// TODO Auto-generated method stub
		
	}	
}
		// TODO Auto-generated method stub
