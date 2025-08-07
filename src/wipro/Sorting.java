package wipro;
import java.util.*;

public class Sorting 
		{
	    String name;
	    int salary;
	    Sorting(String name, int salary) {
	        this.name = name;
	        this.salary = salary;
	    }
	    public String toString() {
	        return name + "=" + salary;
	    }
	    public static void main(String[] args) {
	        Sorting[] employees = {
	            new Sorting("Siri", 27000),
	            new Sorting("Manju", 30000),
	            new Sorting("Karunya", 45000)
	        };
	        Arrays.sort(employees, (e1, e2) -> Double.compare(e1.salary, e2.salary));
	        for (int i = 0; i < employees.length; i++) {
	            Sorting emp = employees[i];
	            System.out.println(emp);
	        }
	    }
		// TODO Auto-generated method stub
}
