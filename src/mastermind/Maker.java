package mastermind;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Maker { //Generates game progress feedback (codes, hints, gameover)
	
	public static ArrayList<String> colors = new ArrayList<String>(Arrays.asList("R", "B", "Y", "G", "O", "P"));
	private static String code = "";
	
	public static String newCode(){ //[TESTED] generates new random code, stores here in "code", returns it
		code = "";
		for (int i=0;i<4;i++){
			code = (code + colors.get(new Random().nextInt(6)));
		}
		return code;
	}
	
	public boolean gameOver(int row, Board board){ //[TESTED] checks for any instance of a game over
		return (correctGuess(row, board) || rowsLimitReached(row, board)) ? true : false;
	}
	
	public boolean rowsLimitReached(int row, Board board){ //[TESTED] checks if current row is 10 or more
		return (board.rows.get(row) != null) ? true : false;
	}
	
	public boolean correctGuess(int row, Board board){ //[TESTED] checks if the guess matches the code
		return (board.rows.get(row)[0] == code) ? true : false;
	}
	
	public static String determineHint(String guess){ //[TESTED] generates a hint for a given guess
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
	
	

