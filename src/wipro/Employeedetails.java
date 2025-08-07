package wipro;

public class Employeedetails {

	public static void main(String[] args) {
		        int empId1 = 101; //Employee1
		        char[] empName1 = {'R', 'a', 'm'};
		        double empSalary1 = 25000.50;
		        int empId2 = 102; //Employee2
		        char[] empName2 = {'S', 'i', 't', 'a'};
		        double empSalary2 = 30000.75;
		        System.out.println("Employee 1 Details:");
		        System.out.print("ID: " + empId1 + ", Name: ");
		        for (char c : empName1) {
		            System.out.print(c);
		        }
		        System.out.println(", Salary: " + empSalary1);
		        System.out.println("Employee 2 Details:");
		        System.out.print("ID: " + empId2 + ", Name: ");
		        for (char c : empName2) {
		            System.out.print(c);
		        }
		        System.out.println(", Salary: " + empSalary2);
		    }
}      
