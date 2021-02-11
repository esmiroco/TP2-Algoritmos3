package juego2;

import javafx.scene.control.Label;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import ui.PosicionUI;

public class Main extends Application {
	
	public PosicionUI[][] gridArray = new PosicionUI[10][10];
	private int x = 4;
	private int y = 4;
	private boolean pintar = false;
	
	public static void main(String[] args) {
		launch();

	}

	@Override
    public void start(Stage stage) {
		
		Random rand = new Random();
		
        GridPane grid = new GridPane();
        grid.setGridLinesVisible(true);
        
        for(int i = 1; i < 10; i++) {
        	for(int j = 1; j < 10; j++) {
        		PosicionUI pos = new PosicionUI();
        		grid.add(pos, i, j);
        		gridArray[i][j] = pos;
        	}
        }
        
        //botones. Despues dividir en objetos
        
        Button boton = new Button();
        boton.setText("color");
        
        Button botonIzquierda = new Button();
        botonIzquierda.setText("Izquierda");
        
        Button botonDerecha = new Button();
        botonDerecha.setText("Derecha");
        
        Button botonAbajo = new Button();
        botonAbajo.setText("Abajo");
        
        Button botonArriba = new Button();
        botonArriba.setText("Arriba");
        
        boton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				pintar = !pintar;			
			}
        });
        
        botonIzquierda.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				x = x-1;
				if(pintar) {
					gridArray[x][y].pintate();
				}
				
			}
        });
        
        botonDerecha.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				x = x+1;
				if(pintar) {
					gridArray[x][y].pintate();
				}
				
			}
        });
        
        botonAbajo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				y = y+1;
				if(pintar) {
					gridArray[x][y].pintate();
				}
				
			}
        });
        
        botonArriba.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				y = y-1;
				if(pintar) {
					gridArray[x][y].pintate();
				}
				
			}
        });
        
        //termina botones
        
        VBox pane = new VBox();
        pane.getChildren().add(grid);
        
        pane.getChildren().add(boton);
        pane.getChildren().add(botonArriba);
        pane.getChildren().add(botonAbajo);
        pane.getChildren().add(botonDerecha);
        pane.getChildren().add(botonIzquierda);

        
        
        var scene = new Scene(pane, 720, 720);
        
        stage.setScene(scene);
        stage.show();
    }


}
