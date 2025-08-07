package PatientProject;

public abstract class Doctor
{
	protected String name;
	protected String specialization;
	public Doctor(String name,String specialization)
	{
		this.name=name;
		this.specialization=specialization;
	}
	public abstract void diagnosis(Patient patient);
		// TODO Auto-generated method stub22
}
