package PatientProject;

public class Health {

	public static void main(String[] args) {
		Patient pnumber1=new Patient(101,"Babu",65,"Blood Pressure");
		Patient pnumber2=new Patient(102,"Smabu",57,"Diabetes-creatin");
		
		PatientSer service=new PatientImp();
		service.registerpatient(pnumber1);
		service.registerpatient(pnumber2);
		service.showdetails(1);
		service.showdetails(2);
		Doctor doc1=new GeneralPhysician("Dr.Mahesh");
		Doctor doc2=new Endocrinologist("Dr.Spandana");
		doc1.diagnosis(pnumber1);
		doc2.diagnosis(pnumber1);
		doc1.diagnosis(pnumber2);
		doc2.diagnosis(pnumber2);
		
		// TODO Auto-generated method stub

	}

}
