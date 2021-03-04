package ui;

import bloque.Bloque;
import bloque.BloqueLapizArriba;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

public class BloqueLapizArribaUI extends BloqueUI {

	String msj = "Bloque Lapiz Arriba";
	BloqueLapizArriba bloque;
	
	public BloqueLapizArribaUI() {
		Label label = new Label(msj);
		this.getChildren().add(label);
		bloque = new BloqueLapizArriba();
		this.setAlignment(Pos.CENTER);
		label.setStyle("-fx-text-fill: white;");
		this.setStyle("-fx-background-color: orange ;");
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
