package mastermind;

// AI ONLY GUESSES!!! Hints are handled by the hint class.



public class AI implements Breaker {
// Red = R, Blue = B, Yellow = Y, Green = G, Orange = O, Purple = P
	
	public String guess(){
		return Maker.newCode();
	}
	
	
}
