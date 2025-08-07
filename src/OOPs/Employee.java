package OOPs;

public class Employee {
		    private double salary;
		    public void setSalary(double salary) {
		        this.salary = salary;
		    }
		    public double getSalary() {
		        return salary;
		    }
		    public static void main(String[] args) {
		        Employee emp = new Employee();
		        emp.setSalary(45000.50);
		        System.out.println("Employee Salary: ₹" + emp.getSalary());
		    }
		// TODO Auto-generated method stub
}
