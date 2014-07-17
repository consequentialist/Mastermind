package mastermind;

public class Runner { //runs the game

	public static void main(String[] args){
		Game game = Setup.newGame(); //create new game instance
		while (!game.maker.gameOver(game.board)){ //gameloop!!!
				game.board.setBoard(game.breaker.guess()); //determine guess and set board
				RenderBoard.drawBoard(game.board); //render the board
		}
		RenderBoard.gameOver();
	}
	
}
