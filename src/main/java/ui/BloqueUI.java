package ui;

import bloque.Bloque;
import javafx.scene.layout.Pane;

public abstract class BloqueUI extends Pane {
	
	public abstract String mensaje();
	public abstract Bloque devolverBloque();

}
