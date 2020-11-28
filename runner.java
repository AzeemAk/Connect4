package connect4;

public class runner {

	public static void main(String[] args) {
		Connect6Board gameBoard = new Connect6Board();
		PlayerPiece pPiece = new PlayerPiece();
		CpuPiece cPiece = new CpuPiece();
		gameBoard.setBoard();
		pPiece.place(gameBoard, 4);
		cPiece.place(gameBoard, 4);
		pPiece.place(gameBoard, 4);
		pPiece.place(gameBoard, 4);
		pPiece.place(gameBoard, 4);
		pPiece.place(gameBoard, 4);
		pPiece.place(gameBoard, 5);
		pPiece.place(gameBoard, 5);
		pPiece.place(gameBoard, 5);
		pPiece.place(gameBoard, 5);
		pPiece.place(gameBoard, 5);
		pPiece.place(gameBoard, 6);
		pPiece.place(gameBoard, 6);
		pPiece.place(gameBoard, 6);
		pPiece.place(gameBoard, 6);
		pPiece.place(gameBoard, 7);
		pPiece.place(gameBoard, 7);
		pPiece.place(gameBoard, 7);
		cPiece.place(gameBoard, 8);
		pPiece.place(gameBoard, 8);
		pPiece.place(gameBoard, 9);
		
		
		
		gameBoard.printBoard();
		
	}

}
