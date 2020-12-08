/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author azeem
 */
public class FreePiece implements Piece {
    public void place(Board b, int c){                                     //changing the integer input of each piece to a certain number
        b.setPiece(c, 4);                                                  // so we can keep track of who owns a certain piece.
         
    }
    public int randomPlace(Board b){
        int randNum = (int) (Math.random() * ((b.getCols()-1) - 0 + 1) + 0);
	b.setPiece(randNum, 4);
        return randNum + 1;
    }
}