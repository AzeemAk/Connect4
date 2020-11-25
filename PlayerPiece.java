package connect4;

public class PlayerPiece implements Piece {

	public void place(Board b, int r, int c) {
		b.setPiece(r, c, 2);
		
	}

	

}
