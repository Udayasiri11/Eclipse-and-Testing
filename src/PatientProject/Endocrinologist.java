package PatientProject;

public class Endocrinologist extends Doctor {
	public Endocrinologist(String name)
	{
		super(name,"Endocrinologist");
	}
	public void diagnosis(Patient patient)
	{
		System.out.println("Endocrinologist" + patient.getName());
		if(patient.getProblem().contains("Diabetis-creatin"))
		{
			System.out.println("Diabetes-creatin problem");
		}
		else
		{
			System.out.println("No issue:Go with general physician");
		}
	}
		// TODO Auto-generated method stub
	
}
