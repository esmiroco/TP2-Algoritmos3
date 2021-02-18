package juego;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import bloque.Bloque;

import java.util.ArrayList;
import java.util.HashMap;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
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
import javafx.util.Duration;
import juegoCodigo.JuegoCodigo;
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
    MapaUI mapaUI;
    PersonajeUI personajeUI;
    JuegoCodigo juegoCodigo;


	public static void main(String[] args) {
		launch();

	}

	@Override
    public void start(Stage stage) throws FileNotFoundException {
		
		
		

		//imagenes personaje
		
		FileInputStream inputstreamFrente = new FileInputStream("src/main/java/recursos/down1.png");
		Image imageFrente = new Image(inputstreamFrente);
		ImageView imageViewFrente = new ImageView(imageFrente);
		PersonajeUI personajeUI = new PersonajeUI(imageViewFrente);
		FileInputStream inputstreamIzq = new FileInputStream("src/main/java/recursos/left1.png");
		Image imageIzq = new Image(inputstreamIzq);
		ImageView imageViewIzq = new ImageView(imageIzq);
		FileInputStream inputstreamDer = new FileInputStream("src/main/java/recursos/right1.png");
		Image imageDer = new Image(inputstreamDer);
		ImageView imageViewDer = new ImageView(imageDer);
		//fin imagenes personaje       
        
        juegoCodigo = new JuegoCodigo();
		mapaUI = new MapaUI(personajeUI);
		mapaUI.colocarPersonaje(new Posicion(0,0));
		
		
		 VBox contenedorVertical = new VBox();

	     VBox contenedorBloques = new VBox();

	     HBox contenedorHorizontal = new HBox();
	     contenedorHorizontal.getChildren().add(mapaUI);
	     contenedorHorizontal.getChildren().add(contenedorBloques);
	        
	     contenedorVertical.getChildren().add(contenedorHorizontal);
        
        //botones
        BotonUI botonMoverDerecha = new BotonAgregarBloqueMoverDerecha(contenedorBloques);
        BotonUI botonMoverIzquierda = new BotonAgregarBloqueMoverIzquierda(contenedorBloques);
        BotonUI botonMoverArriba = new BotonAgregarBloqueMoverArriba(contenedorBloques);
        BotonUI botonMoverAbajo = new BotonAgregarBloqueMoverAbajo(contenedorBloques);
        
        BotonUI botonBloqueLapizAbajo = new BotonAgregarBloqueLapizAbajo(contenedorBloques);
        BotonUI botonBloqueLapizArriba = new BotonAgregarBloqueLapizArriba(contenedorBloques);
        
        contenedorVertical.getChildren().add(botonMoverDerecha);
        contenedorVertical.getChildren().add(botonMoverAbajo);
        contenedorVertical.getChildren().add(botonMoverIzquierda);
        contenedorVertical.getChildren().add(botonMoverArriba);;
        contenedorVertical.getChildren().add(botonBloqueLapizAbajo);
        contenedorVertical.getChildren().add(botonBloqueLapizArriba);

        HashMap<String, BotonUI> botones = new HashMap<String, BotonUI>();

        botones.put("Boton Mover Derecha", botonMoverDerecha);
        botones.put("Boton Mover Izquierda", botonMoverIzquierda);
        botones.put("Boton Mover Arriba", botonMoverArriba);
        botones.put("Boton Mover Abajo", botonMoverAbajo); 
        botones.put("Boton Lapiz Abajo", botonMoverAbajo); 
        botones.put("Boton Lapiz Arriba", botonMoverAbajo); 

        
        BotonUI botonBloqueRepetir2 = new BotonAgregarBloqueRepetirDosVeces(contenedorBloques, botones);     
        BotonUI botonBloqueRepetir3 = new BotonAgregarBloqueRepetirTresVeces(contenedorBloques, botones);
        BotonUI botonBloqueInvertir = new BotonAgregarBloqueInvertir(contenedorBloques, botones);
        
        contenedorVertical.getChildren().add(botonBloqueRepetir2);
        contenedorVertical.getChildren().add(botonBloqueRepetir3);
        contenedorVertical.getChildren().add(botonBloqueInvertir);
        
        BotonEjecutar botonEjecutar = new BotonEjecutar(contenedorBloques, this);
        contenedorVertical.getChildren().add(botonEjecutar);
        
        //fin botones
        
        var scene = new Scene(contenedorVertical, 900, 720);
        

        stage.setScene(scene);
        stage.show();
		
	}
	
	public void ejecutarBloque(Bloque bloque) {
		ArrayList<Posicion> posiciones = juegoCodigo.ejecutarBloque(bloque);
		mapaUI.actualizarPosiciones(posiciones);
	}	

}
