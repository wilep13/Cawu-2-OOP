package tictactoe;

public class Board {
	char papan[][];
	public Board(char papan[][]) {
		this.papan = papan;
	}
	
	public void printBoard(char papan[][]) {
		for(int i = 0; i < papan.length; i++) {
			System.out.print("|");
			for (int j = 0; j < papan.length; j++) {
				System.out.print(papan[i][j] + "|");
			}
			System.out.println();
		}
	}
	
	public void input(int x, int y, char papan[][], int move) {
		if(move % 2 == 0) {
			papan[x][y] = 'X';
		} else{
			papan[x][y] = 'O';
		}
		this.papan = papan;
	}
	
	public boolean validate(int x, int y, char papan[][]) {
		if(x < 1 || x > 3 || y < 1 || y > 3 || papan[x][y] == 'X'|| papan[x][y] == 'O') {
			return false;
		}
		return true;
	}
}
