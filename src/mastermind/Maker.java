package mastermind;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Maker { //Generates game progress feedback (codes, hints, gameover)
	
	public static ArrayList<String> colors = new ArrayList<String>(Arrays.asList("R", "B", "Y", "G", "O", "P"));
	private static String code = "";
	
	public static String newCode(){ //generates new random code, stores here in "code", returns it
		for (int i=0;i<=4;i++){
		code = (code + colors.get(new Random().nextInt(6)));
		}
		return code;
	}
	
	public boolean gameOver(Board board){ //checks for any instance of a game over
		return (correctGuess(board) || rowsLimitReached(board)) ? true : false;
	}
	
	public boolean rowsLimitReached(Board board){ //checks if current row is 10 or more
		return (board.getRow() >= 10) ? true : false;
	}
	
	public boolean correctGuess(Board board){
		return (board.rows.get(board.getRow())[0] == code) ? true : false; // checks if guess at current row is the code
	}
	
	
	public static String determineHint(String guess){ // generates a hint for a given guess
		String hint = "";
		for(int i=0; i<4; i++ ) {
		    if(code.charAt(i) == guess.charAt(i) ) {
		        hint = (hint + "2");
		    }
		    else {
		    	hint = (code.contains(String.valueOf(guess.charAt(i)))) ? (hint + "1") : (hint + "0");
		    }
		}
		return hint;
	}
}
	
	

