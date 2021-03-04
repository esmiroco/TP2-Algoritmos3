package ui;

import bloque.Bloque;
import bloque.BloqueAlgoritmo;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

public class BloqueAlgoritmoUI extends BloqueUI {
	
	String msj = "Bloque Algoritmo";
	BloqueAlgoritmo bloque;
	
	public BloqueAlgoritmoUI(BloqueAlgoritmo bloqueEnviado) {
		Label label = new Label(msj);
		this.getChildren().add(label);
		bloque = bloqueEnviado;
		
		this.setAlignment(Pos.CENTER);
		label.setStyle("-fx-text-fill: white;");
		this.setStyle("-fx-background-color: slategrey ;");
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
