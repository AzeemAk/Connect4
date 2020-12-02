/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author azeem
 */
public class PlayerPiece implements Piece{
    public void place(Board b, int c) {
		b.setPiece(c, 2);
		
	}
}
