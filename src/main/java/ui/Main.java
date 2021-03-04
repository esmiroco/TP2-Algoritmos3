package ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import bloque.Bloque;
import bloque.BloqueAlgoritmo;
import handlers.HandlerAgregarBotonAlgoritmo;
import handlers.HandlerJuego;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
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
		contenedorVertical.setStyle("-fx-background-color: lightgoldenrodyellow ;");


		ContenedorBloques contenedorBloques = new ContenedorBloques(this);
        contenedorBloques.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
                + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
                + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
        contenedorBloques.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
	    HBox contenedorHorizontal = new HBox();
	  
	    contenedorHorizontal.getChildren().add(mapaUI);
	    contenedorHorizontal.getChildren().add(contenedorBloques);

	        
	    contenedorVertical.getChildren().add(contenedorHorizontal);
	    
	    HBox contenedorHorizontalBotones = new HBox();
	    VBox contenedorVerticalBotones1 = new VBox();
	    VBox contenedorVerticalBotones2 = new VBox();
	    VBox contenedorVerticalBotones3 = new VBox();
	    VBox contenedorVerticalBotones4 = new VBox();
	    VBox contenedorVerticalBotones5 = new VBox();
	    
	    HBox contenedorHorizontalEjecutar= new HBox();
	    
	    contenedorVertical.getChildren().add(contenedorHorizontalBotones);
	    
	    contenedorHorizontalBotones.getChildren().add(contenedorVerticalBotones1);
	    contenedorHorizontalBotones.getChildren().add(contenedorVerticalBotones2);
	    contenedorHorizontalBotones.getChildren().add(contenedorVerticalBotones3);
	    contenedorHorizontalBotones.getChildren().add(contenedorVerticalBotones4);
	    contenedorHorizontalBotones.getChildren().add(contenedorVerticalBotones5);
	    
	    contenedorVertical.getChildren().add(contenedorHorizontalEjecutar);
	    
        //botones
        BotonUI botonMoverDerecha = new BotonAgregarBloqueMoverDerecha(contenedorBloques);
        BotonUI botonMoverIzquierda = new BotonAgregarBloqueMoverIzquierda(contenedorBloques);
        BotonUI botonMoverArriba = new BotonAgregarBloqueMoverArriba(contenedorBloques);
        BotonUI botonMoverAbajo = new BotonAgregarBloqueMoverAbajo(contenedorBloques);
       
        BotonUI botonBloqueLapizAbajo = new BotonAgregarBloqueLapizAbajo(contenedorBloques);
        BotonUI botonBloqueLapizArriba = new BotonAgregarBloqueLapizArriba(contenedorBloques);
        
        BotonUI botonBloqueRepetir3 = new BotonAgregarBloqueRepetirTresVeces(contenedorBloques);
        BotonUI botonBloqueRepetir2 = new BotonAgregarBloqueRepetirDosVeces(contenedorBloques);
        
        BotonUI botonBloqueInvertir = new BotonAgregarBloqueInvertir(contenedorBloques);
        
        botonAgregarBloqueAlgoritmo = new BotonAgregarBloqueAlgoritmo(contenedorBloques);

        contenedorVerticalBotones1.getChildren().add(botonMoverDerecha);
        contenedorVerticalBotones1.getChildren().add(botonMoverAbajo);
        contenedorVerticalBotones2.getChildren().add(botonMoverIzquierda);
        contenedorVerticalBotones2.getChildren().add(botonMoverArriba);
        contenedorVerticalBotones3.getChildren().add(botonBloqueLapizAbajo);
        contenedorVerticalBotones3.getChildren().add(botonBloqueLapizArriba);
        contenedorVerticalBotones4.getChildren().add(botonBloqueRepetir2);
        contenedorVerticalBotones4.getChildren().add(botonBloqueRepetir3);
        contenedorVerticalBotones5.getChildren().add(botonBloqueInvertir);
        contenedorVerticalBotones5.getChildren().add(botonAgregarBloqueAlgoritmo);

        BotonEjecutar botonEjecutar = new BotonEjecutar(contenedorBloques, handlerJuego);
        
        contenedorHorizontalEjecutar.setAlignment(Pos.CENTER);
        contenedorHorizontalEjecutar.getChildren().add(botonEjecutar);
        contenedorHorizontalEjecutar.setHgrow(botonEjecutar, Priority.ALWAYS);
        botonEjecutar.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        contenedorHorizontalEjecutar.setMargin(botonEjecutar, new Insets(5,5,5,5));
        
        //fin botones
        
        var scene = new Scene(contenedorVertical, 800, 720);
        
        stage.setMinHeight(760);
        stage.setMinWidth(820);
        
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
