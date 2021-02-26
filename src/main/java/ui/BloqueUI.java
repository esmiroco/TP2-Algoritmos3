package ui;

import bloque.Bloque;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public abstract class BloqueUI extends VBox {
	
	public abstract String mensaje();
	public abstract Bloque devolverBloque();

}
