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
    
    

    /**
     *
     * @param r - row position 
     * @param c - column position 
     * @param i - input, varies on the type of piece being placed.
     * @return - true if a player or CPU wins, false otherwise.
     */
        
    public boolean checkWin(int r, int c, int i) { // add , while equal i or free spot
		if(c <= 5) { // checking to the right
			int count = 0;
			int localCol = c;
			while(board[r][localCol] == i || board[r][localCol] == 4  ) {
				localCol++;
				count++;
                                if(count == 5) {
                                    if(i == 2){
                                        System.out.println(" You won to the right.");
					return true;
                                    }
                                    if(i == 3){
                                        System.out.println(" CPU won to the right.");
					return true;
                                    }
					
                                    
				}
                                
                                
			}
                   
		}
		if(c >= 4) { // checking to the left
			int count = 0;
			int localCol = c;
			while(board[r][localCol] == i || board[r][localCol] == 4) {
				localCol--;
				count++;
                                if(count == 5) {
					if(i == 2){
                                        System.out.println(" You won to the left.");
					return true;
                                    }
                                    if(i == 3){
                                        System.out.println(" CPU won to the left.");
					return true;
                                    }
				}
                               
                               
			}
                       
			
		}
		if(r <= 3) { // checking the bottom
			int count = 0;
			int localRow = r;
			while(board[localRow][c] == i || board[localRow][c] == 4) {
				localRow++;
				count++;
                                if(count == 5) {
					if(i == 2){
                                        System.out.println(" You won going down.");
					return true;
                                    }
                                    if(i == 3){
                                        System.out.println(" CPU won going up.");
					return true;
                                    }
				}
			}
			
		}
                if(r <= 3 && c <= 5) { //  checking diagonal bottom-right
			int localRow = r;
			int localCol = c;
			int count = 0;
			while(board[localRow][localCol] == i || board[localRow][localCol] == 4) {
                            System.out.println("made it to the bottom right loop");
				localRow++;
				localCol++;
				count++;
				if(count == 5) {
					if(i == 2){
                                        System.out.println(" You won to the bottom right.");
					return true;
                                    }
                                    if(i == 3){
                                        System.out.println(" CPU won to the bottom right.");
					return true;
                                    }
				}
                                
                                
                                
				
			}
                    
		}
                if(r <= 3 && c >= 4) { //  checking diagonal bottom-left
			int localRow = r;
			int localCol = c;
			int count = 0;
			while(board[localRow][localCol] == i || board[localRow][localCol] == 4) {
                            System.out.println("made it to the bottom left loop");
                            System.out.println("row: " + localRow + "col: " + localCol);
				localRow++;
				localCol--;
				count++;
				if(count == 5) {
					if(i == 2){
                                        System.out.println(" You won to the bottom left.");
					return true;
                                    }
                                    if(i == 3){
                                        System.out.println(" CPU won to the bottom left.");
					return true;
                                    }
				}
                                
                                
				
			}
                       
		}
                
                if(r >= 4 && c <= 5) { //  checking diagonal top-right
                        System.out.println("made it this far");
			int localRow = r;
                        int localCol = c;
                        System.out.println("row: " + localRow + " col: " + localCol);
			int count = 0;
			while(board[localRow][localCol] == i || board[localRow][localCol] == 4) {
                            System.out.println("made it to the top right loop");
                            System.out.println("row: " + localRow + " col: " + localCol);
				localRow--;
				localCol++;
				count++;
				if(count == 5) {
					if(i == 2){
                                        System.out.println(" You won to the top right.");
					return true;
                                    }
                                    if(i == 3){
                                        System.out.println(" CPU won to the top right.");
					return true;
                                    }
				}
                               
                                
				
			}
                       
		}
                if(r >= 4 && c >= 4) { //  checking diagonal top-left
			int localRow = r;
			int localCol = c;
			int count = 0;
			while(board[localRow][localCol] == i || board[localRow][localCol] == 4) {
                            System.out.println("made it to the top left loop");
                            System.out.println("row: " + localRow + "col: " + localCol);
				localRow--;
				localCol--;
				count++;
				if(count == 5) {
					if(i == 2){
                                        System.out.println(" You won to the top left.");
					return true;
                                    }
                                    if(i == 3){
                                        System.out.println(" CPU won to the top left.");
					return true;
                                    }
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
                     if(checkWin(r,c,i)){
                         return true;
                     }
                 }
                 
                 
                 
             }
         }
         return false;
     }
   

    /**
     * Printing the game board out in the console as an integer array.
     */
    public void printBoard() {
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < cols; c++) {
				System.out.print(board[r][c] + "   ");
			}
			System.out.println("\n");
		}
			
		
		
	}
   

    /**
     * Making sure all the values in the integer board array are equal to 0 so 
     * our functions work as intended.
     */
    public void setBoard() {
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < cols; c++) {
				board[r][c] = 0;
			}
		}
		
	}
    
    /**
     *
     * @param col - intended column position, the code figures out the position of the 
     * row by itself.
     * @param i - input to put into the integer array of the game board, which varies
     * upon what piece is being placed.
     */
    public void setPiece(int col, int i) {
		 int fixedcol = col;
        int rowcount = -1;
        for(int r = 0; r < rows; r++)
            if(board[r][fixedcol]==0)
                rowcount++;
        if(rowcount != -1) {
            board[rowcount][fixedcol]=i;
            if(superCheckWin())
                 //System.exit(0);
                System.out.println("gg.");
        }
        else
            System.out.println("you have reach the top of the column");
           
    }

    

    /**
     *
     * @return - rows, which is equal to the number of rows in the game board array.
     */
    public int getRows() {
		return rows;
	}
    /**
     *
     * @param col - intended column position
     * @return - 
     */
    public int getLocalRows(int col){
           
        int fixedcol = col;
        int rowcount = -1;
        for(int r = 0; r < rows; r++)
            if(board[r][fixedcol]==0)
                rowcount++;
        if(rowcount == -1) {
            System.out.println("you've reached the top of the column");
        }
        
        return rowcount;
    
    }

    /**
     *
     * @return - cols, the amount of columns in the game board array.
     */
    public int getCols() {
		return cols;
	}
}
