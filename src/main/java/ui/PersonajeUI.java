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

    private Personaje personaje;
    private ImageView imagen;
    int offsetX = 0;
    int offsetY = 0;
    int ancho = 32;
    int alto = 50;

    public PersonajeUI(ImageView imageView, Personaje personaje) {
        establecerImagen(imageView);
        this.personaje = personaje;

    }

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

    public void establecerImagen(ImageView imageView){
        this.imagen = imageView;
        this.imagen.setViewport(new Rectangle2D(offsetX,offsetY,ancho,alto));
        getChildren().addAll(imageView);
    }

    public Posicion obtenerPosicion(){
        return personaje.obtenerPosicion();
    }

}
