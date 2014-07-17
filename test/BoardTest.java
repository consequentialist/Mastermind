import static org.junit.Assert.assertEquals;
import mastermind.Board;
import mastermind.Maker;

import java.util.HashMap;

import org.junit.Test;



public class BoardTest {
	@Test
	public void setguess() { //Board can set a guess
		
		Board board = new Board();
		Maker maker = new Maker();
		maker.newCode();
		
		HashMap<Integer, String[]> boardmap = new HashMap<Integer, String[]>();
		boardmap.put(1, new String[] {"G:"+ "RRGG","H:" + maker.determineHint("RRGG") });
		board.setBoard(1,"RRGG", maker.determineHint("RRGG"));
		
		assertEquals("RRGG", board.rows.get(1)[0]);
	}
	
}
