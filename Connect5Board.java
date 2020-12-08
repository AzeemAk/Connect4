package GroupProject;

public class Connect5Board extends Board {
    private int rows = 8;
	private int cols = 10;
	private int cpurow =0;
	private int cpucol = 0;
	private PlayerPiece pPiece;
	private int[][] board = new int[rows][cols];
	private int countpiece; 
	public boolean checkWin(int r, int c, int i) { 
		if(c <= 6) { // checking to the right
			int count = 0;
			int localCol = c;
			while(board[r][localCol] == i||board[r][localCol] == 4) {
				localCol++;
				count++;
				if(count == 5) {
					System.out.println("won to the right.");
					return true;
				}
			}
		}
		if(c >= 4) { // checking to the left
			int count = 0;
			int localCol = c;
			int fixedcol = c;
			while(board[r][localCol] == i||board[r][localCol] == 4) {
				localCol--;
				count++;
				if(count == 5) {
					System.out.println("won to the left.");
					return true;
				}
				else if(count == 4 && board[r][fixedcol+1] == i){
					System.out.println("winner");
					return true;
				}
			}
		}
		if(r <= 3) { // checking the bottom
			int count = 0;
			int localRow = r;
			while(board[localRow][c] == i||board[localRow][c] == 4) {
				localRow++;
				count++;
				if(count == 5) {
					System.out.println("won going down.");
					return true;
				}
			}
		}
		if(r <= 3 && c <= 5) { //  checking diagonal bottom-right
			int localRow = r;
			int localCol = c;
			int count = 0;
			while(board[localRow][localCol] == i||board[localRow][localCol] == 4) {
				localRow++;
				localCol++;
				count++;
				if(count == 5) {
					System.out.println("won going down and right.");
					return true;
				}
			}
		}
		if(r <= 3 && c >= 4) { //  checking diagonal bottom-left
			int localRow = r;
			int localCol = c;
			int count = 0;
			while(board[localRow][localCol] == i||board[localRow][localCol] == 4) {
				localRow++;
				localCol--;
				count++;
				if(count == 5) {
					System.out.println("won going down and left.");
					return true;
				}
			}
		}
		if(r >= 4 && c <= 5) { //  checking diagonal top-right
			int localRow = r;
			int localCol = c;
			int count = 0;
			while(board[localRow][localCol] == i||board[localRow][localCol] == 4) {
				localRow--;
				localCol++;
				count++;
				if(count == 5) {
					System.out.println("won going up and right.");
					return true;
				}
			}
		}
		if(r >=4 && c >= 4) { //  checking diagonal top-left
			int localRow = r;
			int localCol = c;
			int count = 0;
			while(board[localRow][localCol] == i||board[localRow][localCol] == 4) {
				localRow--;
				localCol--;
				count++;
				if(count == 5) {
					System.out.println("won going up and left.");
					return true;
				}
			}
		}
		return false;
	}
	public boolean superCheckWin(){
        int i;
        for(int c = 0; c < cols; c++){
            for (int r = 0; r < rows; r++){
               if(board[r][c] != 0){
                    i = board[r][c];
                    if(checkWin(r,c,i))
                        return true;
                } 
            }
        }
        return false;
    }
	public void printBoard() {
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < cols; c++) {
				System.out.print(board[r][c] + "   ");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
	}
	public void setBoard() {
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < cols; c++) {
				board[r][c] = 0;
			}
		}
	}
	public int[][] getBoard() {
		return board;
	}
	public void setPiece(int col, int piececode) {
		int fixedcol = col;
		int rowcount = -1;
		for(int r = 0; r < rows; r++)
			if(board[r][fixedcol]==0)
				rowcount++;
		if(rowcount != -1) {
			board[rowcount][fixedcol]=piececode;
		}
		else
			System.out.println("you have reach the top of the column");
		cpurow = rowcount;
		cpucol = fixedcol;
	}
	public PlayerPiece getPiece() {
		return pPiece;
	}
	public int getRows() {
		return rows;
	}
    public int getCols() {
		return cols;
	}
    public boolean checkboardfull() {
    	countpiece ++;
    	if (countpiece== rows * cols)
    		return true;
    	return false;
    }
    public int getCpurow() {
    	return cpurow;
    }
    public int getCpucol() {
    	return cpucol;
    }
}
