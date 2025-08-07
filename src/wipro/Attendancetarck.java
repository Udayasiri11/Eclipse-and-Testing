package wipro;

public class Attendancetarck {

	public static void main(String[] args) {
		        String[] students = {"Siri", "Manju", "Laxmi", "Karunya"};
		        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		        char[][] attendance = {
		            {'P', 'A', 'P', 'P', 'P', 'A', 'P'}, 
		            {'P', 'P', 'A', 'P', 'P', 'P', 'P'},
		            {'A', 'P', 'P', 'A', 'P', 'P', 'A'},  
		            {'P', 'P', 'P', 'P', 'A', 'P', 'P'}   
		        };
		        System.out.print("Student\t");
		        for (String day : days) {
		            System.out.print(day + "\t");
		        }
		        System.out.println();
		        for (int i = 0; i < students.length; i++) {
		            System.out.print(students[i] + "\t");
		            for (int j = 0; j < days.length; j++) {
		                System.out.print(attendance[i][j] + "\t");
		            }
		            System.out.println();
		        }
		    }
	}


