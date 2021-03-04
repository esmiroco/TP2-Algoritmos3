package ui;

import java.util.ArrayList;

import bloque.Bloque;
import bloque.BloqueInvertirComportamiento;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class BloqueInvertirUI extends BloqueUI implements RecolectorBloques {
	
	String msj = "Bloque Invertir - ";
	BloqueInvertirComportamiento bloque;
	
	public BloqueInvertirUI() {
		Label label = new Label(msj);
		this.getChildren().add(label);
		bloque = new BloqueInvertirComportamiento();
		
		this.setAlignment(Pos.CENTER);
		label.setStyle("-fx-text-fill: white;");
		this.setStyle("-fx-background-color: lightcoral ;");
	}

	@Override
	public String mensaje() {
		return msj;
	}

	@Override
	public Bloque devolverBloque() {
		return bloque;
	}
	
	@Override
	public void agregarBloque(Pane bloqueEnviado) {
		this.getChildren().add(bloqueEnviado);
		bloque.agregarBloque(((BloqueUI) bloqueEnviado).devolverBloque());
	}
}
