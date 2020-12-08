/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author azeem
 */
public interface Piece {
    public void place(Board b, int c);              //fuctions to either place a piece in a certain spot or in a random spot.
    public int randomPlace(Board b);
}
