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
    int ancho = 60;
    int alto = 60;


    public PersonajeUI(ImageView imageView) {
            establecerImagen(imageView);
    }

    public void establecerImagen(ImageView imageView){
        this.imagen = imageView;
        this.imagen.setViewport(new Rectangle2D(offsetX,offsetY,ancho,alto));
        getChildren().addAll(imageView);
    }

    public void actualizarImagen(Image imagen){
        this.imagen.setImage(imagen);

    }


}
