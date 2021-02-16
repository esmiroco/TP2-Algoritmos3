package juego;

import javafx.scene.control.Label;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import movimiento.MovDerecha;
import movimiento.MovIzquierda;
import movimiento.MovAbajo;
import movimiento.MovArriba;
import posicion.Posicion;
import mapa.Mapa;
import ui.PersonajeUI;
import ui.PosicionUI;

public class Main extends Application {
	
	public PosicionUI[][] gridArray = new PosicionUI[10][10];
	private int x = 4;
	private int y = 4;
	private boolean pintar = false;
	Mapa mapa = new Mapa();

	public static void main(String[] args) {
		launch();

	}

	@Override
    public void start(Stage stage) throws FileNotFoundException {

		FileInputStream inputstreamFrente = new FileInputStream("src/main/java/recursos/down1.png");
		Image imageFrente = new Image(inputstreamFrente);
		ImageView imageViewFrente = new ImageView(imageFrente);
		PersonajeUI personaje = new PersonajeUI(imageViewFrente);
		FileInputStream inputstreamIzq = new FileInputStream("src/main/java/recursos/left1.png");
		Image imageIzq = new Image(inputstreamIzq);
		ImageView imageViewIzq = new ImageView(imageIzq);
		FileInputStream inputstreamDer = new FileInputStream("src/main/java/recursos/right1.png");
		Image imageDer = new Image(inputstreamDer);
		ImageView imageViewDer = new ImageView(imageDer);

		
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
        
        Button botonLapizArriba = new Button();
        botonLapizArriba.setText("Lapiz Arriba");

		Button botonLapizAbajo = new Button();
		botonLapizAbajo.setText("Lapiz Abajo");
        
        Button botonIzquierda = new Button();
        botonIzquierda.setText("Izquierda");
        
        Button botonDerecha = new Button();
        botonDerecha.setText("Derecha");
        
        Button botonAbajo = new Button();
        botonAbajo.setText("Abajo");
        
        Button botonArriba = new Button();
        botonArriba.setText("Arriba");
        
        botonLapizAbajo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				personaje.bajarLapiz();
			}
        });

		botonLapizArriba.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				personaje.levantarLapiz();
			}
		});
        
        botonIzquierda.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				x = x-1;
				MovIzquierda movimiento = new MovIzquierda();
				Posicion posicion = personaje.moverIzquierda(movimiento, mapa);
				personaje.establecerImagen(imageViewIzq);
				if(personaje.estoyPintado()) {
					gridArray[x][y].pintate();
				}
				
			}
        });
        
        botonDerecha.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				x = x+1;
				MovDerecha movimiento = new MovDerecha();
				Posicion posicion = personaje.moverDerecha(movimiento, mapa);
				personaje.establecerImagen(imageViewDer);
				if(personaje.estoyPintado()) {
					gridArray[x][y].pintate();
				}
				
			}
        });
        
        botonAbajo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				y = y-1;
				MovArriba movimiento = new MovArriba();
				Posicion posicion = personaje.moverHorizontal(movimiento, mapa);
				if(personaje.estoyPintado()) {
					gridArray[x][y].pintate();
				}
				
			}
        });
        
        botonArriba.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				y = y+1;
				MovAbajo movimiento = new MovAbajo();
				Posicion posicion = personaje.moverHorizontal(movimiento, mapa);
				if(personaje.estoyPintado()) {
					gridArray[x][y].pintate();
				}
				
			}
        });
        
        //termina botones
        
        VBox pane = new VBox();
        pane.getChildren().add(grid);
        
        pane.getChildren().add(botonLapizAbajo);
        pane.getChildren().add(botonLapizArriba);
        pane.getChildren().add(botonArriba);
        pane.getChildren().add(botonAbajo);
        pane.getChildren().add(botonDerecha);
        pane.getChildren().add(botonIzquierda);
        pane.getChildren().addAll(personaje);
        //stage.getIcons().add(personaje);
        
        var scene = new Scene(pane, 720, 720);
        
        stage.setScene(scene);
        stage.show();
    }


}
