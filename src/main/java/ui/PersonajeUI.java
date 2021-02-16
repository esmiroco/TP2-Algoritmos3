package ui;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import personaje.Personaje;
import movimiento.Movimiento;
import posicion.Posicion;
import mapa.Mapa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PersonajeUI extends Pane {

    Posicion posicion = new Posicion(0,0);
    private Personaje personaje = new Personaje(posicion);
    private ImageView imagen;
    int offsetX = 0;
    int offsetY = 0;
    int ancho = 32;
    int alto = 50;
    public PersonajeUI(ImageView imageView) {
        establecerImagen(imageView);

    }

    public Posicion moverIzquierda(Movimiento movimiento, Mapa mapa) {
        personaje.mover(movimiento, mapa);
        Posicion aux = personaje.obtenerPosicion();
        setTranslateX((aux.obtenerX()) * ancho / 20);

        return aux;
    }

    public Posicion moverDerecha(Movimiento movimiento, Mapa mapa){
        personaje.mover(movimiento, mapa);
        Posicion aux = personaje.obtenerPosicion();
        setTranslateX((aux.obtenerX()) * ancho / 20);


        return aux;
    }

    public Posicion moverHorizontal(Movimiento movimiento, Mapa mapa){
        personaje.mover(movimiento, mapa);
        Posicion aux = personaje.obtenerPosicion();
        setTranslateY((aux.obtenerY()) * alto / 20);
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

    public void establecerImagen(ImageView imageView){
        this.imagen = imageView;
        this.imagen.setViewport(new Rectangle2D(offsetX,offsetY,ancho,alto));
        getChildren().addAll(imageView);
    }

}
