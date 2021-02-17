package ui;

import javafx.scene.control.Label;

public class BloqueMoverArribaUI extends BloqueUI{
	
	String msj = "Bloque Mover Arriba";
	
	public BloqueMoverArribaUI() {
		
		Label label = new Label(msj);
		this.getChildren().add(label);
	}

	@Override
	public String mensaje() {
		return msj;
	}
}