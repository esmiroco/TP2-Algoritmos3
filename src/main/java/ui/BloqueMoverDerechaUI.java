package ui;

import javafx.scene.control.Label;

public class BloqueMoverDerechaUI extends BloqueUI{
	
	String msj = "Bloque Mover Derecha";
	
	public BloqueMoverDerechaUI() {
		
		Label label = new Label(msj);
		this.getChildren().add(label);
	}

	@Override
	public String mensaje() {
		return msj;
	}
}