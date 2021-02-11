package ui;

import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class PosicionUI extends Label{
	
	
	public PosicionUI(){
		int ancho = 50;
		int alto = 50;
		this.setMinWidth(50);
		this.setMinHeight(50);
	}
	
	public void pintate() {
		this.setBackground(new Background(new BackgroundFill(Color.rgb(0, 0, 0), null, null)));
	}
	

}
