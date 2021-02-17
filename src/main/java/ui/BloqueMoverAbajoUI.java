package ui;

import javafx.scene.control.Label;

public class BloqueMoverAbajoUI extends BloqueUI{
	
	String msj = "Bloque Mover Abajo";
	
	public BloqueMoverAbajoUI() {
		
		Label label = new Label(msj);
		this.getChildren().add(label);
	}

	@Override
	public String mensaje() {
		return msj;
	}

}