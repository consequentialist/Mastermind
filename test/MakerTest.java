import static org.junit.Assert.*;
import mastermind.Maker;
import mastermind.Board;

import org.junit.Test;


public class MakerTest {

	@Test
	public void newcode() { //maker generates random new code
		
		Maker maker = new Maker();
		assertTrue(maker.newCode().matches(".*[RBYGOP].*"));
	}
	
	@Test
	public void newcodelength() { //maker generates new 4-color code
		System.out.println("test");
		Maker maker = new Maker();
		System.out.println(maker.newCode());
		assertEquals(4, maker.newCode().length());
	}
	
	
	@Test
	public void generatehint() { //maker generates hint for guess
		
		Maker maker = new Maker();
		String code = maker.newCode();
		assertEquals("2222", maker.determineHint(code));
	}
	
	@Test
	public void gameoverguess() { //maker generates gameover for correct guess
		
		Maker maker = new Maker();
		Board board = new Board();
		String code = maker.newCode();
		board.rows.put(1, new String[] {code, "2222"});
		assertEquals(true, maker.gameOver(1, board));
	}
	
	@Test
	public void gameoverlimit() { //maker generates gameover for final guess
		
		Maker maker = new Maker();
		Board board = new Board();
		String code = maker.newCode();
		board.rows.put(10, new String[] {"FFFF", "0000"});
		assertEquals(true, maker.gameOver(10, board));
	}

}
