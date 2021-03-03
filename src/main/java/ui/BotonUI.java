package ui;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public abstract class BotonUI extends StackPane{
    public abstract Button obtenerBoton();
    public abstract void ejecutar();
}
