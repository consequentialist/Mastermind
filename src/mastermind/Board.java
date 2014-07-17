package mastermind;
import java.util.HashMap;


public class Board { // holds the board, sets the board, moves down a row (Find somewhere else to generate hint)
	
	private int row = 1;

	public HashMap<Integer, String[]> rows;

	public Board(){
		this.rows = new HashMap<Integer, String[]>();
	}
	
	public void setBoard(String guess){
		this.rows.put(row, new String[] {"G:"+ guess,"H:"+ Maker.determineHint(guess)}); //THIS DOESNT NEED TO KNOW ABOUT MAKER!!!!!!!
		row ++;
	}
	
	public int getRow(){
		return row;
	}
	
}
