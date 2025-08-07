package PatientProject;

public class GeneralPhysician extends Doctor {
		public GeneralPhysician(String name)
		{
			super(name,"GeneralPhysician");
		}
		public void diagnosis(Patient patient)
		{
			System.out.println("General Physician" + patient.getName());
			System.out.println("Diagnosis" + patient.getProblem());
		}
		// TODO Auto-generated method stub
}
