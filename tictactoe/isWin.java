package tictactoe;

public class isWin {
	public isWin() {
		
	}
	
	public boolean valWin(char board[][]) {
		for (int i = 1; i <= 3; i++) {
            if (board[i][1] != '_' && board[i][1] == board[i][2] && board[i][2] == board[i][3]) return true; // Row check
            if (board[1][i] != '_' && board[1][i] == board[2][i] && board[2][i] == board[3][i]) return true; // Column check
        }

        // Check diagonals
        if (board[1][1] != '_' && board[1][1] == board[2][2] && board[2][2] == board[3][3]) return true;
        if (board[1][3] != '_' && board[1][3] == board[2][2] && board[2][2] == board[3][1]) return true;

        return false;
	}
	
}
