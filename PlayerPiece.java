/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author azeem
 */
public class PlayerPiece implements Piece{           //changing the integer input of each piece to a certain number
    public void place(Board b, int c) {              // so we can keep track of who owns a certain piece.
		b.setPiece(c, 2);
		
	}
    public int randomPlace(Board b){
        int randNum = (int) (Math.random() * ((b.getCols()-1) - 0 + 1) + 0);
        b.setPiece(randNum, 2);

        return randNum + 1;
    }
}
