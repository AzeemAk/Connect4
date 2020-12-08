package GroupProject;

public class PlayerPiece implements Piece {

	public void place(Board b, int c) {
		b.setPiece(c, 2);
	}
}