package mastermind;

public class Game { // job is to hold code, breaker, run board.
	
	private static String code;
	public Breaker breaker; //make these private, include method to return
	public Board board;
	public Maker maker;
	
	public Game(String newcode, Breaker breaker){
		code = newcode;
		this.breaker = breaker;
		this.board = new Board();
		this.maker = new Maker();
	}
	
	public Maker maker(){
		return this.maker;
	}
	
	public Board board(){
		return this.board;
	}
	
	public Breaker breaker(){
		return this.breaker;
	}
	
	public String code(){
		return code;
	}
	


	
	
	
	
	
	
	
//	public static void gameloop(){
//		while ((guess != code) && (row <= 10)){
//			board.put(row, Players.getGuess(realbreaker, board, hintmap));
////			RenderBoard.update(board, hintmap);
//			hintmap.put(row, Players.getHint(realmaker, board.get(row) ) );
////			RenderBoard.update(board, hintmap);
//			row ++;
//			
//		}
//	}
	
//	public static void main(){
//		Console console = System.console();
//		String input = console.readLine("Type 'm' to be the codemaker, or 'b' to be the codebreaker");
//		if(input == "m"){
//			code = console.readLine("Enter your code (4 characters from: R, O, Y, G, B, P)");
//			guess = AI.guess();
//			out.println("Computer guesses... " + guess);
//			out.println("The hint is... " + guess);
//		}
//	}
}
