package Wrapperaclasses;
import java.util.ArrayList;

public class StudentMarks {

    public static void main(String[] args) 
    {
        ArrayList<Integer> marksList = new ArrayList<>();

        marksList.add(90);
        marksList.add(76);
        marksList.add(88);
        marksList.add(95);
        System.out.println("Student Marks:");
        for (Integer mark : marksList) {
            System.out.println(mark);
        }
        int sum = 0;
        for (Integer mark : marksList) {
            sum += mark; 
        }

        double average = (double) sum / marksList.size();
        System.out.println("Average Marks: " + average);
    }
}

