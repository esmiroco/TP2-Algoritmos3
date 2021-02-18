package juego;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import personaje.Personaje;
import posicion.Posicion;
import mapa.Mapa;
import ui.*;

public class Main extends Application {

	ArrayList<Button> botones;
	
	private int x = 4;
	private int y = 4;
	private boolean pintar = false;
    MapaUI mapaUI = new MapaUI();
    Mapa mapa = new Mapa();
    Posicion posicion = new Posicion(0,0);
    Personaje personaje = new Personaje(posicion);


	public static void main(String[] args) {
		launch();

	}

	@Override
    public void start(Stage stage) throws FileNotFoundException {

		//imagenes personaje
		FileInputStream inputstreamFrente = new FileInputStream("src/main/java/recursos/down1.png");
		Image imageFrente = new Image(inputstreamFrente);
		ImageView imageViewFrente = new ImageView(imageFrente);
		PersonajeUI personajeUI = new PersonajeUI(imageViewFrente, personaje);
		FileInputStream inputstreamIzq = new FileInputStream("src/main/java/recursos/left1.png");
		Image imageIzq = new Image(inputstreamIzq);
		ImageView imageViewIzq = new ImageView(imageIzq);
		FileInputStream inputstreamDer = new FileInputStream("src/main/java/recursos/right1.png");
		Image imageDer = new Image(inputstreamDer);
		ImageView imageViewDer = new ImageView(imageDer);


        mapaUI.colocarPersonaje(personajeUI, posicion);

        VBox contenedorVertical = new VBox();

        VBox contenedorBloques = new VBox();

        HBox contenedorHorizontal = new HBox();
        contenedorHorizontal.getChildren().add(mapaUI.grid);
        contenedorHorizontal.getChildren().add(contenedorBloques);
        
        contenedorVertical.getChildren().add(contenedorHorizontal);
        
        
        //botones
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
        
        //fin botones



       var scene = new Scene(contenedorVertical, 900, 720);
        

        stage.setScene(scene);
        stage.show();
		
	}
	

}
