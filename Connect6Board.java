package connect4;

public class Connect6Board extends Board {
	private int rows = 8;
	private int cols = 10;
	private PlayerPiece pPiece;
	private CpuPiece cPiece;
	private int[][] board = new int[rows][cols];
	public boolean checkWin(int r, int c) { 
		if(c <= 4) { // checking to the right
			int count = 0;
			int localCol = c;
			while(board[r][localCol] == 2) {
				localCol++;
				count++;
				if(count == 6) {
					System.out.println("won to the left.");
					return true;
				}
			}
			
		}
		if(c >= 5) { // checking to the left
			int count = 0;
			int localCol = c;
			while(board[r][localCol] == 2) {
				localCol--;
				count++;
				if(count == 6) {
					System.out.println("won to the left.");
					return true;
				}
			}
			
		}
		if(r >= 5) { // checking the top 
			
			int count = 0;
			int localRow = r;
			System.out.println(r + " " + c);
			while(board[localRow][c] == 2) {
				localRow--;
				count++;
				if(count == 6) {
					System.out.println("won going up.");
					return true;
				}
			}
			
		}
		if(r <= 2) { // checking the bottom
			int count = 0;
			int localRow = r;
			System.out.println(r + " " + c);
			while(board[localRow][c] == 2) {
				localRow++;
				count++;
				if(count == 6) {
					System.out.println("won going down.");
					return true;
				}
			}
			
		}
		if(r <= 2 && c <= 4) { //  checking diagonal bottom-right
			int localRow = r;
			int localCol = c;
			int count = 0;
			while(board[localRow][localCol] == 2) {
				localRow++;
				localCol++;
				count++;
				if(count == 6) {
					System.out.println("won going down and right.");
					return true;
				}
				
			}
		}
		if(r <= 2 && c >= 5) { //  checking diagonal bottom-left
			int localRow = r;
			int localCol = c;
			int count = 0;
			while(board[localRow][localCol] == 2) {
				localRow++;
				localCol--;
				count++;
				if(count == 6) {
					System.out.println("won going down and left.");
					return true;
				}
				
			}
		}
		if(r >= 5 && c <= 4) { //  checking diagonal top-right
			int localRow = r;
			int localCol = c;
			int count = 0;
			while(board[localRow][localCol] == 2) {
				localRow--;
				localCol++;
				count++;
				if(count == 6) {
					System.out.println("won going up and right.");
					return true;
				}
				
			}
		}
		if(r >= 5 && c <= 5) { //  checking diagonal top-left
			int localRow = r;
			int localCol = c;
			int count = 0;
			while(board[localRow][localCol] == 2) {
				localRow--;
				localCol--;
				count++;
				if(count == 6) {
					System.out.println("won going up and left.");
					return true;
				}
				
			}
		}
		System.out.println("Too bad.");
		return false;
		
	}
	public void printBoard() {
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < cols; c++) {
				System.out.print(board[r][c] + "   ");
			}
			System.out.println("\n");
		}
			
		
		
	}
	public void setBoard() {
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < cols; c++) {
				board[r][c] = 1;
			}
		}
		
	}
	public int[][] getBoard() {
		return board;
		
	}
	public void setPiece(int r, int c, int i) {
		board[r][c] = i;
	}
	public PlayerPiece getPiece() {
		return pPiece;
	}

}
