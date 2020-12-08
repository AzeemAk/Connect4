package GroupProject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Runner extends Application{
	private TextField mytextfield;
	private GridPane gridpane;
	private GridPane pvpgridpane;
	Scene scene,pvpscene;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 launch(args);
	}
	@Override
	public void start(Stage PrimaryStage) throws Exception {
		// TODO Auto-generated method stub
		Connect5Board gameBoard = new Connect5Board();
        PlayerPiece pPiece = new PlayerPiece();
        CpuPiece cPiece = new CpuPiece();
        Player2Piece p2Piece = new Player2Piece();
        wildcard wp = new wildcard();
		gridpane = new GridPane();
		pvpgridpane = new GridPane();
		gameBoard.setBoard();
		for(int i = 0;i <= 7;i++) { // rows
			for(int a = 0;a < 10;a++) { // cols
			Circle mycircle = new Circle(50,75,20);
			mycircle.setFill(null);
			mycircle.setStroke(Color.BLACK);
			Circle mycircle2 = new Circle(50,75,20);
			mycircle2.setFill(null);
			mycircle2.setStroke(Color.BLACK);
			gridpane.add(mycircle, a, i);
			pvpgridpane.add(mycircle2, a, i);
			}
		}
		//button for player vs cpu
		Button button1 = new Button("Click Me");
		button1.setOnAction(e -> {
			int c = (Integer.parseInt(mytextfield.getText())-1);
			mytextfield.setText("");
            pPiece.place(gameBoard, c);
            gridpane.add(new Circle(50,75,20), c, gameBoard.getCpurow());
           if(gameBoard.superCheckWin()){
        	   Label label1 = new Label("You WIN GG");
        	  Scene scene2 = new Scene(label1);
			PrimaryStage.setScene(scene2);
           }else {
            cPiece.place(gameBoard, c);
            Circle cpucircle = new Circle(50,75,20);
            cpucircle.setFill(Color.PURPLE);
            gridpane.add(cpucircle, gameBoard.getCpucol(),gameBoard.getCpurow());
            if(gameBoard.superCheckWin()) {
         	  Label label1 = new Label("DIE NOOB GG");
         	  Scene scene2 = new Scene(label1);
         	  PrimaryStage.setScene(scene2);
            }
            wp.place(gameBoard, c);
            Circle cpucircle2 = new Circle(50,75,20);
            cpucircle2.setFill(Color.YELLOW);
            gridpane.add(cpucircle2, gameBoard.getCpucol(),gameBoard.getCpurow());
           }
            gameBoard.printBoard();
		});
		
		//player vs cpu
		Text text = new Text("Column");
		mytextfield = new TextField("");
		HBox hbox = new HBox(20,text,mytextfield);
		gridpane.setHgap(5);
		gridpane.setVgap(5);
		gridpane.setPadding(new Insets(10));
		VBox vbox2 = new VBox(hbox,button1);
		GridPane gridpane2 = new GridPane();
		gridpane2.add(gridpane, 0, 0);
		gridpane2.add(vbox2, 1, 0);
		scene = new Scene(gridpane2);
		
		//player vs player
		Text pvptext1 = new Text("Player 1 Column");
		Text pvptext2 = new Text("Player 2 Column");
		TextField pvpfield1 = new TextField("");
		TextField pvpfield2 = new TextField("");
		HBox pvphbox1 = new HBox(20,pvptext1,pvpfield1);
		HBox pvphbox2= new HBox(20,pvptext2,pvpfield2);
		Button player1 = new Button("P1 Click me");
		Button player2 = new Button("P2 Click me");
		VBox pvpvbox1 = new VBox(pvphbox1,player1);
		VBox pvpvbox2 = new VBox(pvphbox2,player2);
		GridPane pvpgridpane2 = new GridPane();
		pvpgridpane2.add(pvpgridpane, 0, 0);
		pvpgridpane2.add(pvpvbox1, 1, 0);
		pvpgridpane2.add(pvpvbox2, 1, 1);
		pvpscene = new Scene(pvpgridpane2);
		player1.setOnAction(e -> {
			try {
				int c = (Integer.parseInt(pvpfield1.getText())-1);
			pvpfield1.setText("");
            pPiece.place(gameBoard, c);
            pvpgridpane.add(new Circle(50,75,20), c, gameBoard.getCpurow());
           if(gameBoard.superCheckWin()){
        	   Label label1 = new Label("Player1 Win GG");
        	  Scene scene2 = new Scene(label1);
			PrimaryStage.setScene(scene2);
           }
            gameBoard.printBoard();
			}catch(Exception e1) {
				pvpfield1.setText("Error!!!");
			}
			
		});
		player2.setOnAction(e -> {
			try {
				int c = (Integer.parseInt(pvpfield2.getText())-1);
				pvpfield2.setText("");
				p2Piece.place(gameBoard, c);
               Circle cpucircle = new Circle(50,75,20);
               cpucircle.setFill(Color.PURPLE);
               pvpgridpane.add(cpucircle, gameBoard.getCpucol(),gameBoard.getCpurow());
               if(gameBoard.superCheckWin()) {
            	   Label label1 = new Label("Player2 Win GG");
            	  Scene scene2 = new Scene(label1);
    			PrimaryStage.setScene(scene2);
               }
               wp.place(gameBoard, c);
               Circle cpucircle2 = new Circle(50,75,20);
               cpucircle2.setFill(Color.YELLOW);
               pvpgridpane.add(cpucircle2, gameBoard.getCpucol(),gameBoard.getCpurow());
               gameBoard.printBoard();
			}catch(Exception e2) {
				pvpfield2.setText("Error!!!");
			}
		});
		
		//creating the scene for main meanu
		Button pvp = new Button("P V P");
		Button pvc = new Button("P V C");
		HBox hbox1 = new HBox(pvp,pvc);
		hbox1.setAlignment(Pos.CENTER);
		Scene mainmeau = new Scene(hbox1,200,100);
		
		pvc.setOnAction(e -> {
			PrimaryStage.setScene(scene);
		});
		pvp.setOnAction(e -> {
			PrimaryStage.setScene(pvpscene);
		});
		
		PrimaryStage.setTitle("Connect 5");
		PrimaryStage.setScene(mainmeau);
		PrimaryStage.show();
	}

}