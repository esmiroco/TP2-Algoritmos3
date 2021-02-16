package ui;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import personaje.Personaje;

public class PersonajeUI extends Pane {

    private Personaje personaje;
    private ImageView imagen;
    int offsetX = 0;
    int offsetY = 0;
    int ancho = 32;
    int alto = 50;
    public PersonajeUI(ImageView imageView) {

        this.imagen = imageView;
        this.imagen.setViewport(new Rectangle2D(offsetX,offsetY,ancho,alto));
        getChildren().addAll(imageView);

    }

}
