package ui;

import javafx.scene.control.Label;

public class BloqueMoverIzquierdaUI extends BloqueUI{

	String msj = "Bloque Mover Izquierda";
	
	public BloqueMoverIzquierdaUI() {
		
		Label label = new Label(msj);
		this.getChildren().add(label);
	}

	@Override
	public String mensaje() {
		return msj;
	}

}