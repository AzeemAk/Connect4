/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author azeem
 */

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Runner extends Application{
	private TextField mytextfield;
	private TextField mytextfield2;
	private GridPane gridpane;
	private Label text;
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
                FreePiece fPiece = new FreePiece();
                
                cPiece.place(gameBoard, 5);
                gameBoard.printBoard();
                pPiece.place(gameBoard, 6);
                gameBoard.printBoard();
                pPiece.place(gameBoard, 7);
                gameBoard.printBoard();
                pPiece.place(gameBoard, 7);
                gameBoard.printBoard();
                cPiece.place(gameBoard, 7);
                gameBoard.printBoard();
                
                pPiece.place(gameBoard, 8);
                gameBoard.printBoard();
                cPiece.place(gameBoard, 8);
                gameBoard.printBoard();
                pPiece.place(gameBoard, 8);
                gameBoard.printBoard();
                cPiece.place(gameBoard, 8);
                gameBoard.printBoard();
                
                pPiece.place(gameBoard, 9);
                gameBoard.printBoard();
                cPiece.place(gameBoard, 9);
                gameBoard.printBoard();
                pPiece.place(gameBoard, 9);
                gameBoard.printBoard();
                cPiece.place(gameBoard, 9);
                gameBoard.printBoard();
                cPiece.place(gameBoard, 9);
                gameBoard.printBoard();
                fPiece.place(gameBoard, 6);
                gameBoard.printBoard(); 
                

              
              
                
                
                
                
                        
		Button button1 = new Button("Click Here!");
		button1.setOnAction(e -> {
			
			int c = (Integer.parseInt(mytextfield.getText()));
                        int r = (gameBoard.getLocalRows(c) + 1);
                        int c2 = (Integer.parseInt(mytextfield2.getText()));
                        /*int cpuCols = (cPiece.randomPlace(gameBoard));
                        System.out.println("cpu cols = " + cpuCols);
                        int cpuRows = (gameBoard.getLocalRows(cpuCols) + 1);*/
                        //System.out.println("cpu rows = " + cpuRows);
                        pPiece.place(gameBoard, c);
                        cPiece.place(gameBoard, c2);
                        gameBoard.printBoard();
			gridpane.add(new Circle(50,75,20), c, r);
                        //gridpane.add(new Circle(50,75,20), cpuCols, (cpuRows + 1)); 
                        
		}); 
		Text text = new Text("Col ");
		mytextfield = new TextField("");
                Text text2 = new Text("Col 2");
                mytextfield2 = new TextField("");
		
		HBox hbox = new HBox(20,text,mytextfield,mytextfield2);
		gridpane = new GridPane();
		for(int i = 0;i <= 7;i++) { // rows
			for(int a = 0;a < 8;a++) { // cols
				/*if(i==0) {
					Button placebutton = new Button("Click");
					gridpane.add(placebutton, a, 0);
                                        
				}*/
			Circle mycircle = new Circle(50,75,20);
			mycircle.setFill(null);
			mycircle.setStroke(Color.BLACK);
			gridpane.add(mycircle, a, i);
			}
		}
		gridpane.setHgap(5);
		gridpane.setVgap(5);
		gridpane.setPadding(new Insets(10));
	
		VBox vbox2 = new VBox(hbox,button1);
		GridPane gridpane2 = new GridPane();
		gridpane2.add(gridpane, 0, 0);
		gridpane2.add(vbox2, 1, 0);
		
		Scene scene = new Scene(gridpane2);
		
		PrimaryStage.setTitle("Connect 5");
		
		PrimaryStage.setScene(scene);
		
		PrimaryStage.show(); 
		
	}

}

