package connect4;

public class CpuPiece implements Piece{

	public void place(Board b, int c) {
		int randNum = (int) (Math.random() * ((b.getCols()-1) - 0 + 1) + 0);
		//b.setPiece(randNum, 3);
		b.setPiece(c, 3);
	}

}
