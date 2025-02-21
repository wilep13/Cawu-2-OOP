package tictactoe;
import java.util.Scanner;

public class play {
	public static Scanner scanner = new Scanner(System.in);
	public static char papan[][] = {
			{' ', '1', '2', '3'},
			{'1', '_','_','_'},
			{'2', '_','_','_'},
			{'3', '_','_','_'}
	};
	
	public play() {
		
	}
	
	public void playGame() {
		int x, y;
		boolean win = false;
		boolean draw = false;
		boolean valid = false;
		int move = 0;
		
		Board board = new Board(papan);
		
		do {
			board.printBoard(papan);
			do {
				System.out.println("Please input the coordinate [row column] must number: ");
				
				if(move % 2 == 0) {
					System.out.println("Player 1 [x]");
				} else {
					System.out.println("Player 2 [O]");
				}
				
				x = scanner.nextInt();
				y = scanner.nextInt();
				valid = board.validate(x, y, papan);
				
				if(!valid) {
					System.out.println("You cannot input in this !!!");
				}
			}while(!valid);
			
			board.input(x, y, papan, move);
			move++;
			
			isDraw seri = new isDraw();
			draw = seri.valDraw(papan);
			
			isWin menang = new isWin();
			win =  menang.valWin(papan);
			
		}while(move < 9 && !win && !draw);
		
		board.printBoard(papan);
		if(win) {
			if(move % 2 == 0) {
				System.out.println("Player 2 [O] Win");
			} else {
				System.out.println("Player 1 [X] Win");
			}
		}
		
		if(draw && !win) {
			System.out.println("GAME DRAW");
		}
		
		
	}
}
