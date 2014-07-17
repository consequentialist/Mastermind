package mastermind;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class SmartAI { // A much smarter CodeBreaker

	int white;
	public static ArrayList<String> spot1list = new ArrayList<String>(Arrays.asList("R", "B", "Y", "G", "O", "P"));
	public static ArrayList<String> spot2list = new ArrayList<String>(Arrays.asList("R", "B", "Y", "G", "O", "P"));
	public static ArrayList<String> spot3list = new ArrayList<String>(Arrays.asList("R", "B", "Y", "G", "O", "P"));
	public static ArrayList<String> spot4list = new ArrayList<String>(Arrays.asList("R", "B", "Y", "G", "O", "P"));
	public static String guess;
	public static String excess;
	
	public static String randomIndex(){ 
		int idx = new Random().nextInt(spot1list.size());
		String choice = spot1list.get(idx);
		spot1list.remove(idx);
		return choice;
	}
	
	public static String initialGuess(){ //tested
		String spot1 = (randomIndex()); 
		String spot2 = (randomIndex());
		String spot3 = (randomIndex());
		String spot4 = (randomIndex());
		String spot5 = (randomIndex());
		String spot6 = (randomIndex());
		excess = (spot5 + spot6);
		spot1list = spot2list;
		guess = (spot1 + spot2 + spot3 + spot4);
		return guess;	
	}
	
	public static int numberWrong(String hint){ //tested
		int wrong = 0;
		for(int i=0; i<hint.length(); i++ ) {
		    if(hint.charAt(i) == '0' ) {
		        wrong++;
		    } 
		}
		return wrong;
	}
	
	public static void makeGuess(String excess){
		if(numberWrong(guess) > 2){
			guess = (guess + excess);
		}
	}
	
//	public static void updateSpotlist(String hint){
//		if (hint.charAt(0) == newpoint) {
//			spot1list = spotlist.remove(x||N)
//		}
//	}
	
}
