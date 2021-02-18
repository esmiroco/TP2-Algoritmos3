package ui;

import bloque.Bloque;
import bloque.BloqueLapizArriba;
import javafx.scene.control.Label;

public class BloqueLapizArribaUI extends BloqueUI {

	String msj = "Bloque Lapiz Arriba";
	BloqueLapizArriba bloque;
	
	public BloqueLapizArribaUI() {
		Label label = new Label(msj);
		this.getChildren().add(label);
		bloque = new BloqueLapizArriba();
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
