package ui;

import bloque.Bloque;
import bloque.BloqueLapizAbajo;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

public class BloqueLapizAbajoUI extends BloqueUI {
	
	String msj = "Bloque Lapiz Abajo";
	BloqueLapizAbajo bloque;
	
	public BloqueLapizAbajoUI() {
		Label label = new Label(msj);
		this.getChildren().add(label);
		bloque = new BloqueLapizAbajo();
		
		this.setAlignment(Pos.CENTER);
		label.setStyle("-fx-text-fill: white;");
		this.setStyle("-fx-background-color: mediumseagreen ;");
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
