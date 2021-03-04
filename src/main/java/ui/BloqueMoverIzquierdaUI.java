package ui;

import bloque.Bloque;
import bloque.BloqueMovimiento;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import movimiento.MovIzquierda;

public class BloqueMoverIzquierdaUI extends BloqueUI{

	String msj = "Bloque Mover Izquierda";
	BloqueMovimiento bloque;
	
	public BloqueMoverIzquierdaUI() {
		
		Label label = new Label(msj);
		this.getChildren().add(label);
		bloque = new BloqueMovimiento(new MovIzquierda());
		
		this.setAlignment(Pos.CENTER);
		label.setStyle("-fx-text-fill: white;");
		this.setStyle("-fx-background-color: rosybrown ;");
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