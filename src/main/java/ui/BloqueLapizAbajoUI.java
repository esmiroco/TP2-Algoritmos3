package ui;

import bloque.Bloque;
import bloque.BloqueLapizAbajo;
import javafx.scene.control.Label;

public class BloqueLapizAbajoUI extends BloqueUI {
	
	String msj = "Bloque Lapiz Abajo";
	BloqueLapizAbajo bloque;
	
	public BloqueLapizAbajoUI() {
		Label label = new Label(msj);
		this.getChildren().add(label);
		bloque = new BloqueLapizAbajo();
	}
	
	@Override
	public String mensaje() {
		return msj;
	}

	@Override
	public Bloque devolverBloque() {
		return bloque;
	}

}
