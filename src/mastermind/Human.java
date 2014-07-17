package mastermind;

public class Human implements Breaker {

	public String guess(){
		return System.console().readLine("Enter Your Guess:");
	}
	
//	public String newCode(){
//		Console console = System.console();
//		return console.readLine("Enter your code (4 characters from: R, O, Y, G, B, P)");	
//	}
	
}
