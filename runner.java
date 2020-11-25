package connect4;

public class runner {

	public static void main(String[] args) {
		Connect6Board gameBoard = new Connect6Board();
		PlayerPiece pPiece = new PlayerPiece();
		gameBoard.setBoard();
		pPiece.place(gameBoard, 5, 5);
		pPiece.place(gameBoard, 4, 4);
		pPiece.place(gameBoard, 3, 3);
		pPiece.place(gameBoard, 2, 2);
		pPiece.place(gameBoard, 1, 1);
		pPiece.place(gameBoard, 0, 0);
		gameBoard.checkWin(5, 5);
		gameBoard.printBoard();

	}

}
