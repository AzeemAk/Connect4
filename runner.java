package connect4;

public class runner {

	public static void main(String[] args) {
		Connect6Board gameBoard = new Connect6Board();
		PlayerPiece pPiece = new PlayerPiece();
		CpuPiece cPiece = new CpuPiece();
		gameBoard.setBoard();
		pPiece.place(gameBoard, 5);
		cPiece.place(gameBoard, 5);
		pPiece.place(gameBoard, 5);
		cPiece.place(gameBoard, 5);
		pPiece.place(gameBoard, 5);
		cPiece.place(gameBoard, 5);
		pPiece.place(gameBoard, 5);
		cPiece.place(gameBoard, 5);
		pPiece.place(gameBoard, 5);
		cPiece.place(gameBoard, 5);
		pPiece.place(gameBoard, 5);
		gameBoard.checkWin(7,5);
		gameBoard.printBoard();
		
	}

}
