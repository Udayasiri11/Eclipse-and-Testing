package PatientProject;

public class Patient {
		private int id;
		private String name;
		private int age;
		private String problem;
		
		public Patient(int id,String name,int age, String problem)
		{
			this.id=id;
			this.name=name;
			this.age=age;
			this.problem=problem;
		}
		public int getId()
		{
			return id;
		}
		public String getName()
		{
			return name;
		}
		public int getAge()
		{
			return age;
		}
		public String getProblem()
		{
			return problem;
		}
			// TODO Auto-generated method stub
}
