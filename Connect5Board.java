/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author azeem
 */
public class Connect5Board extends Board {
    private int rows = 8;
	private int cols = 10;
	private PlayerPiece pPiece;
	private CpuPiece cPiece;
	private int[][] board = new int[rows][cols];
	public boolean checkWin(int r, int c, int i) { 
		if(c <= 4) { // checking to the right
			int count = 0;
			int localCol = c;
			while(board[r][localCol] == i) {
				localCol++;
				count++;
				if(count == 6) {
					System.out.println("won to the right.");
					return true;
				}
			}
			
		}
		if(c >= 5) { // checking to the left
			int count = 0;
			int localCol = c;
			while(board[r][localCol] == i) {
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
			while(board[localRow][c] == i) {
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
			while(board[localRow][c] == i) {
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
			while(board[localRow][localCol] == i) {
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
			while(board[localRow][localCol] == i) {
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
			while(board[localRow][localCol] == i) {
				localRow--;
				localCol++;
				count++;
				if(count == 6) {
					System.out.println("won going up and right.");
					return true;
				}
				
			}
		}
		if(r >= 5 && c >= 5) { //  checking diagonal top-left
			int localRow = r;
			int localCol = c;
			int count = 0;
			while(board[localRow][localCol] == i) {
				localRow--;
				localCol--;
				count++;
				if(count == 6) {
					System.out.println("won going up and left.");
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
	public void setPiece(int c, int i) {
		int localRows = 0;
		for(int k = 0; k < rows; k++) {
			if(localRows < rows - 1 && board[localRows][c] == 0 ) {
				localRows++;
				System.out.println(localRows);
			}
		}
		if(localRows == 0 && board[localRows][c] == 0 ) {
			board[localRows][c] = i;
			
			System.out.println("made it to loop 1");
			checkWin(localRows, c, i);
		}
		else if(localRows < rows &&  board[localRows][c] == 0 ) {
			board[localRows][c] = i;
			
			System.out.println("made it to loop 2");
			checkWin(localRows, c, i);
			
		}
		else if(board[localRows][c] != 0) {
			board[localRows - 1][c] = i;
			
			System.out.println("made it to loop 3");
			checkWin(localRows - 1, c, i);
		}
		else {
			System.out.println("local rows = " + localRows);
			System.out.println("Invalid move. Make another move.");
		}
	}
	public PlayerPiece getPiece() {
		return pPiece;
	}
	public int getRows() {
		return rows;
	}
        public int getLocalRows(int c){
            int lRows = 0;
            while(board[lRows][c] == 0){
                lRows++;
                if(lRows == 7){
                    break;
                }
            }
            if(board[lRows][c] != 0){
                return lRows;
            }
            
            System.out.println("Local Rows = " + lRows);
            return lRows + 1;
            
        }
    public int getCols() {
		return cols;
	}
}
