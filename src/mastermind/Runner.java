package mastermind;

public class Runner { //runs the game

	public static void main(String[] args){
		Game game = Setup.newGame(); //create new game instance
		while (!game.maker.gameOver(game.getRow(), game.board)){ //gameloop!!!
			String guess = game.breaker.guess();
			game.board.setBoard(game.getRow(), guess, game.maker.determineHint(guess)); //determine guess and set board
			RenderBoard.drawBoard(game.board); //render the board
		}
		RenderBoard.gameOver();
	}
	
}
