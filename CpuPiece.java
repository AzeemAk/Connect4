package connect4;

public class CpuPiece implements Piece{

	public void place(Board b, int r, int c) {
		b.setPiece(r, c, 2);
		
	}

}
