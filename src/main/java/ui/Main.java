package ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import bloque.Bloque;
import bloque.BloqueAlgoritmo;
import handlers.HandlerAgregarBotonAlgoritmo;
import handlers.HandlerJuego;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import juegoCodigo.JuegoCodigo;

import posicion.Posicion;


public class Main extends Application {
	
    MapaUI mapaUI;
    PersonajeUI personajeUI;
    BotonAgregarBloqueAlgoritmo botonAgregarBloqueAlgoritmo;
    
	public static void main(String[] args) {
		launch();

	}

	@Override
    public void start(Stage stage) throws FileNotFoundException {
		
		HandlerJuego handlerJuego = new HandlerJuego(this);
		
		//imagenes personaje
		
		//FileInputStream inputstreamFrente = new FileInputStream("src/main/java/recursos/down1.png");
		Image imageFrente = new Image("file:src/main/java/recursos/lapizArriba/abajo.png");
		ImageView imageViewFrente = new ImageView(imageFrente);
		PersonajeUI personajeUI = new PersonajeUI(imageViewFrente);
		//fin imagenes personaje       
        
		mapaUI = new MapaUI(personajeUI);
		mapaUI.colocarPersonaje(new Posicion(0,0));
		
		VBox contenedorVertical = new VBox();

		ContenedorBloques contenedorBloques = new ContenedorBloques(this);
		
	    HBox contenedorHorizontal = new HBox();
	    contenedorHorizontal.getChildren().add(mapaUI);
	    contenedorHorizontal.getChildren().add(contenedorBloques);
	        
	     contenedorVertical.getChildren().add(contenedorHorizontal);
        
        //botones
        BotonUI botonMoverDerecha = new BotonAgregarBloqueMoverDerecha(contenedorBloques, contenedorHorizontal);
        BotonUI botonMoverIzquierda = new BotonAgregarBloqueMoverIzquierda(contenedorBloques, contenedorHorizontal);
        BotonUI botonMoverArriba = new BotonAgregarBloqueMoverArriba(contenedorBloques, contenedorHorizontal);
        BotonUI botonMoverAbajo = new BotonAgregarBloqueMoverAbajo(contenedorBloques, contenedorHorizontal);
       
        BotonUI botonBloqueLapizAbajo = new BotonAgregarBloqueLapizAbajo(contenedorBloques, contenedorHorizontal);
        BotonUI botonBloqueLapizArriba = new BotonAgregarBloqueLapizArriba(contenedorBloques, contenedorHorizontal);
        
        BotonUI botonBloqueRepetir3 = new BotonAgregarBloqueRepetirTresVeces(contenedorBloques, contenedorHorizontal);
        BotonUI botonBloqueRepetir2 = new BotonAgregarBloqueRepetirDosVeces(contenedorBloques, contenedorHorizontal);
        
        BotonUI botonBloqueInvertir = new BotonAgregarBloqueInvertir(contenedorBloques, contenedorHorizontal);
        
        botonAgregarBloqueAlgoritmo = new BotonAgregarBloqueAlgoritmo(contenedorBloques, contenedorHorizontal);
        
        contenedorVertical.getChildren().add(botonMoverDerecha);
        contenedorVertical.getChildren().add(botonMoverAbajo);
        contenedorVertical.getChildren().add(botonMoverIzquierda);
        contenedorVertical.getChildren().add(botonMoverArriba);
        contenedorVertical.getChildren().add(botonBloqueLapizAbajo);
        contenedorVertical.getChildren().add(botonBloqueLapizArriba);
        contenedorVertical.getChildren().add(botonBloqueRepetir2);
        contenedorVertical.getChildren().add(botonBloqueRepetir3);
        contenedorVertical.getChildren().add(botonBloqueInvertir);
        contenedorVertical.getChildren().add(botonAgregarBloqueAlgoritmo);
        
        BotonEjecutar botonEjecutar = new BotonEjecutar(contenedorBloques, handlerJuego);
        contenedorVertical.getChildren().add(botonEjecutar);
        
        //fin botones
        
        var scene = new Scene(contenedorVertical, 900, 720);
        

        stage.setScene(scene);
        stage.show();
        
		
	}

	public void agregarBloqueBotonAlgoritmo(BloqueAlgoritmo bloque) {
		botonAgregarBloqueAlgoritmo.agregarBloque(bloque);
	}	
	
	
	public void actualizarImagenes() {
		mapaUI.actualizarImagenes();
	}

	public void actualizarPosiciones(ArrayList<Posicion> posiciones) {
		mapaUI.agregarPosiciones(posiciones);
		
	}

}
