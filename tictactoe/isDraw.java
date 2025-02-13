package tictactoe;

public class isDraw {
	public isDraw(){
		
	}
	
	public boolean valDraw(char board[][]) {
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 4; j++) {
				if(board[i][j] == '_') {
					return false;
				}
			}
		}
		return true;
	}
}
