package ui;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import personaje.Personaje;
import movimiento.Movimiento;
import posicion.Posicion;
import mapa.Mapa;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class PersonajeUI extends Pane {

    private Personaje personaje;
    private ImageView imagen;
    int offsetX = 0;
    int offsetY = 0;
    int ancho = 50;
    int alto = 60;

   /* Image imgnDerechaLapizArriba = new Image("file:src/main/java/recursos/lapizArriba/derecha.png");
    Image imgAbajoLapizArriba = new Image("file:src/main/java/recursos/lapizArriba/derecha.png");
    Image imgIzquierdaLapizArriba = new Image("file:src/main/java/recursos/lapizArriba/derecha.png");
    Image imgArribaLapizArriba = new Image("file:src/main/java/recursos/lapizArriba/derecha.png");*/
    //ImageView imagenDerLapizArriba = new ImageView(imagenDerechaLapizArriba);

    /*ImageView im = new ImageView();
    IntegerProperty intValue = new SimpleIntegerProperty();
    List <Image> images = Arrays.asList(new Image(getClass().getResource("src/main/java/recursos/lapizArriba/derecha.png").toString()),
            new Image(getClass().getResource("src/main/java/recursos/lapizArriba/arriba.png").toString()));
            //Arrays.asList(new Image(getClass().getResource("aa.png").toString()),
            //new Image(getClass().getResource("bb.png").toString()));*/

    public PersonajeUI(ImageView imageView) {
            establecerImagen(imageView);
    }
/*
    public Posicion mover(Movimiento movimiento, Mapa mapa) {
        personaje.mover(movimiento, mapa);
        Posicion aux = personaje.obtenerPosicion();
        return aux;
    }

    public void bajarLapiz(){
        personaje.bajarLapiz();
    }

    public void levantarLapiz(){
        personaje.levantarLapiz();
    }

    public boolean estoyPintado(){
        Posicion aux = personaje.obtenerPosicion();
        return aux.estoyPintado();
    }
*/
    public void establecerImagen(ImageView imageView){
        this.imagen = imageView;
        this.imagen.setViewport(new Rectangle2D(offsetX,offsetY,ancho,alto));
        getChildren().addAll(imageView);
    }

    public void actualizarImagen(Image imagen){
        this.imagen.setImage(imagen);
        //this.imagen.setViewport(new Rectangle2D(offsetX,offsetY,ancho,alto));

        System.out.println("Hola Mundo");
    }
/*
    public Posicion obtenerPosicion(){
        return personaje.obtenerPosicion();
    }*/

}
