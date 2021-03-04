package ui;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class PosicionUI extends Pane{
	
	public PosicionUI(){
		int ancho = 60;
		int alto = 60;
		this.setMinWidth(ancho);
		this.setMinHeight(alto);
	}
	
	public void pintate() {
		this.setBackground(new Background(new BackgroundFill(Color.rgb(0, 0, 0), null, null)));
	}
	
	public void agregarPersonaje(PersonajeUI personaje) {
		this.getChildren().add(personaje);
	}

	public void clear() {
		this.getChildren().clear();
		
	}
	

}
