/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author azeem
 */
public abstract class Board {
    private int rows;
    private int cols;
    private int[][] board;
    public abstract void setBoard();
    public abstract int[][] getBoard();
    public abstract boolean checkWin(int r, int c, int i);
    public abstract void printBoard();
    public abstract void setPiece(int c, int i);
    public abstract int getRows();
    public abstract int getCols();
  
}
