package mastermind;

public class Setup { // sets up game (gets a code, determines breaker)

	public static Game newGame(){ //return new instance of Game with a new code/breaker combo.
		return new Game(determineCode(), determineBreaker());
	}
	
	public static Breaker determineBreaker(){ // get breaker type (human or AI).
		String input = System.console().readLine("Do you want the CodeBreaker to be a human? Type 'y' for YES or 'n' for NO");
		if(input.toLowerCase() == "y"){
			return new Human();	
		}
		else{
			return new AI();
		}
	}
	
	public static String determineCode(){ // get code from user or generate one. (maybe split into 2 methods)
		String input = System.console().readLine("Do you want the CodeMaker to be a human? Type 'Y' for YES or 'N' for NO");
		if(input.toLowerCase() == "y"){
		return System.console().readLine("Choose four colors for a new code(Red = R, Blue = B, Yellow = Y, Green = G, Orange = O, Purple = P):");
		}
		else{
			return Maker.newCode(); //AAHHHH! newCode doesnt really fit anywhere
		}
	}
	
	
	
	
}
