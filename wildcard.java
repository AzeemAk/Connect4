package GroupProject;

public class wildcard implements Piece{

	@Override
	public void place(Board b, int c) {
		// TODO Auto-generated method stub
		int randNum = (int) (Math.random() * ((b.getCols()-1) - 0 + 1) + 0);
		b.setPiece(randNum, 4);
	}
}
