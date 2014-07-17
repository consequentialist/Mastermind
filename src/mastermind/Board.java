package mastermind;
import java.util.HashMap;


public class Board { // holds the board, sets the board, moves down a row (Find somewhere else to generate hint)
	

	public HashMap<Integer, String[]> rows;

	public Board(){
		this.rows = new HashMap<Integer, String[]>();
	}
	
	public void setBoard(int row, String guess, String hint){ //[TESTED] sets the board @row with given guess
		this.rows.put(row, new String[] {guess, hint}); //THIS DOESNT NEED TO KNOW ABOUT MAKER!!!!!!!
	}
	
	
}
