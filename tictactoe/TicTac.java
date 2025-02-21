package tictactoe;

public class TicTac {
	public TicTac() {
		startGame start = new startGame();
		start.GameStart();
		
		play game = new play();
		game.playGame();
	}
	
	public static void main(String[] args) {
		new TicTac();
	}
}
