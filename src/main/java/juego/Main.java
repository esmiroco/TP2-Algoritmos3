package juego;

import javafx.scene.control.Label;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import movimiento.MovDerecha;
import movimiento.MovIzquierda;
import movimiento.MovAbajo;
import movimiento.MovArriba;
import posicion.Posicion;
import mapa.Mapa;
import ui.PersonajeUI;
import ui.BotonAgregarBloqueMoverAbajo;
import ui.BotonAgregarBloqueMoverArriba;
import ui.BotonAgregarBloqueMoverDerecha;
import ui.BotonAgregarBloqueMoverIzquierda;
import ui.BotonAgregarBloqueRepetirDosVeces;
import ui.BotonEjecutar;
import ui.BotonUI;
import ui.PosicionUI;

public class Main extends Application {
	
	public PosicionUI[][] gridArray = new PosicionUI[10][10];
	ArrayList<Button> botones;
	
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
        //grid.setGridLinesVisible(true);
        
        for(int i = 1; i < 10; i++) {
        	for(int j = 1; j < 10; j++) {
        		PosicionUI pos = new PosicionUI();
        		grid.add(pos, i, j);
        		gridArray[i][j] = pos;
        	}
        }
        
        VBox contenedorVertical = new VBox();

        VBox contenedorBloques = new VBox();

        HBox contenedorHorizontal = new HBox();
        contenedorHorizontal.getChildren().add(grid);
        contenedorHorizontal.getChildren().add(contenedorBloques);
        
        contenedorVertical.getChildren().add(contenedorHorizontal);
        
        BotonUI botonMoverDerecha = new BotonAgregarBloqueMoverDerecha(contenedorBloques);
        BotonUI botonMoverIzquierda = new BotonAgregarBloqueMoverIzquierda(contenedorBloques);
        BotonUI botonMoverArriba = new BotonAgregarBloqueMoverArriba(contenedorBloques);
        BotonUI botonMoverAbajo = new BotonAgregarBloqueMoverAbajo(contenedorBloques);
        
        BotonAgregarBloqueRepetirDosVeces botonBloqueInvertir = new BotonAgregarBloqueRepetirDosVeces(contenedorBloques);        
        
        contenedorVertical.getChildren().add(botonMoverDerecha);
        contenedorVertical.getChildren().add(botonMoverAbajo);
        contenedorVertical.getChildren().add(botonMoverIzquierda);
        contenedorVertical.getChildren().add(botonMoverArriba);
        contenedorVertical.getChildren().add(botonBloqueInvertir);

        HashMap<String, BotonUI> botones = new HashMap<String, BotonUI>();


        botones.put("Boton mover derecha", botonMoverDerecha);
        botones.put("Boton mover izquierda", botonMoverIzquierda);
        botones.put("Boton mover arriba", botonMoverArriba);
        botones.put("Boton mover abajo", botonMoverAbajo);

        botonBloqueInvertir.addBotones(botones);

        BotonEjecutar botonEjecutar = new BotonEjecutar(contenedorBloques);
        contenedorVertical.getChildren().add(botonEjecutar);
        
        var scene = new Scene(contenedorVertical, 720, 720);
        

        stage.setScene(scene);
        stage.show();
		
	}
	

}
