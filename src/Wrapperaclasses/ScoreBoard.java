package Wrapperaclasses;
import java.util.*;
//import java.util.Scanner;
//import java.util.HashMap;
//import java.util.ArrayList;
public class ScoreBoard {

	public static void main(String[] args) {
		        HashMap<String, Integer> scoreMap = new HashMap<>();
		        scoreMap.put("Siri", 50);
		        scoreMap.put("Manju", 70);
		        scoreMap.put("Karunya", 60);
		        scoreMap.put("Gayathri", 80);
		        ArrayList<String> playerList = new ArrayList<>();
		        playerList.add("Siri");
		        playerList.add("Manju");
		        playerList.add("Karunya");
		        playerList.add("Gayathri");
		        Scanner scanner = new Scanner(System.in);
		        for (int i = 0; i < playerList.size(); i++) {
		            String player = playerList.get(i);
		            System.out.print("Enter updated score for " + player + ": ");
		            int updatedScore = scanner.nextInt(); 
		            scoreMap.put(player, updatedScore);    
		        }
		        System.out.println("\nUPDATED SCOREBOARD:");
		        for (int i = 0; i < playerList.size(); i++) {
		            String player = playerList.get(i);
		            Integer score = scoreMap.get(player);
		            System.out.println(player + ": " + score);
		        }
		        scanner.close();
		    }

		// TODO Auto-generated method stub
}
